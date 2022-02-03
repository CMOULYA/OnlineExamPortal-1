package com.capg.Model;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="course")

public class Course {
	@Id	
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name="courseid",length=200,unique=true)
	private int courseId;

	
	@Column(name="courseType",length=200,unique=true)
	private String courseType;
	
	@OneToOne(cascade=CascadeType.ALL,mappedBy="course")
	private Test test;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseType() {
		return courseType;
	}

	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseType=" + courseType + ", test=" + test + "]";
	}
	
	
	


}
