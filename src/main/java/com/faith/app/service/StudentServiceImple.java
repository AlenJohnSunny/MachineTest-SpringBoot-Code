package com.faith.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.faith.app.dao.StudentRepository;
import com.faith.app.entity.Student;

@Service
public class StudentServiceImple implements IStudentService {
	
	@Autowired
	private StudentRepository studentRepo;

	@Override
	public List<Student> getStudent() {
		return (List<Student>) studentRepo.findAll();
	}

}
