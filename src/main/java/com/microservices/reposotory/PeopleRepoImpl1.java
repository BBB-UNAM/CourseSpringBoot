package com.microservices.reposotory;

import com.microservices.CourseSpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("person1")
public class PeopleRepoImpl1 implements InterfacePeopleRepo {

    private static Logger LOG =  LoggerFactory.getLogger(CourseSpringBootApplication.class);

    @Override
    public void register(String name) {
        LOG.info("Se registro a people 1: " + name);
    }
}
