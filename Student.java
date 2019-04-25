package com.javainuse.model1;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity

public class Student {
	 
	private Set<Course> courses = new HashSet<Course>(0);    
    
    public Student() {
    }

	public Student(String StudentName) {
		super();
		this.StudentName=StudentName;
	}

    @Id
    private long Studentid;	
    
	public long getStudentId() {
		return Studentid;
	}

	public void setStudentId(long Studentid) {
		this.Studentid = Studentid;
	}

    @Column(name = "StudentName")
    private String StudentName; 
    
	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String StudentName) {
		this.StudentName = StudentName;
	}


	@ManyToMany(cascade = CascadeType.MERGE)
	@JoinTable(name = "student_course", joinColumns = { @JoinColumn(name = "Studentid") }, inverseJoinColumns = { @JoinColumn(name = "Courseid") })
	
	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	
	}	

