package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.MainWindowComponents;
import view.OurConfiguration;
import view.add_studentToSubject.newStudentSubjectWindow;

public class AddStudent  extends AbstractAction
{

	public AddStudent() {
		// TODO Auto-generated constructor stub
		super("Add student",OurConfiguration.add1);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		int row=MainWindowComponents.getTableSubjects().getSelectedRow();
		if(row==-1) 
		{
			return;
		}
		newStudentSubjectWindow.getInstance().show();
	}

}
