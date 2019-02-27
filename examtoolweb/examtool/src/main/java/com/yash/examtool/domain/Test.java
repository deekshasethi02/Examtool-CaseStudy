package com.yash.examtool.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * This test model is the entity for this exam tool application, and contains
 * the required fields. It is used as a data traveller from layer to layer
 * 
 * @author deeksha.sethi
 *
 */
@Entity
@Table(name = "tests")
public class Test {
	/**
	 * id of test, this will be used as primary key it is auto incremented
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	/**
	 * name of the test
	 */
	@NotBlank(message = "Test name is required")
	private String testName;

	/**
	 * many to one mapping between test and category
	 */
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category testCategory;
	/**
	 * it tells about the start date of a particular test
	 */
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date start_date;

	/**
	 * it tells about the end date of a particular test
	 */
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date end_date;

	/**
	 * it tells when the test is created
	 */
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date created_At;

	/**
	 * updated date of test
	 * 
	 */
	@JsonFormat(pattern = "yyyy-mm-dd")
	private Date updated_At;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	
	}
	
	public String getTestName() {
		return testName;
	}

	public void setTestName(String testName) {
		this.testName = testName;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public Date getCreated_At() {
		return created_At;
	}

	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}

	public Date getUpdated_At() {
		return updated_At;
	}

	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}

	/**
	 * Life cycle hook it is called before persisting data
	 */
	@PrePersist
	public void onCreate() {
		this.created_At = new Date();
	}

	/**
	 * Life cycle hook it is called after updating data
	 */
	@PostUpdate
	public void onUpdate() {
		this.updated_At = new Date();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	/**
//	 * id of test
//	 */
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	
//	/**
//	 * name of test
//	 */
//	@NotBlank(message = "Test Name is required")
//	private String testName;
//	
//	/**
//	 * unique identifier of test
//	 */
//	@NotBlank(message = "Test identifier is required")
//	@Size(min =4, max=5, message = "Please provide 4 to 5 characters")
//	@Column(updatable = false, unique = true)
//	private String testIdentifier;
//
//	@ManyToOne
//	@JoinColumn(name = "category_id")
//	private Category testCategory;
//
//	/**
//	 * created date of test
//	 */
//	@JsonFormat(pattern = "yyyy-mm-dd")
//	private Date created_at;
//	/**
//	 * updated date of test
//	 */
//	@JsonFormat(pattern = "yyyy-mm-dd")
//	private Date updated_at;
//
//	
//	//Getter and setters
//	/**
//	 * getter for id
//	 * @return id
//	 */
//	public int getId() {
//		return id;
//	}
//
//	/**
//	 * setter for id
//	 * @param id
//	 */
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	/**
//	 * getter for test name
//	 * 
//	 * @return
//	 */
//	public String getTestName() {
//		return testName;
//	}
//
//	/**
//	 * setter for test name
//	 * 
//	 * @param testName
//	 */
//	public void setTestName(String testName) {
//		this.testName = testName;
//	}
//
//	public String getTestIdentifier() {
//		return testIdentifier;
//	}
//
//	public void setTestIdentifier(String testIdentifier) {
//		this.testIdentifier = testIdentifier;
//	}
//
//	public Category getTestCategory() {
//		return testCategory;
//	}
//
//	public void setTestCategory(Category testCategory) {
//		this.testCategory = testCategory;
//	}
//
//	/**
//	 * getter for created_at date
//	 * 
//	 * @return created_at
//	 */
//	public Date getCreated_at() {
//		return created_at;
//	}
//
//	/**
//	 * setter for created_at date
//	 * 
//	 * @param created_at
//	 */
//	public void setCreated_at(Date created_at) {
//		this.created_at = created_at;
//	}
//
//	/**
//	 * getter for updated_at date
//	 * 
//	 * @return updated_at
//	 */
//	public Date getUpdated_at() {
//		return updated_at;
//	}
//
//	/**
//	 * setter for updated_at date
//	 * 
//	 * @param updated_at
//	 */
//	public void setUpdated_at(Date updated_at) {
//		this.updated_at = updated_at;
//	}
//
//	/**
//	 * this method will be called before persisting data for created_at in database
//	 */
//	@PrePersist
//	public void onCreate() {
//		this.created_at = new Date();
//	}
//
//	/**
//	 * this method will be called after updating data on updated_at in database
//	 */
//	@PostUpdate
//	public void onUpdate() {
//		this.updated_at = new Date();
//	}


