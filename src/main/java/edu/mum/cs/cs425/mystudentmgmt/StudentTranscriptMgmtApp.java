package edu.mum.cs.cs425.mystudentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.mystudentmgmt.model.Student;
import edu.mum.cs.cs425.mystudentmgmt.model.Transcript;
import edu.mum.cs.cs425.mystudentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class StudentTranscriptMgmtApp implements CommandLineRunner {
	
	@Autowired
	private TranscriptRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(StudentTranscriptMgmtApp.class, args);

	}
	
	@Override
	public void run(String... args) {

//		Transcript t = new Transcript("BS Computer Science");
//		
//		Transcript savedTranscript = saveTranscript(t);
//		System.out.println(savedTranscript);
		
	}
	
	Transcript saveTranscript(Transcript t) {
		return repository.save(t);
	}

}
