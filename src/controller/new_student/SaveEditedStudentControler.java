package controller.new_student;

import java.awt.event.ActionEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.AbstractAction;

import model.CurrentYear;
import model.Status;
import model.Student;
import view.MainWindow;
import view.MainWindowComponents;
import view.new_entity.NewStudentWindow;
import view.new_entity.NewSubjectWindow;

public class SaveEditedStudentControler extends AbstractAction {

	private int row;
	public  SaveEditedStudentControler() 
	{
		super("Edit");
		row=MainWindowComponents.getTableStudents().getSelectedRow();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		 
				
		MainWindowComponents.getModelTableStudents().setValueAt(NewStudentWindow.getInstance().getTxtIndexNumber().getText(), row, 0);
		MainWindowComponents.getModelTableStudents().setValueAt(NewStudentWindow.getInstance().getTxtFirstName().getText(), row, 1);
		MainWindowComponents.getModelTableStudents().setValueAt(NewStudentWindow.getInstance().getTxtLastName().getText(), row, 2);
		String status;
		MainWindowComponents.getModelTableStudents().setValueAt(NewStudentWindow.getInstance().getCb().getSelectedItem(),row,3);
		
		if(NewStudentWindow.getInstance().getRbtnB().isSelected()) 
		{
			status="B";
		}
		else 
		{
			status="S";
		}
		MainWindowComponents.getModelTableStudents().setValueAt(status, row, 4);
		MainWindowComponents.getModelTableStudents().setValueAt(NewStudentWindow.getInstance().getTxtAverageMark().getText(), row, 5);
		
		EditStudentInModel();
		NewStudentWindow.getInstance().dispose();
		NewStudentWindow.setInstance(null);
		
		
	}
	
	private void  EditStudentInModel() 
	{
		String index=(String) MainWindowComponents.getModelTableStudents().getValueAt(row, 0);
		Student student=null;
		for(Student s: MainWindow.getInstance().getModel().getListOfStudent()) 
		{
			if(s.getIndexNum().equals(index)) 
			{
				student=s;
			}
		}
		
		student.setFirstName(NewStudentWindow.getInstance().getTxtFirstName().getText());
		student.setLastName(NewStudentWindow.getInstance().getTxtLastName().getText());
		student.setAvrageMark(Float.parseFloat(NewStudentWindow.getInstance().getTxtAverageMark().getText()));
		student.setHomeAdress(NewStudentWindow.getInstance().getTxtAdress().getText());
		student.setTelefoneNumber(NewStudentWindow.getInstance().getTxtPhoneNumber().getText());
		student.setIndexNum(NewStudentWindow.getInstance().getTxtIndexNumber().getText());
		if(NewStudentWindow.getInstance().getRbtnB().isSelected()) 
		{
			student.setStatus(Status.B);
		}
		else 
		{
			student.setStatus(Status.S);
		}
		
		if(NewStudentWindow.getInstance().getCb().getSelectedIndex()==0) 
		{
			student.setCurrentYear(CurrentYear.I);
		}
		else if(NewStudentWindow.getInstance().getCb().getSelectedIndex()==1)
		{
			student.setCurrentYear(CurrentYear.II);
		}
		else if(NewStudentWindow.getInstance().getCb().getSelectedIndex()==2)
		{
			student.setCurrentYear(CurrentYear.III);
		}
		else 
		{
			student.setCurrentYear(CurrentYear.IV);
		}
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String dateStr=NewStudentWindow.getInstance().getTxtDate().getText();
		
		LocalDate date=LocalDate.parse(dateStr,formatter);
		student.setDateOfBirth(date);
		
		
	}
	
	

}
