package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String homeAdress;
	private String telefoneNumber;
	private String emailAdress;
	private String indexNum;
	private LocalDate signUpDate;
	private CurrentYear currentYear;
	private Status status;
	private float avrageMark;
	private List<Subject> listOfSubjects;
	
	public Student(String firstName, String lastName, LocalDate dateOfBirth, String homeAdress, String telefoneNumber,
			String emailAdress, String indexNum, LocalDate signUpDate, CurrentYear currentYear, Status status,
			float avrageMark) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.homeAdress = homeAdress;
		this.telefoneNumber = telefoneNumber;
		this.emailAdress = emailAdress;
		this.indexNum = indexNum;
		this.signUpDate = signUpDate;
		this.currentYear = currentYear;
		this.status = status;
		this.avrageMark = avrageMark;
		this.listOfSubjects= new ArrayList<Subject>();
		
		
	}

	public Student() {
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getIndexNum() {
		return indexNum;
	}

	public void setIndexNum(String indexNum) {
		this.indexNum = indexNum;
	}

	public LocalDate getSignUpDate() {
		return signUpDate;
	}

	public void setSignUpDate(LocalDate signUpDate) {
		this.signUpDate = signUpDate;
	}

	public CurrentYear getCurrentYear() {
		return currentYear;
	}

	public void setCurrentYear(CurrentYear currentYear) {
		this.currentYear = currentYear;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public float getAvrageMark() {
		return avrageMark;
	}

	public void setAvrageMark(float avrageMark) {
		this.avrageMark = avrageMark;
	}

	public List<Subject> getListOfSubjects() {
		return listOfSubjects;
	}

	public void setListOfSubjects(List<Subject> listOfSubjects) {
		this.listOfSubjects = listOfSubjects;
	}
	
	
	
	
	
	
}
