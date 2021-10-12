

package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import view.MainWindowComponents;
import view.OurConfiguration;
import view.new_entity.NewProfessorWindow;
import view.new_entity.NewStudentWindow;
import view.new_entity.NewSubjectWindow;
public class NewEntityAdd  extends AbstractAction
{

	public NewEntityAdd() 
	{
		super("Add",OurConfiguration.addIcon);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		int index=MainWindowComponents.getTabbedPane().getSelectedIndex();
		if(index==0) 
		{
			
			NewStudentWindow.getInstance().show();
			NewStudentWindow.getInstance().getBtnEdit().setVisible(false);
			NewStudentWindow.getInstance().getBtnSave().setVisible(true);
		}
		 else if (index==1)
		{
			NewProfessorWindow.getInstance().show();
			NewProfessorWindow.getInstance().getBtnEdit().setVisible(false);
		}
		 else
		 {
			 NewSubjectWindow.getInstance().show();
			 NewSubjectWindow.getInstance().getBtnEdit().setVisible(false);
		 }
		
	}

	
}
