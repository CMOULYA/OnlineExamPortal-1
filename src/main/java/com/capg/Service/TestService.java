package com.capg.Service;

import java.util.Optional;

import com.capg.Model.Test;

public interface TestService {
	public Test addTest(Test test);
	
	public Optional<Test> findByTest_Id(long test_id);
}
