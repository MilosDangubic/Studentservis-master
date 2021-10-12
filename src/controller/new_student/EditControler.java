package controller.new_student;

import java.awt.event.ActionEvent;
import java.util.ArrayList;

import view.MainWindow;
import view.MainWindowComponents;
import view.OurConfiguration;
import view.new_entity.NewProfessorWindow;
import view.new_entity.NewStudentWindow;
import view.new_entity.NewSubjectWindow;

import javax.swing.AbstractAction;

import model.CurrentYear;
import model.Professor;
import model.Semestar;
import model.Status;
import model.Student;
import model.Subject;

public class EditControler extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 312312321L;
	public  EditControler() 
	{
		super("Edit",OurConfiguration.editIcon);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
	
		int i = MainWindowComponents.getTabbedPane().getSelectedIndex();
		int row = 0;
		switch(i)
		{
		case 0:	
			NewStudentWindow.getInstance().getBtnEdit().show();
			NewStudentWindow.getInstance().getBtnSave().hide();
			row = MainWindowComponents.getTableStudents().getSelectedRow();
			ArrayList<Student> listOfStudents = (ArrayList<Student>) MainWindow.getInstance().getModel().getListOfStudent();
			String indexNum;
			if(row==-1) 
			{
				return;
			}
			indexNum=(String) MainWindowComponents.getModelTableStudents().getValueAt(row, 0);
			for(Student st:listOfStudents)
			{
				
				if(st.getIndexNum()== indexNum) 
				{
					NewStudentWindow.getInstance().getTxtFirstName().setText(st.getFirstName());
					NewStudentWindow.getInstance().getTxtLastName().setText(st.getLastName());
					NewStudentWindow.getInstance().getTxtDate().setText(st.getDateOfBirth().toString());
					NewStudentWindow.getInstance().getTxtAdress().setText(st.getHomeAdress());
					NewStudentWindow.getInstance().getTxtIndexNumber().setText(st.getIndexNum());
					NewStudentWindow.getInstance().getTxtPhoneNumber().setText(st.getTelefoneNumber());
					if(st.getStatus()==Status.B) 
					{
						NewStudentWindow.getInstance().getRbtnB().setSelected(true);
					}
					else
					{
						NewStudentWindow.getInstance().getRbtnS().setSelected(true);

					}
					if(st.getCurrentYear()==CurrentYear.I) 
					{
						NewStudentWindow.getInstance().getCb().setSelectedIndex(0);
					}
					else if(st.getCurrentYear()==CurrentYear.II)
					{
						NewStudentWindow.getInstance().getCb().setSelectedIndex(1);
					}
					else if(st.getCurrentYear()==CurrentYear.III)
					{
						NewStudentWindow.getInstance().getCb().setSelectedIndex(2);
					}
					else
					{
						NewStudentWindow.getInstance().getCb().setSelectedIndex(3);
					}
					
					NewStudentWindow.getInstance().getTxtAverageMark().setText(Float.toString(st.getAvrageMark()));
					NewStudentWindow.getInstance().show();	
				}
				
				
			}
		break;
		case 1:
			NewProfessorWindow.getInstance().getBtnEdit().show();
			NewProfessorWindow.getInstance().getBtnAdd().hide();
			row = MainWindowComponents.getTableProfessors().getSelectedRow();
			ArrayList<Professor> listOfProfessors = (ArrayList<Professor>) MainWindow.getInstance().getModel().getListOfProfessor();
			String name;
			name =(String) MainWindowComponents.getModelTableProfessors().getValueAt(row, 0);
			for(Professor pro:listOfProfessors)
			{
				if(pro.getFirstName()==name)
				{
					NewProfessorWindow.getInstance().getTxtFirstName().setText(pro.getFirstName());
					NewProfessorWindow.getInstance().getTxtLastName().setText(pro.getLastName());
					NewProfessorWindow.getInstance().getTxtEmail().setText(pro.getEmailAdress());
					NewProfessorWindow.getInstance().getTxtHomeAdress().setText(pro.getHomeAdress());
					NewProfessorWindow.getInstance().getTxtWorkAdress().setText(pro.getWorkAdress());
					NewProfessorWindow.getInstance().getTxtIdNum().setText(pro.getIdNumber());
					NewProfessorWindow.getInstance().getTxtDayOfBirth().setText(pro.getDayOfBirth().toString());
					NewProfessorWindow.getInstance().getTxtTitle().setText(pro.getTitle());
					NewProfessorWindow.getInstance().getTxtPosition().setText(pro.getPosition());
					NewProfessorWindow.getInstance().getTxtTelNum().setText(pro.getTelefoneNumber());
					NewProfessorWindow.getInstance().show();
				}
			}
			break;
		case 2:
			NewSubjectWindow.getInstance().getBtnEdit().show();
			NewSubjectWindow.getInstance().getBtnAdd().hide();
			row = MainWindowComponents.getTableSubjects().getSelectedRow();
			ArrayList<Subject> listOfSubjects = (ArrayList<Subject>) MainWindow.getInstance().getModel().getListOfSubject();
			String idNum;
			idNum = (String) MainWindowComponents.getModelTableSubjects().getValueAt(row, 0);
			for(Subject sub:listOfSubjects)
			{
				NewSubjectWindow.getInstance().getTxtIdOfSubject().setText(sub.getIdOfSubject());
				NewSubjectWindow.getInstance().getTxtNameOfSubject().setText(sub.getNameOfSubject());
				if(sub.getSemestar() == Semestar.Winter )
				{
					NewSubjectWindow.getInstance().getCbS().setSelectedIndex(0);
				}
				else
				{
					NewSubjectWindow.getInstance().getCbS().setSelectedIndex(1);
				}
				if(sub.getYearOfListening() == CurrentYear.I)
				{
					NewSubjectWindow.getInstance().getCbY().setSelectedIndex(0);
				}
				else if (sub.getYearOfListening() == CurrentYear.II)
				{
					NewSubjectWindow.getInstance().getCbY().setSelectedIndex(1);
				}
				else if (sub.getYearOfListening()== CurrentYear.III)
				{
					NewSubjectWindow.getInstance().getCbY().setSelectedIndex(2);
				}
				else
				{
					NewSubjectWindow.getInstance().getCbY().setSelectedIndex(3);
				}
				NewSubjectWindow.getInstance().show();
			}
			break;
		}
		
	}

}
