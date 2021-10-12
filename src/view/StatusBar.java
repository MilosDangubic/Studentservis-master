package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

public class StatusBar extends JPanel
{
	
	private static final long serialVersionUID=12345678976L;
	
	public StatusBar() 
	{
		this.setLayout(new BorderLayout());
		JPanel pnlLeft= new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel pnlRight= new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JLabel lblName= new JLabel("Studentska sluzba");
		pnlLeft.add(lblName);
		JLabel lblDate= new JLabel("");
		pnlRight.add(lblDate);

		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Date now = new Date();
				String ss = DateFormat.getDateTimeInstance().format(now);
				lblDate.setText(ss);
			}
		});
	    timer.start();
		
		

		this.add(pnlLeft,BorderLayout.WEST);
		this.add(pnlRight,BorderLayout.EAST);
	}
	

}
