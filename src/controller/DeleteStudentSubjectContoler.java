package controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.DefaultListModel;

import model.Student;
import model.Subject;
import view.MainWindow;
import view.add_studentToSubject.SubjectStudentWindow;

public class DeleteStudentSubjectContoler extends AbstractAction
{
	private static final long serialVersionUID = -2270774298531628112L;
	private int selectedIndex;
	private static Subject p;
	
	public DeleteStudentSubjectContoler() {
		super("Brisi", null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		DefaultListModel<String> model = (DefaultListModel<String>) SubjectStudentWindow.getInstance(null).getStudentiLista().getModel();
		selectedIndex = SubjectStudentWindow.getInstance(null).getStudentiLista().getSelectedIndex();
		String s = model.get(selectedIndex);
		Student student = null;
		for(Student st : MainWindow.getInstance().getModel().getListOfStudent()) {
			if(st.getIndexNum().equals(s))
				student = st;
		}
		if (student != null) {
		    model.remove(selectedIndex);
		    p.getListOfStudents().remove(student);
		}
		
	}
	public static void deleteInModel(Subject pre) {
		p = pre;
	}


}
