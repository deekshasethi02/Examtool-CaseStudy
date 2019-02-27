package com.yash.examtool.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.yash.examtool.domain.Test;
/**
 * This repository is responsible to perform crud operations
 * @author deeksha.sethi
 *
 */
@Repository
public interface TestRepository extends CrudRepository<Test, Long>{
		
//	Test findByTestIdentifier(String testidentifier);
//		Iterable<Test> findAll();
	
	
}
