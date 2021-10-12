package controller.new_subject;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import model.CurrentYear;
import model.Semestar;
import model.Student;
import model.Subject;
import view.MainWindow;
import view.MainWindowComponents;
import view.new_entity.NewSubjectWindow;

public class SaveEditedSubjectContoler extends AbstractAction
{

	private int row;
	public SaveEditedSubjectContoler() {
		super("Edit");
		row=MainWindowComponents.getTableSubjects().getSelectedRow();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{ 
		MainWindowComponents.getModelTableSubjects().setValueAt(NewSubjectWindow.getInstance().getTxtIdOfSubject().getText(), row, 0);
		MainWindowComponents.getModelTableSubjects().setValueAt(NewSubjectWindow.getInstance().getTxtNameOfSubject().getText(), row, 1);
		String semestar;
		String year;
		if(NewSubjectWindow.getInstance().getCbS().getSelectedIndex()==0) 
		{
			semestar="Winter";
		}
		else 
		{
			semestar="Summer";
		}
		
		if(NewSubjectWindow.getInstance().getCbY().getSelectedIndex()==0) 
		{
			year="I";
		}
		else if(NewSubjectWindow.getInstance().getCbY().getSelectedIndex()==1)
		{
			year="II";
		}
		else if(NewSubjectWindow.getInstance().getCbY().getSelectedIndex()==2)
		{
			year="III";
		}
		else 
		{
			year="IV";
		}
		
		MainWindowComponents.getModelTableSubjects().setValueAt(semestar, row, 2);
		MainWindowComponents.getModelTableSubjects().setValueAt(year, row, 3);

		EditSubjectInModel();
		NewSubjectWindow.getInstance().dispose();
		NewSubjectWindow.setInstance(null);
		
	}
	
	
	private void EditSubjectInModel() 
	{
		String subjectId=(String) MainWindowComponents.getModelTableSubjects().getValueAt(row, 0);
		Subject sub=null;
		for(Subject s: MainWindow.getInstance().getModel().getListOfSubject()) 
		{
			if(s.getIdOfSubject().equals(subjectId)) 
			{
				sub=s;
			}
		}
		
		sub.setIdOfSubject(NewSubjectWindow.getInstance().getTxtIdOfSubject().getText());
		sub.setNameOfSubject(NewSubjectWindow.getInstance().getTxtNameOfSubject().getText());
		String year;
		String semestar;
		if(NewSubjectWindow.getInstance().getCbS().getSelectedIndex()==0)
		{
			sub.setSemestar(Semestar.Winter);
		}
		else 
		{
			sub.setSemestar(Semestar.Summer);
		}
		
		if(NewSubjectWindow.getInstance().getCbY().getSelectedIndex()==0)
		{
			sub.setYearOfListening(CurrentYear.I);
		}
		else if(NewSubjectWindow.getInstance().getCbY().getSelectedIndex()==1)
		{
			sub.setYearOfListening(CurrentYear.II);
		}
		else if(NewSubjectWindow.getInstance().getCbY().getSelectedIndex()==2)
		{
			sub.setYearOfListening(CurrentYear.III);
		}
		else
		{
			sub.setYearOfListening(CurrentYear.IV);
		}
		
	}

}
