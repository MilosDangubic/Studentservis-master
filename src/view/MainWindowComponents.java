package view;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.DefaultTableModel;

import controller.DeleteStudentSubjectContoler;
import model.Professor;
import model.Student;
import model.Subject;
import view.add_studentToSubject.SubjectStudentWindow;

public class MainWindowComponents extends JPanel
{
	private static final long serialVersionUID = 3213213L;
	private static JTable tableStudents;
	private static JTable tableProfessors;
	private static JTable tableSubjects;
	private static JTabbedPane tabbedPane;
	private static DefaultTableModel modelTableStudents;
	private static DefaultTableModel modelTableProfessors;
	private static DefaultTableModel modelTableSubjects;
	
	
	public MainWindowComponents() 
	{
		this.setLayout(new BorderLayout());
		tabbedPane= new JTabbedPane();
		
		tabbedPane.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent arg0) {
				int sel = tabbedPane.getSelectedIndex();
				
				if(sel == 2) {
					ToolBar.getBtnAddStudent().setVisible(true);
					ToolBar.getBtnAddProfessor().setVisible(true);
					ToolBar.getBtnDeleteProfessor().setVisible(true);
				} else {
					ToolBar.getBtnAddStudent().setVisible(false);
					ToolBar.getBtnAddProfessor().setVisible(false);
					ToolBar.getBtnDeleteProfessor().setVisible(false);
				}
			}
			
		});
		
		
		JPanel studentsPanel= new JPanel();
		studentsPanel.setLayout(new BorderLayout());
		
		
		JPanel professorPanel= new JPanel();
		professorPanel.setLayout(new BorderLayout());
		

		JPanel subjectPanel= new JPanel();
		subjectPanel.setLayout(new BorderLayout());

		
		Object[] headersStudents= {"Index","First Name","Last Name","Year of study","Status","Avrage mark"};
		modelTableStudents= new DefaultTableModel(headersStudents,0);
		tableStudents= new JTable(modelTableStudents);
		tableStudents.setAutoCreateRowSorter(true);
		JScrollPane studenstScrollPane= new  JScrollPane(tableStudents);
		studentsPanel.add(studenstScrollPane,BorderLayout.CENTER);
		
		
		Object[] headerProfessor= {"First Name","Last Name","Work adress","Title"};
		modelTableProfessors= new DefaultTableModel(headerProfessor,0);
		tableProfessors= new JTable(modelTableProfessors);
		tableProfessors.setAutoCreateRowSorter(true);
		JScrollPane professorScrollPane= new  JScrollPane(tableProfessors);
		professorPanel.add(professorScrollPane,BorderLayout.CENTER);
		
		Object[] headersSubject= {"ID of subject","Name of subject","Semestar","From which year it is","Proffesor","List of students"};
		modelTableSubjects= new DefaultTableModel(headersSubject,0);
		tableSubjects= new JTable(modelTableSubjects);
		tableSubjects.setAutoCreateRowSorter(true);
		JScrollPane subjectstScrollPane= new  JScrollPane(tableSubjects);
		subjectPanel.add(subjectstScrollPane,BorderLayout.CENTER);
		
		tableSubjects.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
		    public void mouseClicked(java.awt.event.MouseEvent evt) {
		        int row = tableSubjects.rowAtPoint(evt.getPoint());
		        int column=tableSubjects.columnAtPoint(evt.getPoint());
		        
		      if(column==5)
		      {
		      //  ArrayList<Subject> lista =  (ArrayList<Subject>) MainWindow.getInstance().getModel().getListOfSubject();
				for(Subject pre: MainWindow.getInstance().getModel().getListOfSubject()) {
					if(pre.getIdOfSubject() == MainWindowComponents.getModelTableSubjects().getValueAt(row, 0).toString())
					{						
						if(pre.getListOfStudents()==null) 
						{
							System.out.println("AAAAAAAAAAAAAAAA");
						}
						SubjectStudentWindow.getInstance(pre.getListOfStudents());
						DeleteStudentSubjectContoler.deleteInModel(pre);
						break;
					}
				}
		      }
		        
			}
		});
		
		
		
		tabbedPane.add("Students",studentsPanel);
		tabbedPane.add("Professors",professorPanel);
		tabbedPane.add("Subjects",subjectPanel);
		
		this.add(tabbedPane,BorderLayout.CENTER);
			
	}
	
	
	public static void initializeStudentTable()
	{
		for(Student s:MainWindow.getInstance().getModel().getListOfStudent()) 
		{
			
			Object[] data={
		    s.getIndexNum(),
			s.getFirstName(),
			s.getLastName(),
			s.getCurrentYear(),
			s.getStatus(),
			s.getAvrageMark()
			};
			modelTableStudents.insertRow(0, data);
			
		}
	}
	public static void initializeProfessorTable()
	{
		for(Professor p : MainWindow.getInstance().getModel().getListOfProfessor())
		{
			Object[] data= {
					p.getFirstName(),
					p.getLastName(),
					p.getWorkAdress(),
					p.getTitle()
			};
			modelTableProfessors.insertRow(0,data );
		}
	}
	
	public static void initializeSubjectTable()
	{
		for(Subject s : MainWindow.getInstance().getModel().getListOfSubject() )
		{
			if(s.getProfessor() !=null)
			{
				Object[] data= {
						s.getIdOfSubject(),
						s.getNameOfSubject(),
						s.getSemestar(),
						s.getYearOfListening(),
						s.getProfessor().getFirstName()+ " "+s.getProfessor().getLastName(),
						"Show"
				};
				modelTableSubjects.insertRow(0, data);
			}
			else
			{
				Object[] data = {
						s.getIdOfSubject(),
						s.getNameOfSubject(),
						s.getSemestar(),
						s.getYearOfListening(),
						"None",
						"Show"
				};
				modelTableSubjects.insertRow(0, data);
			}
		}
	}


	public static JTable getTableStudents() {
		return tableStudents;
	}


	public void setTableStudents(JTable tableStudents) {
		this.tableStudents = tableStudents;
	}


	public static JTable getTableProfessors() {
		return tableProfessors;
	}


	public void setTableProfessors(JTable tableProfessors) {
		this.tableProfessors = tableProfessors;
	}


	public static JTable getTableSubjects() {
		return tableSubjects;
	}


	public void setTableSubjects(JTable tableSubjects) {
		this.tableSubjects = tableSubjects;
	}


	public static  JTabbedPane getTabbedPane() {
		return tabbedPane;
	}


	public void setTabbedPane(JTabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}


	public static DefaultTableModel getModelTableStudents() {
		return modelTableStudents;
	}


	public static void setModelTableStudents(DefaultTableModel modelTableStudents) {
		MainWindowComponents.modelTableStudents = modelTableStudents;
	}


	public static DefaultTableModel getModelTableProfessors() {
		return modelTableProfessors;
	}


	public static void setModelTableProfessors(DefaultTableModel modelTableProfessors) {
		MainWindowComponents.modelTableProfessors = modelTableProfessors;
	}

	
	
	public static DefaultTableModel getModelTableSubjects() {
		return modelTableSubjects;
	}


	public static void setModelTableSubjects(DefaultTableModel modelTableSubjects) {
		MainWindowComponents.modelTableSubjects = modelTableSubjects;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public static void setSearchedDataStudent(List<Student> students) {
		modelTableStudents.setRowCount(0);
		for(Student s : students)
		{
			Object[] data = 
				{s.getIndexNum()
				,s.getFirstName()
				,s.getLastName()
				,s.getCurrentYear().toString()
				,s.getStatus()
				,s.getAvrageMark()
				};
			
			modelTableStudents.insertRow(0, data);
		}
	}
	
	public static void setSearchedDataProfesor(List<Professor> profesors) {
		modelTableProfessors.setRowCount(0);
		for(Professor p : profesors) {
			Object[] data = 
				{p.getFirstName()
				,p.getLastName()
				,p.getWorkAdress()
				,p.getTitle()	
				};
			
			modelTableProfessors.insertRow(0, data);
		}
	}
	
	
	public static void setSearchedDataPredmet(List<Subject> predmeti) {
		modelTableSubjects.setRowCount(0);
		for(Subject p : predmeti) {
			if(p.getProfessor() == null) {
			Object[] data = 
				{p.getIdOfSubject()
				,p.getNameOfSubject()
				,p.getSemestar().toString()
				,p.getYearOfListening().toString()
				,"Ne postoji"
				,"Prikazi"
				};
			modelTableSubjects.insertRow(0,data);
			}else {
				Object[] data = 
					{p.getIdOfSubject()
					,p.getNameOfSubject()
					,p.getSemestar().toString()
					,p.getYearOfListening().toString()
					,p.getProfessor().getFirstName() + " " + p.getProfessor().getLastName()
					,"Prikazi"
					};
				modelTableSubjects.insertRow(0,data);
			}
			
		}
	}
	
	
	

}
