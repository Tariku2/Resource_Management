package com.ta.server.service.serviceImpl;

import com.ta.server.enumeration.Status;
import com.ta.server.model.Server;
import com.ta.server.repo.ServerRepo;
import com.ta.server.service.serverService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import java.util.Random;

import static com.ta.server.enumeration.Status.SERVER_DOWN;
import static java.util.stream.DoubleStream.of;

//Lombok is gonna create a constructor and put the field   private ServerRepo serverRepo; inside the constructor
@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class serverServiceImpl implements serverService {
    private ServerRepo serverRepo;


    @Override
    public Server create(Server server) {
        log.info("Saving new server:{}",server.getName());
        server.setImageUrl(setServerImgeUrl());

        return serverRepo.save(server);
    }
    public Server ping(String iPAddress) throws IOException {
        log.info("Pinging new server:{}",iPAddress);
        Server server=serverRepo.findByIpAddress(iPAddress);
        InetAddress address=InetAddress.getByName(String.valueOf(iPAddress));
        server.setStatus(address.isReachable(1000)? Status.SERVER_UP:SERVER_DOWN);
        serverRepo.save(server);

        return server;
}


    @Override
    public Collection<Server> list(int limit) {
        log.info("Fetching all servers");
        return serverRepo.findAll((Pageable) of(0,limit)).toList();
    }

    @Override
    public Server get(Long id) {
        log.info("Fetching server by Id:()",id);
        return serverRepo.findById(id).get();
    }

    @Override
    public Server update(Server server) {
        log.info("updating the server:{}",server.getName());

        return serverRepo.save(server);
    }

    @Override
    public boolean delete(Long id) {
        log.info("Deleting server by Id:()",id);
        serverRepo.deleteById(id);
        return true;
    }
    private String setServerImgeUrl() {
        String[]imageNames={"s1.png","s2.png","s3.png","s4.png"};
        return ServletUriComponentsBuilder.fromCurrentContextPath().path("D:/Intelij-Workspace/server/SeverImages"+imageNames(new Random().nextInt(4))).toUriString();
    }

    private String imageNames(int nextInt) {
        return  null;
    }
}
