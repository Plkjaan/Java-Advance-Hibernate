package com.cdac.hibernate.association.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="Cource_OneToMany")
public class Cource {
	
	@Id
	private Integer courceId;

	private String courseName;
	private String courseDuration;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="CID")
	@OrderColumn(name="type")

	private Set<Student> student;

	public Integer getCourceId() {
		return courceId;
	}

	public void setCourceId(Integer courceId) {
		this.courceId = courceId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDuration() {
		return courseDuration;
	}

	public void setCourseDuration(String courseDuration) {
		this.courseDuration = courseDuration;
	}


	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Cource [courceId=" + courceId + ", courseName=" + courseName + ", courseDuration=" + courseDuration
				+ ", student=" + student + "]";
	}
	
		
}
