package com.capg.Service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.capg.Repository.TestDAO;
import com.capg.Service.TestService;
import com.capg.Model.Test;


@Service
public class TestServiceimpl implements TestService {
	@Autowired
	TestDAO testRepo;
	public Test addTest(Test test) {
		Test ts=testRepo.save(test);
		return ts;
	}
	@Override
	public Optional<Test> findByTest_Id(long test_id) {
		// TODO Auto-generated method stub
		return testRepo.findById(test_id);
	}
	
	
}
