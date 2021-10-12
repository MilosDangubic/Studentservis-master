package controller.new_student;

import java.awt.event.ActionEvent;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import model.CurrentYear;
import model.Status;
import model.Student;
import view.MainWindow;
import view.MainWindowComponents;
import view.new_entity.NewProfessorWindow;
import view.new_entity.NewStudentWindow;

public class NewStudentAdd extends AbstractAction 
{
	
	public NewStudentAdd() 
	{
		super("Add student");
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String status = "";
		if(NewStudentWindow.getInstance().getRbtnS().isSelected() == true) {
			status = "S";
		}else
			status = "B";
		Object[] data = 
			{NewStudentWindow.getInstance().getTxtIndexNumber().getText()
			,NewStudentWindow.getInstance().getTxtFirstName().getText()
			,NewStudentWindow.getInstance().getTxtLastName().getText()
			,NewStudentWindow.getInstance().getCb().getSelectedItem().toString()
			,status
			,NewStudentWindow.getInstance().getTxtAverageMark().getText()};
		
		MainWindowComponents.getModelTableStudents().addRow(data);
		addInModel();
		NewStudentWindow.getInstance().dispose();		
	}

	private void addInModel()
	{
		Student s = new Student();
		s.setFirstName(NewStudentWindow.getInstance().getTxtFirstName().getText());
		s.setLastName(NewStudentWindow.getInstance().getTxtLastName().getText());
		s.setHomeAdress(NewStudentWindow.getInstance().getTxtAdress().getText());
		s.setTelefoneNumber(NewStudentWindow.getInstance().getTxtPhoneNumber().getText());
		s.setIndexNum(NewStudentWindow.getInstance().getTxtIndexNumber().getText());
		
		int currentYearIndex=NewStudentWindow.getInstance().getCb().getSelectedIndex();
		CurrentYear cY;
		if(currentYearIndex==0) 
		{
			cY=CurrentYear.I;
		}
		else if(currentYearIndex==1)
		{
			cY=CurrentYear.II;
		}
		else if(currentYearIndex==2)
		{
			cY=CurrentYear.III;
		}
		else
		{
			cY=CurrentYear.IV;
		}

		
		
		s.setCurrentYear(cY);
		
		Status ss;
		if(NewStudentWindow.getInstance().getRbtnB().isSelected()) 
		{
			ss=Status.B;
		}
		else 
		{
			ss=Status.S;
		}
		
		s.setAvrageMark(Float.parseFloat(NewStudentWindow.getInstance().getTxtAverageMark().getText()));
		
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateStr=NewStudentWindow.getInstance().getTxtDate().getText();
		
		LocalDate date=LocalDate.parse(dateStr,formatter);
		s.setDateOfBirth(date);
		
		MainWindow.getInstance().getModel().getListOfStudent().add(s);
	}
	
}
