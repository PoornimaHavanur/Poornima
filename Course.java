package com.javainuse.model1;

import java.util.Set;

import javax.persistence.*;

@Entity
public class Course {
    @Id	
	private long Courseid;
	
    @Column(name="Coursename")
	private String Coursename; 
    
    @Column(name="Studentid")
    private String Studentid; 
     
	public Course() {
	}

	public Course(String Coursename) {
		this.Coursename = Coursename;
	}     

    public long getCourseid() {
		return Courseid;
	}

	public String getCourseName() {
		return Coursename;
	}

	public void setCoursename(String Coursename) {
		this.Coursename = Coursename;
	}	
    
    public void setCourseid(long courseid) {
		Courseid = courseid;
	}

	@ManyToMany(mappedBy = "courses")  
    
    private Set<Student> students;  
    
    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }	
}


