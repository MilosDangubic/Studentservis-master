package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.swing.AbstractAction;
import javax.swing.JOptionPane;

import model.Professor;
import model.Student;
import model.Subject;
import view.MainWindow;
import view.MainWindowComponents;

public class SearchContoler
{
	public static void search(String search) 
	{
		Map<String, String> map = new HashMap<String, String>();
		int i = MainWindowComponents.getTabbedPane().getSelectedIndex();
		if(search.isEmpty()) {
			switch(i) {
			case 0:
				MainWindowComponents.setSearchedDataStudent(MainWindow.getInstance().getModel().getListOfStudent());
				break;
			case 1:
				MainWindowComponents.setSearchedDataProfesor(MainWindow.getInstance().getModel().getListOfProfessor());
				break;
			case 2:
				MainWindowComponents.setSearchedDataPredmet(MainWindow.getInstance().getModel().getListOfSubject());
			}
			
			return;
		}
		
		try {
			String[] categories = search.split(";");
			for(String s : categories) {
				String[] condition = s.split(":");
				System.out.println("key=" + condition[0] + " value=" + condition[1]);
				map.put(condition[0], condition[1]);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Parametri nisu dobro napisani! Moraju biti u obliku key:value;key:value...");
			System.out.println("Ne valjaju parametri!");
		}
		
		switch(i) {
		case 0:
			searchStudent(map);
			break;
		case 1:
			searchProfesor(map);
			break;
		case 2:
			searchPredmet(map);
		}
		
		
		
	}
	
	
	
	private static void searchStudent(Map<String, String> conditions) {
		List<Student> students = new ArrayList<Student>(MainWindow.getInstance().getModel().getListOfStudent());
		List<Student> studentsPom = new ArrayList<Student>();
		for (Map.Entry<String,String> entry : conditions.entrySet()) {  
            if(entry.getKey().toLowerCase().equals("firstname")) {
            	for(Student s : students){
            		if(s.getFirstName().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("lastname")) {
            	for(Student s : students){
            		if(s.getLastName().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("index")) {
            	for(Student s : students){
            		if(s.getIndexNum().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("index")) {
            	for(Student s : students){
            		if(s.getIndexNum().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("yearofstudy")) {
            	for(Student s : students){
            		if(s.getCurrentYear().toString().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("status")) {
            	for(Student s : students){
            		if(s.getStatus().toString().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("averagemark")) {
            	for(Student s : students){
            		if(Float.toString(s.getAvrageMark()).equals(entry.getValue())) {
            			studentsPom.add(s);
            		}
            	}
            	students.clear();
            	students = new ArrayList<Student>(studentsPom);
            	studentsPom.clear();
            }
           
		}
		MainWindowComponents.setSearchedDataStudent(students);
	}

	private static void searchProfesor(Map<String, String> conditions) {
		List<Professor> profesors = new ArrayList<Professor>(MainWindow.getInstance().getModel().getListOfProfessor());
		List<Professor> profesorsPom = new ArrayList<Professor>();
		for (Map.Entry<String,String> entry : conditions.entrySet()) {  
            if(entry.getKey().toLowerCase().equals("firstname")) {
            	for(Professor p : profesors){
            		if(p.getFirstName().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			profesorsPom.add(p);
            		}
            	}
            	profesors.clear();
            	profesors = new ArrayList<Professor>(profesorsPom);
            	profesorsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("lastname")) {
            	for(Professor p : profesors){
            		if(p.getLastName().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			profesorsPom.add(p);
            		}
            	}
            	profesors.clear();
            	profesors = new ArrayList<Professor>(profesorsPom);
            	profesorsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("workadress")) {
            	for(Professor p : profesors){
            		if(p.getWorkAdress().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			profesorsPom.add(p);
            		}
            	}
            	profesors.clear();
            	profesors = new ArrayList<Professor>(profesorsPom);
            	profesorsPom.clear();
            }
            if(entry.getKey().toLowerCase().equals("title")) {
            	for(Professor p : profesors){
            		if(p.getTitle().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			profesorsPom.add(p);
            		}
            	}
            	profesors.clear();
            	profesors = new ArrayList<Professor>(profesorsPom);
            	profesorsPom.clear();
            }
            
           
		}
		MainWindowComponents.setSearchedDataProfesor(profesors);
	}
	

	private static void searchPredmet(Map<String, String> conditions) {
		List<Subject> predmeti = new ArrayList<Subject>(MainWindow.getInstance().getModel().getListOfSubject());
		List<Subject> predmetiPom = new ArrayList<Subject>();
		for (Map.Entry<String,String> entry : conditions.entrySet()) {  
            if(entry.getKey().toLowerCase().equals("subjectname")) {
            	for(Subject p : predmeti){
            		if(p.getNameOfSubject().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			predmetiPom.add(p);
            		}
            	}
            	predmeti.clear();
            	predmeti = new ArrayList<Subject>(predmetiPom);
            	predmetiPom.clear();
            }     
            if(entry.getKey().toLowerCase().equals("subjectid")) {
            	for(Subject p : predmeti){
            		if(p.getIdOfSubject().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			predmetiPom.add(p);
            		}
            	}
            	predmeti.clear();
            	predmeti = new ArrayList<Subject>(predmetiPom);
            	predmetiPom.clear();
            }    
            if(entry.getKey().toLowerCase().equals("yearofstudy")) {
            	for(Subject p : predmeti){
            		if(p.getYearOfListening().toString().toLowerCase().equals(entry.getValue().toLowerCase())) {
            			predmetiPom.add(p);
            		}
            	}
            	predmeti.clear();
            	predmeti = new ArrayList<Subject>(predmetiPom);
            	predmetiPom.clear();
            }    
		}
		MainWindowComponents.setSearchedDataPredmet(predmeti);
	}
	
}
