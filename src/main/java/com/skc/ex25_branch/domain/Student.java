package com.skc.ex25_branch.domain;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Student {

//	머지테스트
	private Long id;
	private String name;
	private String email;
	private Integer age;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
}
