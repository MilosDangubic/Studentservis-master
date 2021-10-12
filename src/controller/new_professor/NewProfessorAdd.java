package controller.new_professor;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import view.MainWindow;
import view.MainWindowComponents;
import view.new_entity.*;
import javax.swing.AbstractAction;
import javax.swing.Action;

import model.Professor;
import view.new_entity.NewProfessorWindow;

public class NewProfessorAdd extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1094079312712813273L;
	
	public NewProfessorAdd()
	{
		super("Add professor");
	}
	
	



	@Override
	public void actionPerformed(ActionEvent arg0) {

		Object [] data= {
				NewProfessorWindow.getInstance().getTxtFirstName().getText(),
				NewProfessorWindow.getInstance().getTxtLastName().getText(),
				NewProfessorWindow.getInstance().getTxtWorkAdress().getText(),
				NewProfessorWindow.getInstance().getTxtTitle().getText()
		};
		
		MainWindowComponents.getModelTableProfessors().addRow(data);
		
		
		addInModel();
		
		
		NewProfessorWindow.getInstance().dispose();
		
		
	}
	
	private void addInModel()
	{
		Professor p = new Professor();
		p.setFirstName(NewProfessorWindow.getInstance().getTxtFirstName().getText());
		p.setLastName(NewProfessorWindow.getInstance().getTxtLastName().getText());
		//p.setDayOfBirth(NewProfessorWindow.getInstance().getTxtDayOfBirth());
		p.setHomeAdress(NewProfessorWindow.getInstance().getTxtHomeAdress().getText());
		p.setTelefoneNumber(NewProfessorWindow.getInstance().getTxtTelNum().getText());
		p.setEmailAdress(NewProfessorWindow.getInstance().getTxtEmail().getText());
		p.setWorkAdress(NewProfessorWindow.getInstance().getTxtEmail().getText());
		p.setIdNumber(NewProfessorWindow.getInstance().getTxtIdNum().getText());
		p.setTitle(NewProfessorWindow.getInstance().getTxtTitle().getText());
		p.setPosition(NewProfessorWindow.getInstance().getTxtPosition().getText());
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateStr=NewProfessorWindow.getInstance().getTxtDayOfBirth().getText();
		
		LocalDate date=LocalDate.parse(dateStr,formatter);
		p.setDayOfBirth(date);
		
		MainWindow.getInstance().getModel().getListOfProfessor().add(p);
	}
}
