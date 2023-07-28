package com.ta.server.service;

import com.ta.server.model.Server;

import java.util.Collection;

public interface serverService {
    Server create(Server server);

       Collection<Server> list(int limit) ;
       Server get(Long id);
       Server update(Server server);
       boolean delete(Long id);



}
