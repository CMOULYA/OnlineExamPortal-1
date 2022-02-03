package com.capg.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

import com.capg.Exception.RecordNotFoundException;
import com.capg.Model.Test;
import com.capg.Service.TestService;


@RestController
public class TestRestController {
	@Autowired
	TestService service;
	@PostMapping("/test")
	public ResponseEntity<Test> createTest(@Validated @RequestBody Test test){
		System.out.println("Rest");
		System.out.println(test);
		Test mv=service.addTest(test);
		return new ResponseEntity<Test>(mv,HttpStatus.OK);
	}
	@GetMapping("/test/{test_id}")
	public ResponseEntity<Test> getByTest_Id(@PathVariable long test_id)
	{
		Optional<Test> test=service.findByTest_Id(test_id);
		
		if(test.isPresent()) {
			return new ResponseEntity<Test>(test.get(), HttpStatus.OK);
		}
		else {
			throw new RecordNotFoundException("Record not found...");
		}
	}
		
}

