package edu.mum.cs.cs425.mystudentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.mystudentmgmt.model.Student;
import edu.mum.cs.cs425.mystudentmgmt.repository.StudentRepository;




@SpringBootApplication
public class MystudentmgmtApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(MystudentmgmtApplication.class, args);
		
		
		
	}
	
	@Override
	public void run(String... args) throws Exception {
//		Student s = new Student("000-61-001", "Anna", "Lynn", 
//				"Smith", 3.45f, LocalDate.of(2019, 5, 24));
//		Student savedStudent =  saveStudent(s);
//		System.out.println(savedStudent);
	}
	
	Student saveStudent(Student s){
		
		return repo.save(s);
	}

}
