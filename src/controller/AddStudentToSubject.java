package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import model.Professor;
import model.Student;
import model.Subject;
import view.MainWindow;
import view.MainWindowComponents;
import view.OurConfiguration;
import view.add_studentToSubject.newStudentSubjectWindow;

public class AddStudentToSubject extends AbstractAction
{
	public AddStudentToSubject() {
		super("Add");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String indexNum = newStudentSubjectWindow.getInstance().getTxtIndexNum().getText();
		int row=MainWindowComponents.getTableSubjects().getSelectedRow();
		String subjectId=(String) MainWindowComponents.getModelTableSubjects().getValueAt(row, 0);
		Subject sub=null;
		Student stud = null;
		System.out.println("tratra");
		for(Subject s : MainWindow.getInstance().getModel().getListOfSubject())
		{
			if(s.getIdOfSubject().equals(subjectId))
			{
				System.out.println("usao");
				sub=s;
				break;
			}
		}
		for(Student st: MainWindow.getInstance().getModel().getListOfStudent())
		{
			System.out.println(st);
			if(st.getIndexNum()!=null && st.getIndexNum().equals(indexNum) )
			{
				stud=st;
				break;
			}
		}
		if(sub!=null) 
		{
			if(stud!=null) 
			{
				sub.getListOfStudents().add(stud);
			}
			
		}
		
		newStudentSubjectWindow.getInstance().dispose();
		newStudentSubjectWindow.setInstance(null);		
		
		
	}
	
}
