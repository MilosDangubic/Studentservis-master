package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Professor implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 060402L;
	private String firstName;
	private String lastName;
	private LocalDate dayOfBirth;
	private String homeAdress;
	private String telefoneNumber;
	private String emailAdress;
	private String workAdress;
	private String idNumber;
	private String title;
	private String position;
	private List<Subject> listOfSubjects;
	
	public Professor(String firstName, String lastName, LocalDate dayOfBirth, String homeAdress, String telefoneNumber,
			String emailAdress, String workAdress, String idNumber, String title, String called) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dayOfBirth = dayOfBirth;
		this.homeAdress = homeAdress;
		this.telefoneNumber = telefoneNumber;
		this.emailAdress = emailAdress;
		this.workAdress = workAdress;
		this.idNumber = idNumber;
		this.title = title;
		this.position = called;
		this.listOfSubjects = new ArrayList<Subject>();
	}

	public Professor() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(LocalDate dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public String getHomeAdress() {
		return homeAdress;
	}

	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}

	public String getTelefoneNumber() {
		return telefoneNumber;
	}

	public void setTelefoneNumber(String telefoneNumber) {
		this.telefoneNumber = telefoneNumber;
	}

	public String getEmailAdress() {
		return emailAdress;
	}

	public void setEmailAdress(String emailAdress) {
		this.emailAdress = emailAdress;
	}

	public String getWorkAdress() {
		return workAdress;
	}

	public void setWorkAdress(String workAdress) {
		this.workAdress = workAdress;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String called) {
		this.position = called;
	}

	public List<Subject> getListOfSubjects() {
		return listOfSubjects;
	}

	public void setListOfSubjects(List<Subject> listOfSubjects) {
		this.listOfSubjects = listOfSubjects;
	}
	
	
	
	
	
	
}
