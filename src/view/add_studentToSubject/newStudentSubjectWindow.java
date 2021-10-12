package view.add_studentToSubject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AddStudentToSubject;

public class newStudentSubjectWindow extends JFrame 
{
	private static newStudentSubjectWindow instance;
	private JLabel lblIndexNum;
	private JTextField txtIndexNum;
	
	private JButton btnAdd;
	private JButton btnCancel;
	
	public static newStudentSubjectWindow getInstance()
	{
		if(instance == null)
		{
			instance = new newStudentSubjectWindow();
		}
		return instance;
	}
	
	public newStudentSubjectWindow()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(550, 150));
		this.pack();
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		this.setTitle("Add student to subject");
		this.setLayout(new BorderLayout());
		
		lblIndexNum = new JLabel("Index num");
		txtIndexNum = new JTextField();
		txtIndexNum.setPreferredSize(new Dimension(300,30));
		
		btnAdd = new JButton(new AddStudentToSubject());
		btnCancel = new JButton("Cancel");
		
		JPanel panelIndexNum = new JPanel();
		panelIndexNum.add(lblIndexNum);
		panelIndexNum.add(txtIndexNum);
		
		JPanel panelBtn = new JPanel();
		panelBtn.setLayout(new FlowLayout(FlowLayout.RIGHT));
		panelBtn.add(btnAdd);
		panelBtn.add(btnCancel);
		
		this.add(panelIndexNum,BorderLayout.NORTH);
		this.add(panelBtn,BorderLayout.SOUTH);
		
	}

	public JLabel getLblIndexNum() {
		return lblIndexNum;
	}

	public void setLblIndexNum(JLabel lblIndexNum) {
		this.lblIndexNum = lblIndexNum;
	}

	public JTextField getTxtIndexNum() {
		return txtIndexNum;
	}

	public void setTxtIndexNum(JTextField txtIndexNum) {
		this.txtIndexNum = txtIndexNum;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public static void setInstance(newStudentSubjectWindow instance) {
		newStudentSubjectWindow.instance = instance;
	}
	
}
