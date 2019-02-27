package com.yash.examtool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.examtool.domain.Test;
import com.yash.examtool.exception.TestIdException;
import com.yash.examtool.repository.TestRepository;
import com.yash.examtool.service.TestService;
/**
 * This service is responsible to perform business logic 
 * @author deeksha.sethi
 *
 */
@Service
public class TestService {
	/**
	 * it will create object at runtime inject collaborating beans into one bean
	 */
	@Autowired
	private TestRepository testRepository;
	
	/**
	 * it will save the tests to the list in the application
	 * @param test
	 * @return
	 */
	public Test saveOrUpdate(Test test) {
		return testRepository.save(test);
	}

	/**
	 * it will delete the tests from the list
	 * @param id
	 */
	public void delete(Long id) {
		testRepository.deleteById(id);
	}

	/**
	 * it will update the details of the test in the application
	 * @param id
	 * @param test
	 * @return
	 */
	public Test saveOrUpdate(Long id, Test test) {
		Test tempTest = testRepository.findById(id).get();
		tempTest = test;
		return testRepository.save(tempTest);
	}

	/**
	 * it will give the list of all the tests 
	 * @return
	 */
	public List<Test> getAllTests() {
		List<Test> list = new ArrayList<>();
		testRepository.findAll().forEach(e -> list.add(e));
		return list;
	}
	
	
	
//	@Autowired
//	private TestRepository testRepository;
//
//	public Test saveOrUpdate(Test test) {
//		try {
//			test.setTestIdentifier(test.getTestIdentifier().toUpperCase());
//			return testRepository.save(test);
//
//		} catch (Exception ex) {
//			throw new TestIdException("Test Id :'" + test.getTestIdentifier() + "'already exists");
//		}
//	}
//	
//	public Test findTestByIdentifier(String testIdentifier) {
//		Test test =  testRepository.findByTestIdentifier(testIdentifier.toUpperCase());
//		if(test==null) {
//			throw new TestIdException("Test id :'"+testIdentifier.toUpperCase()+"'does not  exist");
//		}
//		 
//		 return test;
//	}

//	 public List<Test> getAllTests() {
//	 List<Test> list = new ArrayList<>();
//	 testRepository.findAll().forEach(e -> list.add(e));
//	 return list;
//	 }

//	public Iterable<Test> findAllTests() {
//		return testRepository.findAll();
//	}
//	
//	public void deleteTestByIdentifier(String testIdentifier) {
//		Test test =testRepository.findByTestIdentifier(testIdentifier.toUpperCase());
//		if(test==null) {
//			throw new TestIdException("Test id :'"+testIdentifier.toUpperCase()+"'does not  exist");
//		}
//		 
//		 testRepository.delete(test);
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
