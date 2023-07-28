package Controller;

import lombok.extern.slf4j.Slf4j;
import Entity.File;
import model.FileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import service.FileUploadService;


import java.io.IOException;
@RestController
@RequestMapping("/files")
@Slf4j
public class FileUploadController {
  @Autowired
  private FileUploadService fileUploadService;
  public FileUploadController(FileUploadService fileUploadService){
   this.fileUploadService=fileUploadService;

  }

    @PostMapping("/uploadFile")
    public FileUpload uploadFile(
            @RequestParam("multipartFile") MultipartFile multipartFile) throws Exception {

        File file = null;
        String donloadURI="";
        file = fileUploadService.saveFile(multipartFile);
        donloadURI= ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/download/")
                .path(file.getId())
                .toUriString();
        return  new FileUpload(file.getFileName(),donloadURI,multipartFile
                .getContentType(),multipartFile.getSize());



    }
    @GetMapping("/download/{fileId}")
    public ResponseEntity<Resource>downlaodFile(@PathVariable String fileId) throws Exception {
        File file=null;
        file=fileUploadService.getFile(fileId);
        return ResponseEntity.ok().
                contentType(MediaType.parseMediaType(file.getFileType())).
                header(HttpHeaders.CONTENT_DISPOSITION,"file;fileName=\""
                        +file.getFileName()+ "\"")
                .body(new ByteArrayResource(file.getData()));

    }
}

