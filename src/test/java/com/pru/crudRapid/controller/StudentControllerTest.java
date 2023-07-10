package com.pru.crudRapid.controller;

import com.pru.crudRapid.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentControllerTest {

    private TestRestTemplate testRestTemplate;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @LocalServerPort
    private int port;
    @BeforeEach
    void setUp(){
         restTemplateBuilder = restTemplateBuilder.rootUri("http://localhost:" + port);
         testRestTemplate = new TestRestTemplate(restTemplateBuilder);
    }

    @Test
    void getAll() {
        ResponseEntity<Student[]> response =
                testRestTemplate.getForEntity("http://api/v1/students", Student[].class);
        assertEquals( HttpStatus.OK ,  response.getStatusCode() );
        assertEquals(200, response.getStatusCodeValue());

        List<Student>students = Arrays.asList(response.getBody());
        System.out.println(students.size());

    }


    @Test
    void getById() {
    }

    @Test
    void saveUpdate() {
    }
}