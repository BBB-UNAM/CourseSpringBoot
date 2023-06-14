package com.microservices.services;

import com.microservices.reposotory.InterfacePeopleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements InterfacePeopleService{

    @Autowired
    @Qualifier("person2")
    private InterfacePeopleRepo repo;
    @Override
    public void register(String name) {
        //repo = new PeopleRepoImpl();
        repo.register(name);
    }
}
