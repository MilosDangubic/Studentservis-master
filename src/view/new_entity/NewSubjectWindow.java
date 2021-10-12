package view.new_entity;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import controller.new_student.EditControler;
import controller.new_subject.NewSubjectAdd;
import controller.new_subject.SaveEditedSubjectContoler;

public class NewSubjectWindow extends JFrame
{
	private static NewSubjectWindow instance;
	private JLabel lblIdOfSubject;
	private JLabel lblNameOfSubject;
	private JLabel lblSemestar;
	private JLabel lblYearOfStudy;
	
	private JTextField txtIdOfSubject;
	private JTextField txtNameOfSubject;
	
	private JComboBox<String>cbS;
	private JComboBox<String> cbY;
	
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnCancel;
	
	public static NewSubjectWindow getInstance()
	{
		if(instance == null)
		{
			instance = new NewSubjectWindow();
		}
		return instance;
	}
	
	public JLabel getLblIdOfSubject() {
		return lblIdOfSubject;
	}

	public void setLblIdOfSubject(JLabel lblIdOfSubject) {
		this.lblIdOfSubject = lblIdOfSubject;
	}

	public JLabel getLblNameOfSubject() {
		return lblNameOfSubject;
	}

	public void setLblNameOfSubject(JLabel lblNameOfSubject) {
		this.lblNameOfSubject = lblNameOfSubject;
	}

	public JLabel getLblSemestar() {
		return lblSemestar;
	}

	public void setLblSemestar(JLabel lblSemestar) {
		this.lblSemestar = lblSemestar;
	}

	public JLabel getLblYearOfStudy() {
		return lblYearOfStudy;
	}

	public void setLblYearOfStudy(JLabel lblYearOfStudy) {
		this.lblYearOfStudy = lblYearOfStudy;
	}

	public JTextField getTxtIdOfSubject() {
		return txtIdOfSubject;
	}

	public void setTxtIdOfSubject(JTextField txtIdOfSubject) {
		this.txtIdOfSubject = txtIdOfSubject;
	}

	public JTextField getTxtNameOfSubject() {
		return txtNameOfSubject;
	}

	public void setTxtNameOfSubject(JTextField txtNameOfSubject) {
		this.txtNameOfSubject = txtNameOfSubject;
	}

	
	public JComboBox<String> getCbS() {
		return cbS;
	}

	public void setCbS(JComboBox<String> cbS) {
		this.cbS = cbS;
	}

	public JComboBox<String> getCbY() {
		return cbY;
	}

	public void setCb(JComboBox<String> cbY) {
		this.cbY = cbY;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public void setBtnAdd(JButton btnAdd) {
		this.btnAdd = btnAdd;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}

	public JButton getBtnCancel() {
		return btnCancel;
	}

	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}

	public static void setInstance(NewSubjectWindow instance) {
		NewSubjectWindow.instance = instance;
	}

	public NewSubjectWindow()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(600, 300));
		this.setTitle("Subject");
		this.pack();
		this.setLayout(new BorderLayout());
		
		lblIdOfSubject = new JLabel("Id of subject");
		lblNameOfSubject = new JLabel("Name of subject");
		lblSemestar = new JLabel("Semestar");
		lblYearOfStudy = new JLabel("Year of study");
		
		String[] data= {"I(first)","II(second)",
				"III(third)","IV(fourth)"};
		cbY= new JComboBox<>(data);
		
		String[] data1 = {"Winter","Summer"};
		cbS = new JComboBox<>(data1);
		
		txtIdOfSubject = new JTextField();
		txtIdOfSubject.setPreferredSize(new Dimension(300,30));
		txtNameOfSubject = new JTextField();
		txtNameOfSubject.setPreferredSize(new Dimension(300,30));
		
		
		btnAdd = new JButton(new NewSubjectAdd());
		btnEdit = new JButton(new SaveEditedSubjectContoler());
		btnCancel = new JButton("Cancel");
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NewSubjectWindow.getInstance().dispose();
			}
		});	
		
		
		
		JPanel pnlIdSub = new JPanel();
		pnlIdSub.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlIdSub.add(lblIdOfSubject);
		pnlIdSub.add(txtIdOfSubject);
		
		JPanel pnlNameOfSub = new JPanel();
		pnlNameOfSub.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlNameOfSub.add(lblNameOfSubject);
		pnlNameOfSub.add(txtNameOfSubject);
		
		JPanel pnlSemestar = new JPanel();
		pnlSemestar.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlSemestar.add(lblSemestar);
		pnlSemestar.add(cbS);
		
		JPanel pnlYearOfStudy = new JPanel();
		pnlYearOfStudy.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlYearOfStudy.add(lblYearOfStudy);
		pnlYearOfStudy.add(cbY);
		
		JPanel pnlBtn = new JPanel();
		pnlBtn.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnlBtn.add(btnAdd);
		pnlBtn.add(btnEdit);
		pnlBtn.add(btnCancel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		mainPanel.add(pnlIdSub);
		mainPanel.add(pnlNameOfSub);
		mainPanel.add(pnlSemestar);
		mainPanel.add(pnlYearOfStudy);
		mainPanel.add(pnlBtn);
		
		this.add(mainPanel,BorderLayout.CENTER);
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		
	}
}
