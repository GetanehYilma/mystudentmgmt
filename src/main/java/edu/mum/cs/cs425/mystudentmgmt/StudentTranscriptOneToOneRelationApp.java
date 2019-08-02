package edu.mum.cs.cs425.mystudentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.mystudentmgmt.model.Student;
import edu.mum.cs.cs425.mystudentmgmt.model.Transcript;
import edu.mum.cs.cs425.mystudentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.mystudentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class StudentTranscriptOneToOneRelationApp implements CommandLineRunner {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TranscriptRepository transcriptRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentTranscriptOneToOneRelationApp.class, args);

	}
	
	@Override
	public void run(String... args) throws Exception {
		
//		studentRepository.deleteAll();
//		transcriptRepository.deleteAll();
		
		Student s = new Student("000-61-001", "Anna", "Lynn", 
				"Smith", 3.45f, LocalDate.of(2019, 5, 24));
		
		Transcript t = new Transcript("BS Computer Science");
		
		s.setTranscript(t);
		t.setStudent(s);
		
		studentRepository.save(s);
		//transcriptRepository.save(t);
		
	}

}
