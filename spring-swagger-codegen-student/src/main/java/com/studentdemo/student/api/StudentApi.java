/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.studentdemo.student.api;

import com.studentdemo.student.model.Student;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-03-27T21:36:37.435+08:00")

@Api(value = "student", description = "the student API")
public interface StudentApi {

    @ApiOperation(value = "Add Student", nickname = "createStudent", notes = "adding student", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/student",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> createStudent(@ApiParam(value = "Student object that needs to be added"  )  @Valid @RequestBody Student body);


    @ApiOperation(value = "Deletes a Student", nickname = "deleteStudent", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid Student Id") })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        consumes = { "multipart/form-data" },
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteStudent(@ApiParam(value = "Student id to delete",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "Find student by ID", nickname = "getStudentById", notes = "Returns a single Student", response = Student.class, tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Student.class),
        @ApiResponse(code = 400, message = "Invalid Student ID supplied"),
        @ApiResponse(code = 404, message = "Student not found") })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Student> getStudentById(@ApiParam(value = "ID of Student to return",required=true) @PathVariable("id") Long id);


    @ApiOperation(value = "Update an existing Student", nickname = "updateStudent", notes = "", tags={ "student", })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid Student ID"),
        @ApiResponse(code = 404, message = "Student not found"),
        @ApiResponse(code = 405, message = "Validation exception") })
    @RequestMapping(value = "/student/{id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateStudent(@ApiParam(value = "Student object that needs to be updated"  )  @Valid @RequestBody Student body);

}