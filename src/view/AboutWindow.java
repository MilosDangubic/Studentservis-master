package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class AboutWindow  extends JFrame
{
	private static final long serialVersionUID = -6744694755937183530L;
	private static AboutWindow instance;
	
	public static AboutWindow getInstance() {
		if(AboutWindow.instance == null) {
			AboutWindow.instance = new AboutWindow();
		}
		AboutWindow.instance.show();
		return AboutWindow.instance;
	}
	
	public AboutWindow() {
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(600, 200));
		this.pack();
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		this.setTitle("Attribute");
		this.setLayout(new BorderLayout());
		

		//panel za opis o nacinu koriscenja aplikacije.
		JPanel top = new JPanel();
		Border blackline = BorderFactory.createTitledBorder("Verzija");
		top.setLayout(new FlowLayout(FlowLayout.LEFT));
		String spaces = " ";
		top.add(new JLabel(spaces + "Koja verzija" + spaces));
		top.setBorder(blackline);
		
		this.setVisible(true);
		this.add(top, BorderLayout.NORTH);
		
		//panel za prikaz precica za olaksavanje rada
		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout(FlowLayout.LEFT));
		Border blackline2 = BorderFactory.createTitledBorder("Biografija");
		
		bottom.add(new JLabel(spaces + "Autori" + spaces));
		bottom.setBorder(blackline2);
		
		this.setVisible(true);
		this.add(bottom, BorderLayout.SOUTH);
		
	}

}
