package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Subject implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2508998L;
	private String idOfSubject;
	private String nameOfSubject;
	private Semestar semestar;
	private CurrentYear yearOfListening;
	private Professor professor;
	private List<Student> listOfStudents;
	
	public Subject(String idOfSubject, String nameOfSubject, Semestar semestar, CurrentYear yearOfListening,
			Professor professor) {
		super();
		this.idOfSubject = idOfSubject;
		this.nameOfSubject = nameOfSubject;
		this.semestar = semestar;
		this.yearOfListening = yearOfListening;
		this.professor = professor;
		this.listOfStudents = new ArrayList<Student>();
	}

	public Subject() 
	{
		// TODO Auto-generated constructor stub
		this.listOfStudents= new ArrayList<Student>();
	}

	public String getIdOfSubject() {
		return idOfSubject;
	}

	public void setIdOfSubject(String idOfSubject) {
		this.idOfSubject = idOfSubject;
	}

	public String getNameOfSubject() {
		return nameOfSubject;
	}

	public void setNameOfSubject(String nameOfSubject) {
		this.nameOfSubject = nameOfSubject;
	}

	public Semestar getSemestar() {
		return semestar;
	}

	public void setSemestar(Semestar semestar) {
		this.semestar = semestar;
	}

	public CurrentYear getYearOfListening() {
		return yearOfListening;
	}

	public void setYearOfListening(CurrentYear yearOfListening) {
		this.yearOfListening = yearOfListening;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public List<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(List<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
	}
	
	
	
}
