package view.new_entity;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.new_professor.NewProfessorAdd;
import controller.new_professor.SaveEditedProfessorContoler;
import controller.new_student.EditControler;
import controller.new_student.SaveEditedStudentControler;

public class NewProfessorWindow extends JFrame
{
	private static NewProfessorWindow instance;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblDayOfBirth;
	private JLabel lblHomeAdress;
	private JLabel lblTelNum;
	private JLabel lblEmail;
	private JLabel lblWorkAdress;
	private JLabel lblIdNum;
	private JLabel lblTitle;
	private JLabel lblPosition;

	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDayOfBirth;
	private JTextField txtHomeAdress;
	private JTextField txtTelNum;
	private JTextField txtEmail;
	private JTextField txtWorkAdress;
	private JTextField txtIdNum;
	private JTextField txtTitle;
	private JTextField txtPosition;

	private JButton btnAdd;
	private JButton btnCancel;
	private JButton btnEdit;


	public NewProfessorWindow()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(600, 600));
		this.pack();
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		this.setTitle("Professor");
		this.setLayout(new BorderLayout());



		lblFirstName = new JLabel("First name");
		lblLastName = new JLabel("Last name");
		lblDayOfBirth = new JLabel("Day of birth");
		lblHomeAdress = new JLabel("Home adress");
		lblTelNum = new JLabel("Telephone number");
		lblEmail = new JLabel("Email");
		lblWorkAdress = new JLabel("Work adress");
		lblIdNum = new JLabel("Id number");
		lblTitle = new JLabel("Title");
		lblPosition = new JLabel("Position");
		btnAdd = new JButton(new NewProfessorAdd());
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NewProfessorWindow.getInstance().dispose();
			}
		});



		btnEdit= new JButton(new SaveEditedProfessorContoler());

		txtFirstName = new JTextField();
		txtFirstName.setPreferredSize(new Dimension(300,30));
		txtLastName = new JTextField();
		txtLastName.setPreferredSize(new Dimension(300,30));
		txtDayOfBirth = new JTextField();
		txtDayOfBirth.setPreferredSize(new Dimension(300,30));
		txtHomeAdress = new JTextField();
		txtHomeAdress.setPreferredSize(new Dimension(300,30));
		txtTelNum = new JTextField();
		txtTelNum.setPreferredSize(new Dimension(300,30));
		txtEmail = new JTextField();
		txtEmail.setPreferredSize(new Dimension(300,30));
		txtWorkAdress = new JTextField();
		txtWorkAdress.setPreferredSize(new Dimension(300,30));
		txtIdNum = new JTextField();
		txtIdNum.setPreferredSize(new Dimension(300,30));
		txtTitle = new JTextField();
		txtTitle.setPreferredSize(new Dimension(300,30));
		txtPosition = new JTextField();
		txtPosition.setPreferredSize(new Dimension(300,30));



		JPanel pnlFirstName=new JPanel();
		pnlFirstName.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlFirstName.add(lblFirstName);
		pnlFirstName.add(txtFirstName);

		JPanel pnlLastName = new JPanel();
		pnlLastName.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlLastName.add(lblLastName);
		pnlLastName.add(txtLastName);

		JPanel pnlDayOfBirth = new JPanel();
		pnlDayOfBirth.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlDayOfBirth.add(lblDayOfBirth);
		pnlDayOfBirth.add(txtDayOfBirth);

		JPanel pnlHomeAdress = new JPanel();
		pnlHomeAdress.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlHomeAdress.add(lblHomeAdress);
		pnlHomeAdress.add(txtHomeAdress);

		JPanel pnlTelNum = new JPanel();
		pnlTelNum.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlTelNum.add(lblTelNum);
		pnlTelNum.add(txtTelNum);

		JPanel pnlEmail = new JPanel();
		pnlEmail.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlEmail.add(lblEmail);
		pnlEmail.add(txtEmail);

		JPanel pnlWorkAdress = new JPanel();
		pnlWorkAdress.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlWorkAdress.add(lblWorkAdress);
		pnlWorkAdress.add(txtWorkAdress);

		JPanel pnlIdNum = new JPanel();
		pnlIdNum.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlIdNum.add(lblIdNum);
		pnlIdNum.add(txtIdNum);

		JPanel pnlTitle = new JPanel();
		pnlTitle.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlTitle.add(lblTitle);
		pnlTitle.add(txtTitle);

		JPanel pnlPosition = new JPanel();
		pnlPosition.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlPosition.add(lblPosition);
		pnlPosition.add(txtPosition);

		JPanel pnlButton = new JPanel();
		pnlButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnlButton.add(btnAdd);
		pnlButton.add(btnEdit);
		pnlButton.add(btnCancel);

		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));

		mainPanel.add(pnlFirstName);
		mainPanel.add(pnlLastName);
		mainPanel.add(pnlDayOfBirth);
		mainPanel.add(pnlHomeAdress);
		mainPanel.add(pnlTelNum);
		mainPanel.add(pnlEmail);
		mainPanel.add(pnlWorkAdress);
		mainPanel.add(pnlWorkAdress);
		mainPanel.add(pnlIdNum);
		mainPanel.add(pnlTitle);
		mainPanel.add(pnlPosition);
		mainPanel.add(pnlButton);

		this.add(mainPanel, BorderLayout.CENTER);
	}


	public static NewProfessorWindow getInstance() {
		if(instance == null) {
			instance = new NewProfessorWindow();
		}
		return instance;



	}


	public static void setInstance(NewProfessorWindow instance) {
		NewProfessorWindow.instance = instance;
	}


	public JLabel getLblFirstName() {
		return lblFirstName;
	}


	public void setLblFirstName(JLabel lblFirstName) {
		this.lblFirstName = lblFirstName;
	}


	public JLabel getLblLastName() {
		return lblLastName;
	}


	public void setLblLastName(JLabel lblLastName) {
		this.lblLastName = lblLastName;
	}


	public JLabel getLblDayOfBirth() {
		return lblDayOfBirth;
	}


	public void setLblDayOfBirth(JLabel lblDayOfBirth) {
		this.lblDayOfBirth = lblDayOfBirth;
	}


	public JLabel getLblHomeAdress() {
		return lblHomeAdress;
	}


	public void setLblHomeAdress(JLabel lblHomeAdress) {
		this.lblHomeAdress = lblHomeAdress;
	}


	public JLabel getLblTelNum() {
		return lblTelNum;
	}


	public void setLblTelNum(JLabel lblTelNum) {
		this.lblTelNum = lblTelNum;
	}


	public JLabel getLblEmail() {
		return lblEmail;
	}


	public void setLblEmail(JLabel lblEmail) {
		this.lblEmail = lblEmail;
	}


	public JLabel getLblWorkAdress() {
		return lblWorkAdress;
	}


	public void setLblWorkAdress(JLabel lblWorkAdress) {
		this.lblWorkAdress = lblWorkAdress;
	}


	public JLabel getLblIdNum() {
		return lblIdNum;
	}


	public void setLblIdNum(JLabel lblIdNum) {
		this.lblIdNum = lblIdNum;
	}


	public JLabel getLblTitle() {
		return lblTitle;
	}


	public void setLblTitle(JLabel lblTitle) {
		this.lblTitle = lblTitle;
	}


	public JLabel getLblPosition() {
		return lblPosition;
	}


	public void setLblPosition(JLabel lblPosition) {
		this.lblPosition = lblPosition;
	}


	public JTextField getTxtFirstName() {
		return txtFirstName;
	}


	public void setTxtFirstName(JTextField txtFirstName) {
		this.txtFirstName = txtFirstName;
	}


	public JTextField getTxtLastName() {
		return txtLastName;
	}


	public void setTxtLastName(JTextField txtLastName) {
		this.txtLastName = txtLastName;
	}


	public JTextField getTxtDayOfBirth() {
		return txtDayOfBirth;
	}


	public void setTxtDayOfBirth(JTextField txtDayOfBirth) {
		this.txtDayOfBirth = txtDayOfBirth;
	}


	public JTextField getTxtHomeAdress() {
		return txtHomeAdress;
	}


	public void setTxtHomeAdress(JTextField txtHomeAdress) {
		this.txtHomeAdress = txtHomeAdress;
	}


	public JTextField getTxtTelNum() {
		return txtTelNum;
	}


	public void setTxtTelNum(JTextField txtTelNum) {
		this.txtTelNum = txtTelNum;
	}


	public JTextField getTxtEmail() {
		return txtEmail;
	}


	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}


	public JTextField getTxtWorkAdress() {
		return txtWorkAdress;
	}


	public void setTxtWorkAdress(JTextField txtWorkAdress) {
		this.txtWorkAdress = txtWorkAdress;
	}


	public JTextField getTxtIdNum() {
		return txtIdNum;
	}


	public void setTxtIdNum(JTextField txtIdNum) {
		this.txtIdNum = txtIdNum;
	}


	public JTextField getTxtTitle() {
		return txtTitle;
	}


	public void setTxtTitle(JTextField txtTitle) {
		this.txtTitle = txtTitle;
	}


	public JTextField getTxtPosition() {
		return txtPosition;
	}


	public void setTxtPosition(JTextField txtPosition) {
		this.txtPosition = txtPosition;
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


	public JButton getBtnEdit() {
		return btnEdit;
	}


	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}



}
