package com.studentdemo.student.api;

import com.studentdemo.student.model.Student;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.studentdemo.student.service.StudentService;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-03-27T21:36:37.435+08:00")

@Controller
public class StudentApiController implements StudentApi {

    private static final Logger log = LoggerFactory.getLogger(StudentApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    StudentService service;

    @org.springframework.beans.factory.annotation.Autowired
    public StudentApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createStudent(@ApiParam(value = "Student object that needs to be added"  )  @Valid @RequestBody Student body) {
        service.addStudent(body);
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteStudent(@ApiParam(value = "Student id to delete",required=true) @PathVariable("id") Long id) {
        service.deleteStudent(id);
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Student> getStudentById(@ApiParam(value = "ID of Student to return",required=true) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {

                return ResponseEntity.ok().body(service.getStudentById(id).get());
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Student>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Student>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStudent(@ApiParam(value = "Student object that needs to be updated"  )  @Valid @RequestBody Student body) {
        service.updateStudent(body);
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
