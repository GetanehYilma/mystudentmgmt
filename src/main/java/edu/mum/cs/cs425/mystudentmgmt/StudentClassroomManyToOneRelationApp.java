package edu.mum.cs.cs425.mystudentmgmt;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.mystudentmgmt.model.Classroom;
import edu.mum.cs.cs425.mystudentmgmt.model.Student;
import edu.mum.cs.cs425.mystudentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.mystudentmgmt.repository.StudentRepository;

@SpringBootApplication
public class StudentClassroomManyToOneRelationApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentClassroomManyToOneRelationApp.class, args);

	}
		
	@Autowired
	private ClassroomRepository roomRepository;
//	@Autowired
//	private StudentRepository studentRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s = new Student("000-61-002", "Abebe", "Beso", 
				"Bela", 3.45f, LocalDate.of(2019, 8, 3));
		Classroom c = new Classroom("McLaughlin building", "M105");
		
		s.setClassroom(c);
		List<Student> st = new ArrayList<Student>();
		st.add(s);
		c.setStudents(st);
		//c.getStudents().add(s);
		
		roomRepository.save(c);
		
	}

}
