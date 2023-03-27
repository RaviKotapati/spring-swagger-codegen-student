package com.studentdemo.student.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Student
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-03-27T21:36:37.435+08:00")

public class Student   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("studentName")
  private String studentName = null;

  @JsonProperty("grade")
  private String grade = null;

  @JsonProperty("address")
  private String address = null;

  public Student id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Student studentName(String studentName) {
    this.studentName = studentName;
    return this;
  }

  /**
   * Student Name
   * @return studentName
  **/
  @ApiModelProperty(value = "Student Name")


  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public Student grade(String grade) {
    this.grade = grade;
    return this;
  }

  /**
   * Grade of student
   * @return grade
  **/
  @ApiModelProperty(value = "Grade of student")


  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    this.grade = grade;
  }

  public Student address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Address of student
   * @return address
  **/
  @ApiModelProperty(value = "Address of student")


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return Objects.equals(this.id, student.id) &&
        Objects.equals(this.studentName, student.studentName) &&
        Objects.equals(this.grade, student.grade) &&
        Objects.equals(this.address, student.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, studentName, grade, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Student {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    studentName: ").append(toIndentedString(studentName)).append("\n");
    sb.append("    grade: ").append(toIndentedString(grade)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

