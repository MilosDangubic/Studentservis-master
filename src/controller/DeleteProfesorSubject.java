package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import model.Subject;
import view.MainWindow;
import view.MainWindowComponents;
import view.OurConfiguration;

public class DeleteProfesorSubject extends AbstractAction{

	
	public DeleteProfesorSubject()
	{
		super("Delete profesor",OurConfiguration.deleteIcon);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
	
		int row=MainWindowComponents.getTableSubjects().getSelectedRow();
		if(row==-1) 
		{
			return;
		}
		String subjectId=(String) MainWindowComponents.getModelTableSubjects().getValueAt(row, 0);
		Subject sub=null;
		for(Subject s: MainWindow.getInstance().getModel().getListOfSubject()) 
		{
			if(s.getIdOfSubject().equals(subjectId)) 
			{
				sub=s;
				break;
			}
		}
		
		if(sub!=null) 
		{
			sub.setProfessor(null);
			MainWindowComponents.getModelTableSubjects().setValueAt("None", row, 4);
		}
		
	}

}
