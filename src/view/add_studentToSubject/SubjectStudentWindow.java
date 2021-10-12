package view.add_studentToSubject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

import controller.DeleteStudentSubjectContoler;
import model.Student;

public class SubjectStudentWindow  extends JFrame
{
	
	 
		private static final long serialVersionUID = 8487622173942005740L;
		private static SubjectStudentWindow instance;
		private JList<String> studentiLista;
		@SuppressWarnings("deprecation")
		public static SubjectStudentWindow getInstance(List<Student> list2) {
			if(SubjectStudentWindow.instance == null) {
				SubjectStudentWindow.instance = new SubjectStudentWindow(list2);
			}
			SubjectStudentWindow.instance.show();
			return SubjectStudentWindow.instance;
		}
		
		public SubjectStudentWindow(java.util.List<Student> list2) {
			Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
			this.setPreferredSize(new Dimension(600, 300));
			this.setTitle("Predmet");
			this.pack();
			this.setLayout(new BorderLayout());
			
			JPanel mainPanel = new JPanel();
			mainPanel.setLayout(new BorderLayout());
			
			JPanel studenti = new JPanel();
			@SuppressWarnings("unchecked")
			DefaultListModel<String> indexes = new DefaultListModel<String>();
			for(Student s : list2)
				indexes.addElement(s.getIndexNum());
			studentiLista = new JList<String>((ListModel<String>) indexes);
			JScrollPane listScrollPane = new JScrollPane(studentiLista);
			studenti.add(listScrollPane);
			
			JPanel btns = new JPanel();
			btns.setLayout(new FlowLayout(FlowLayout.RIGHT));
			JButton delete = new JButton(new DeleteStudentSubjectContoler());
			JButton cancel = new JButton("Cancel");
			cancel.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					SubjectStudentWindow.getInstance(list2).dispose();
				}
			});
			btns.add(delete);
			btns.add(cancel);
			mainPanel.add(studenti, BorderLayout.CENTER);
			mainPanel.add(btns, BorderLayout.SOUTH);
			this.add(mainPanel,BorderLayout.CENTER);
		}

		public JList<String> getStudentiLista() {
			return studentiLista;
		}

		public void setStudentiLista(JList<String> studentiLista) {
			this.studentiLista = studentiLista;
		}


}
