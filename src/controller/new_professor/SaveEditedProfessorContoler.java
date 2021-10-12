package controller.new_professor;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import model.Professor;
import view.MainWindow;
import view.MainWindowComponents;
import view.new_entity.NewProfessorWindow;
import view.new_entity.NewStudentWindow;
import view.new_entity.NewSubjectWindow;

public class SaveEditedProfessorContoler extends AbstractAction 
{
	private int row;
	public  SaveEditedProfessorContoler() 
	{
		super("Edit");
		row=MainWindowComponents.getTableProfessors().getSelectedRow();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		MainWindowComponents.getModelTableProfessors().setValueAt(NewProfessorWindow.getInstance().getTxtFirstName().getText(), row, 0);
		MainWindowComponents.getModelTableProfessors().setValueAt(NewProfessorWindow.getInstance().getTxtLastName().getText(), row, 1);
		MainWindowComponents.getModelTableProfessors().setValueAt(NewProfessorWindow.getInstance().getTxtWorkAdress().getText(), row, 2);
		MainWindowComponents.getModelTableProfessors().setValueAt(NewProfessorWindow.getInstance().getTxtTitle().getText(), row, 3);

		SaveEditedProfessorInModel();
		NewProfessorWindow.getInstance().dispose();
		NewProfessorWindow.setInstance(null);
		
	}
	
	private void SaveEditedProfessorInModel()
	{
		String name =(String) MainWindowComponents.getModelTableProfessors().getValueAt(row, 0);
		Professor prof=null;
		for(Professor p : MainWindow.getInstance().getModel().getListOfProfessor())
		{
			if(p.getFirstName().equals(name))
			{
				prof=p;
			}
		}
		prof.setFirstName(NewProfessorWindow.getInstance().getTxtFirstName().getText());
		prof.setLastName(NewProfessorWindow.getInstance().getTxtLastName().getText());
		prof.setHomeAdress(NewProfessorWindow.getInstance().getTxtHomeAdress().getText());
		prof.setWorkAdress(NewProfessorWindow.getInstance().getTxtWorkAdress().getText());
		prof.setTelefoneNumber(NewProfessorWindow.getInstance().getTxtTelNum().getText());
		prof.setEmailAdress(NewProfessorWindow.getInstance().getTxtEmail().getText());
		prof.setIdNumber(NewProfessorWindow.getInstance().getTxtIdNum().getText());
		prof.setTitle(NewProfessorWindow.getInstance().getTxtTitle().getText());
		prof.setPosition(NewProfessorWindow.getInstance().getTxtPosition().getText());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateStr=NewProfessorWindow.getInstance().getTxtDayOfBirth().getText();
		
		LocalDate date=LocalDate.parse(dateStr,formatter);
		prof.setDayOfBirth(date);
		
	}

}
