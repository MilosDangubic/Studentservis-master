package view.new_entity;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import controller.new_student.NewStudentAdd;
import controller.new_student.SaveEditedStudentControler;

public class NewStudentWindow  extends JFrame
{
	private static NewStudentWindow instance;
	private JLabel lblFirstName;
	private JLabel lblLastName;
	private JLabel lblDate;
	private JLabel lblAdress;
	private JLabel lblPhoneNumber;
	private JLabel lblIndexNumber;
	private JLabel lblCurrentYearOfStudy;
	private JLabel lblAverageMark;
	
	private JLabel lblBudget;
	private JLabel lblSamofinansiranje;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtDate;
	private JTextField txtAdress;
	private JTextField txtPhoneNumber;
	private JTextField txtIndexNumber;
	private JTextField txtAverageMark;
	private ButtonGroup btnG;
	private JRadioButton rbtnB;
	private JRadioButton rbtnS;
	private JButton btnSave;
	private JButton btnCancel;
	private JButton btnEdit;
	private JComboBox<String> cb;
	
	
	
	public static NewStudentWindow getInstance() 
	{
		if(instance==null) 
		{
			System.out.println("TEST");
			instance=new NewStudentWindow();
		}
		
		return instance;
		
	}
	public NewStudentWindow() 
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(600, 600));
		this.pack();
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		this.setTitle("Student");
		this.setLayout(new BorderLayout());
		
		
		lblFirstName= new JLabel("First name");
		lblLastName= new JLabel("Last name");
		lblDate=new JLabel("Date of birth");
		lblAdress=new JLabel("Adress");
		lblPhoneNumber= new JLabel("Phone number");
		lblIndexNumber= new JLabel("Index number");
		lblCurrentYearOfStudy= new JLabel("Current year of study");
		lblBudget= new JLabel("Budget");
		lblSamofinansiranje= new JLabel("Samofinansiranje");
		lblAverageMark= new JLabel("Average mark");
		btnSave = new JButton(new NewStudentAdd());
		btnCancel = new JButton("cancel");
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				NewStudentWindow.getInstance().dispose();
			}
		});	
		
		
		btnEdit= new JButton(new SaveEditedStudentControler());
		
		txtFirstName= new JTextField();
		txtFirstName.setPreferredSize(new Dimension(300,30));
		txtLastName= new JTextField();
		txtLastName.setPreferredSize(new Dimension(300,30));
		txtDate= new JTextField();
		txtDate.setPreferredSize(new Dimension(300,30));
		txtAdress= new JTextField();
		txtAdress.setPreferredSize(new Dimension(300,30));
		txtPhoneNumber= new JTextField();
		txtPhoneNumber.setPreferredSize(new Dimension(300,30));

		txtIndexNumber= new JTextField();
		txtIndexNumber.setPreferredSize(new Dimension(300,30));
		txtAverageMark= new JTextField();
		txtAverageMark.setPreferredSize(new Dimension(300,30));


		rbtnB= new JRadioButton();
		rbtnS= new JRadioButton();
		btnG= new ButtonGroup();
		String[] data= {"I(first)","II(second)",
				"III(third)","IV(fourth)"};
		cb= new JComboBox<>(data);
		
		btnG.add(rbtnB);
		btnG.add(rbtnS);
		
		
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
		pnlDayOfBirth.add(lblDate);
		pnlDayOfBirth.add(txtDate);
		
		JPanel pnlAdress = new JPanel();
		pnlAdress.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlAdress.add(lblAdress);
		pnlAdress.add(txtAdress);
		
		JPanel pnlTelephoneNum = new JPanel();
		pnlTelephoneNum.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlTelephoneNum.add(lblPhoneNumber);
		pnlTelephoneNum.add(txtPhoneNumber);
		
		JPanel pnlIndexNum = new JPanel();
		pnlIndexNum.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlIndexNum.add(lblIndexNumber);
		pnlIndexNum.add(txtIndexNumber);
		
		JPanel pnlYearOfStudy = new JPanel();
		pnlYearOfStudy.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlYearOfStudy.add(lblCurrentYearOfStudy);
		pnlYearOfStudy.add(cb);
		
		JPanel pnlRadioB = new JPanel();
		pnlRadioB.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlRadioB.add(lblBudget);
		pnlRadioB.add(rbtnB);
		
		JPanel pnlRadioS = new JPanel();
		pnlRadioS.setLayout(new FlowLayout(FlowLayout.LEFT));
		pnlRadioS.add(lblSamofinansiranje);
		pnlRadioS.add(rbtnS);
		
		JPanel pnlButton = new JPanel();
		pnlButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		pnlButton.add(btnSave);
		pnlButton.add(btnEdit);
		pnlButton.add(btnCancel);
		
		
		JPanel averageMark= new JPanel();
		averageMark.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		averageMark.add(lblAverageMark);
		averageMark.add(txtAverageMark);
		
		
		JPanel mainPanel= new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		
		mainPanel.add(pnlFirstName);
		mainPanel.add(pnlLastName);
		mainPanel.add(pnlDayOfBirth);
		mainPanel.add(pnlAdress);
		mainPanel.add(pnlTelephoneNum);
		mainPanel.add(pnlIndexNum);
		mainPanel.add(pnlYearOfStudy);
		mainPanel.add(pnlRadioB);
		mainPanel.add(pnlRadioS);
		mainPanel.add(averageMark);
		mainPanel.add(pnlButton);

		
		this.add(mainPanel,BorderLayout.CENTER);
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
	public JLabel getLblDate() {
		return lblDate;
	}
	public void setLblDate(JLabel lblDate) {
		this.lblDate = lblDate;
	}
	public JLabel getLblAdress() {
		return lblAdress;
	}
	public void setLblAdress(JLabel lblAdress) {
		this.lblAdress = lblAdress;
	}
	public JLabel getLblPhoneNumber() {
		return lblPhoneNumber;
	}
	public void setLblPhoneNumber(JLabel lblPhoneNumber) {
		this.lblPhoneNumber = lblPhoneNumber;
	}
	public JLabel getLblIndexNumber() {
		return lblIndexNumber;
	}
	public void setLblIndexNumber(JLabel lblIndexNumber) {
		this.lblIndexNumber = lblIndexNumber;
	}
	public JLabel getLblCurrentYearOfStudy() {
		return lblCurrentYearOfStudy;
	}
	public void setLblCurrentYearOfStudy(JLabel lblCurrentYearOfStudy) {
		this.lblCurrentYearOfStudy = lblCurrentYearOfStudy;
	}
	public JLabel getLblBudget() {
		return lblBudget;
	}
	public void setLblBudget(JLabel lblBudget) {
		this.lblBudget = lblBudget;
	}
	public JLabel getLblSamofinansiranje() {
		return lblSamofinansiranje;
	}
	public void setLblSamofinansiranje(JLabel lblSamofinansiranje) {
		this.lblSamofinansiranje = lblSamofinansiranje;
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
	public JTextField getTxtDate() {
		return txtDate;
	}
	public void setTxtDate(JTextField txtDate) {
		this.txtDate = txtDate;
	}
	public JTextField getTxtAdress() {
		return txtAdress;
	}
	public void setTxtAdress(JTextField txtAdress) {
		this.txtAdress = txtAdress;
	}
	public JTextField getTxtPhoneNumber() {
		return txtPhoneNumber;
	}
	public void setTxtPhoneNumber(JTextField txtPhoneNumber) {
		this.txtPhoneNumber = txtPhoneNumber;
	}
	public JTextField getTxtIndexNumber() {
		return txtIndexNumber;
	}
	public void setTxtIndexNumber(JTextField txtIndexNumber) {
		this.txtIndexNumber = txtIndexNumber;
	}
	public ButtonGroup getBtnG() {
		return btnG;
	}
	public void setBtnG(ButtonGroup btnG) {
		this.btnG = btnG;
	}
	public JRadioButton getRbtnB() {
		return rbtnB;
	}
	public void setRbtnB(JRadioButton rbtnB) {
		this.rbtnB = rbtnB;
	}
	public JRadioButton getRbtnS() {
		return rbtnS;
	}
	public void setRbtnS(JRadioButton rbtnS) {
		this.rbtnS = rbtnS;
	}
	public JButton getBtnSave() {
		return btnSave;
	}
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
	public JComboBox<String> getCb() {
		return cb;
	}
	public void setCb(JComboBox<String> cb) {
		this.cb = cb;
	}
	public static void setInstance(NewStudentWindow instance) {
		NewStudentWindow.instance = instance;
	}
	public JLabel getLblAverageMark() {
		return lblAverageMark;
	}
	public void setLblAverageMark(JLabel lblAverageMark) {
		this.lblAverageMark = lblAverageMark;
	}
	public JTextField getTxtAverageMark() {
		return txtAverageMark;
	}
	public void setTxtAverageMark(JTextField txtAverageMark) {
		this.txtAverageMark = txtAverageMark;
	}
	public JButton getBtnEdit() {
		return btnEdit;
	}
	public void setBtnEdit(JButton btnEdit) {
		this.btnEdit = btnEdit;
	}
		
		
	
	
	
		
	}
	
	
	

