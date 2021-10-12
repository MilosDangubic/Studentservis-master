package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import model.Professor;
import model.Subject;
import view.MainWindow;
import view.MainWindowComponents;
import view.add_professortoSubject.newProfessorSubjectWindow;
import view.new_entity.NewSubjectWindow;

public class AddProfessorToSubject extends AbstractAction
{
	 public AddProfessorToSubject() {
		 super("Add");
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String idNum = newProfessorSubjectWindow.getInstance().getTxtIdNum().getText();
		int row=MainWindowComponents.getTableSubjects().getSelectedRow();
		String subjectId=(String) MainWindowComponents.getModelTableSubjects().getValueAt(row, 0);
		Professor prof=null;
		Subject sub=null;
		for(Subject s : MainWindow.getInstance().getModel().getListOfSubject())
		{
			if(s.getIdOfSubject().equals(subjectId))
			{	
				sub=s;
				break;
			}
		}
		
		for(Professor p: MainWindow.getInstance().getModel().getListOfProfessor()) 
		{
			if(p.getIdNumber().equals(idNum)) 
			{
				prof=p;
			}
		}
		if(prof!=null) 
		{
			sub.setProfessor(prof);
		}
		
		newProfessorSubjectWindow.getInstance().dispose();
		MainWindowComponents.getModelTableSubjects().setValueAt(prof.getFirstName()+" "+prof.getLastName(), row, 4);
		
		
	}
	
}
