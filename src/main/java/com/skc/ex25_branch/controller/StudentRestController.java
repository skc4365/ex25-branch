package com.skc.ex25_branch.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skc.ex25_branch.dao.MyStudent;
import com.skc.ex25_branch.domain.Student;
import com.skc.ex25_branch.service.StudentService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class StudentRestController {
	
	private final StudentService studentService;
	
//	http://localhost:8085/api/students
	@GetMapping
	public List<Student> list() {
		return studentService.getAllStudents();
	}
	
//	http://localhost:8085/api/students/29
	@GetMapping("/{id}")
	public ResponseEntity<Student> detail(@PathVariable Long id){
		Student student = studentService.getStudent(id);
		
		return ResponseEntity.ok(student);
	}
	
//	http://localhost:8085/api/students 포스맨 POSTMAN으로 
//	등록 :POST http://localhost:8080/api/students
//	{
//		"name":"테스트3",
//		"email":"kk@nate.com",
//		"age":25
//	}
	@PostMapping
	public ResponseEntity<Student> create(@RequestBody Student student) {
		
		studentService.createStudent(student);
		return ResponseEntity.ok(student);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Student> update(@PathVariable Long id, @RequestBody Student student) {
		student.setId(id);
		studentService.updateStudent(student);
		return ResponseEntity.ok(student);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id){
		studentService.deleteStudent(id);
		return ResponseEntity.ok().build();
		
	}
	
	
	
//	@GetMapping
//	public String list() {
//		return "test";
//	}
	
//	@GetMapping
//	public String list() {
//		return studentService.getMyString();
//	}
	
//	@GetMapping
//	public Integer list() {
//		return studentService.getMyInteger();
//	}
	
//	@GetMapping
//	public MyStudent myStudent() {
//		return studentService.getStudent();
//	}
	
//	@GetMapping
//	public String myStudent() {
//		return studentService.getStudentName();
//	}
	
	
	
	
	

}
