package view.add_professortoSubject;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.AddProfessorToSubject;

public class newProfessorSubjectWindow extends JFrame
{
	private JLabel lblIdNum;
	private JTextField txtIdNum;
	private JButton btnAdd;
	private JButton btnCancel;
	private static newProfessorSubjectWindow instance;
	
	public newProfessorSubjectWindow()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(550, 150));
		this.pack();
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		this.setTitle("Add professor to subject");
		this.setLayout(new BorderLayout());
		
		
		lblIdNum = new JLabel("Id num");
		txtIdNum = new JTextField();
		txtIdNum.setPreferredSize(new Dimension(300,30));
		btnAdd = new JButton(new AddProfessorToSubject());
		btnCancel = new JButton("Cancel");
		
		JPanel pnlIdNum = new JPanel();
		pnlIdNum.add(lblIdNum);
		pnlIdNum.add(txtIdNum);
		
		JPanel pnlBtn = new JPanel();
		pnlBtn.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnlBtn.add(btnAdd);
		pnlBtn.add(btnCancel);
		
		this.add(pnlIdNum,BorderLayout.NORTH);
		this.add(pnlBtn,BorderLayout.SOUTH);
		
	}
	
	public static newProfessorSubjectWindow getInstance()
	{
		if(instance == null)
		{
			instance = new newProfessorSubjectWindow();
		}
		return instance;
	}

	public JLabel getLblIdNum() {
		return lblIdNum;
	}

	public void setLblIdNum(JLabel lblIdNum) {
		this.lblIdNum = lblIdNum;
	}

	public JTextField getTxtIdNum() {
		return txtIdNum;
	}

	public void setTxtIdNum(JTextField txtIdNum) {
		this.txtIdNum = txtIdNum;
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

	public static void setInstance(newProfessorSubjectWindow instance) {
		newProfessorSubjectWindow.instance = instance;
	}
	
	
	
}
