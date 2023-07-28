package com.ta.server.Resource;

import com.ta.server.enumeration.Status;
import com.ta.server.model.Response;
import com.ta.server.model.Server;
import com.ta.server.service.serviceImpl.serverServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.ServerResponse;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;

import static com.ta.server.enumeration.Status.*;
import static java.time.LocalDateTime.now;
import static java.util.Map.of;
import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.IMAGE_PNG_VALUE;
import static org.springframework.web.servlet.function.ServerResponse.status;

@RestController
@RequestMapping("/server")
@RequiredArgsConstructor
public class ServerResource {
    private final serverServiceImpl serverService;


    @GetMapping("/list")
    public ResponseEntity<Response> getServer(){
        return ResponseEntity.ok(Response.builder().timeStamp(now()).data(Map.of("Servers",serverService.list(30)))
                .message("server retrieved")
                .status(OK)
                .StatusCode(OK.value()).build());
    }
    @GetMapping("/Ping/(ipAddress)")
    public ResponseEntity<Response> PingServer(@PathVariable("ipAddress")String ipAddress) throws IOException {
        Server server=serverService.ping(ipAddress);
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .data(Map.of("Servers",server))
                .message(server.getStatus()==SERVER_UP? "Ping Success":"Ping failed")
                .status(OK)
                .StatusCode(OK.value()).build());
    }
    @PostMapping("/save")
    public ResponseEntity<Response> saveServer(@RequestBody@Valid Server server) throws IOException {
        return ResponseEntity.ok(Response.builder()
                .timeStamp(now())
                .data(Map.of("Servers",serverService.create(server)))
                .message("Server Created")
                .status(CREATED)
                .StatusCode(CREATED.value()).build());
    }
    @GetMapping("/get/(id)")
    public ResponseEntity<Response> getServer(@PathVariable("id")Long id)  {
        return ResponseEntity.ok(
                Response
            .builder()
                .timeStamp(now())
                .data(of("Servers",serverService.get(id)))
                .message("Server retrieved")
                .status(OK)
                .StatusCode(OK.value()).build());
    }

    @DeleteMapping("/delete/(id)")
    public ResponseEntity<Response> deleteServer(@PathVariable("id")Long id)  {
        return ResponseEntity.ok(
                Response
                        .builder()
                        .timeStamp(now())
                        .data(of("deleted",serverService.delete(id)))
                        .message("server deleted")
                        .status(OK)
                        .StatusCode(OK.value()).build());
    }

    @GetMapping(path="SeverImages(fileName)",produces = IMAGE_PNG_VALUE)
    public byte[] getServerImages(@PathVariable("fileName")String fileName) throws IOException {
        return Files.readAllBytes(Paths.get(System.getProperty("Users.home"+"D:/Intelij-Workspace/server/SeverImages/"+fileName)));

    }
}
