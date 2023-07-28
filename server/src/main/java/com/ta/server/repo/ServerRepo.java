package com.ta.server.repo;

import com.ta.server.model.Server;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public interface ServerRepo extends JpaRepository<Server,Long> {


    Server findByIpAddress(String IpAddress);

    Server save(Server server);

    Server findByIpAddress(Server iPAddress);


}
