package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Model implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 100574L;
	private List<Professor> listOfProfessor;
	private List<Student> listOfStudent;
	private List<Subject> listOfSubject;
	
	public Model()
	{
		listOfProfessor = new ArrayList<Professor>();
		listOfStudent = new ArrayList<Student>();
		listOfSubject = new ArrayList<Subject>();
	}

	public List<Professor> getListOfProfessor() {
		return listOfProfessor;
	}

	public void setListOfProfessor(List<Professor> listOfProfessor) {
		this.listOfProfessor = listOfProfessor;
	}

	public List<Student> getListOfStudent() {
		return listOfStudent;
	}

	public void setListOfStudent(List<Student> listOfStudent) {
		this.listOfStudent = listOfStudent;
	}

	public List<Subject> getListOfSubject() {
		return listOfSubject;
	}

	public void setListOfSubject(List<Subject> listOfSubject) {
		this.listOfSubject = listOfSubject;
	}
	
	
}
