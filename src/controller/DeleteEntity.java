package controller;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.AbstractAction;

import model.Professor;
import model.Student;
import model.Subject;
import view.MainWindow;
import view.MainWindowComponents;
import view.OurConfiguration;

public class DeleteEntity extends AbstractAction {

	
	public DeleteEntity() 
	{
		super("Delete",OurConfiguration.deleteIcon);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		int tabbedPaneIndex=MainWindowComponents.getTabbedPane().getSelectedIndex();
		int row=0;
		switch(tabbedPaneIndex) 
		{
		case 0:
			 row=MainWindowComponents.getTableStudents().getSelectedRow();
			if(row==-1) 
			{
				return;
			}
			System.out.println(row);
			
			String index=(String) MainWindowComponents.getModelTableStudents().getValueAt(row, 0);
			
			for(Student s: MainWindow.getInstance().getModel().getListOfStudent()) 
			{
				if(s.getIndexNum().equals(index)) 
				{
					MainWindow.getInstance().getModel().getListOfStudent().remove(s);
					break;
				}
			}
			
			MainWindowComponents.getModelTableStudents().removeRow(row);
			break;
		case 1:
			 row = MainWindowComponents.getTableProfessors().getSelectedRow();
			 if(row == -1)
			 {
				 return;
			 }
			 String firstName = (String) MainWindowComponents.getModelTableProfessors().getValueAt(row, 0);
			 ArrayList<Professor> lista= (ArrayList<Professor>)MainWindow.getInstance().getModel().getListOfProfessor();
			 Iterator<Professor> iter=lista.iterator();
			 while(iter.hasNext())
			 {
				 Professor p=iter.next();
				 if(p.getFirstName().equals(firstName.trim()))
				 {
					 lista.remove(p);
					 break;
				 }
				 
			 }
			 
			 MainWindowComponents.getModelTableProfessors().removeRow(row);
			 break;
		case 2:
			row = MainWindowComponents.getTableSubjects().getSelectedRow();
			if(row == -1)
			{
				return;
			}
			String idSubject = (String) MainWindowComponents.getModelTableSubjects().getValueAt(row, 0);
			ArrayList<Subject> lista1= (ArrayList<Subject>)MainWindow.getInstance().getModel().getListOfSubject();
			Iterator<Subject> iterator=lista1.iterator();
			while(iterator.hasNext()) 
			{
				Subject sub=iterator.next();
				if(sub.equals(idSubject)) 
				{
					lista1.remove(sub);
					break;
				}
			}
			
			MainWindowComponents.getModelTableSubjects().removeRow(row);
			
		}
	}

}
