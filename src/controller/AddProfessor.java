package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.MainWindowComponents;
import view.OurConfiguration;
import view.add_professortoSubject.newProfessorSubjectWindow;

public class AddProfessor extends AbstractAction
{

	public AddProfessor() 
	{
		super("Add professor",OurConfiguration.add2);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		int row=MainWindowComponents.getTableSubjects().getSelectedRow();
		if(row==-1) 
		{
			return;
		}
		newProfessorSubjectWindow.getInstance().show();
		
	}

}
