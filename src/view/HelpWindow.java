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


public class HelpWindow extends JFrame
{
	private static final long serialVersionUID = 1868649466796622763L;
	private static HelpWindow instance;
	
	@SuppressWarnings("deprecation")
	public static HelpWindow getInstance() {
		if(HelpWindow.instance == null) {
			HelpWindow.instance = new HelpWindow();
		}
		HelpWindow.instance.show();
		return HelpWindow.instance;
	}
	
	public HelpWindow()
	{
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(600, 200));
		this.pack();
		this.setLocation(dim.width/2 - this.getSize().width/2, dim.height/2 - this.getSize().height/2);
		this.setTitle("Attribute");
		this.setLayout(new BorderLayout());
		
		//panel za opis o nacinu koriscenja aplikacije.
		JPanel top = new JPanel();
		Border blackline = BorderFactory.createTitledBorder("Opis");
		top.setLayout(new FlowLayout(FlowLayout.LEFT));
		String spaces = " ";
		top.add(new JLabel(spaces + "Opis o koriscenju" + spaces));
		top.setBorder(blackline);
		
		this.setVisible(true);
		this.add(top, BorderLayout.NORTH);
		
		//panel za prikaz precica za olaksavanje rada
		JPanel bottom = new JPanel();
		bottom.setLayout(new FlowLayout(FlowLayout.LEFT));
		Border blackline2 = BorderFactory.createTitledBorder("Precice");
		
		bottom.add(new JLabel(spaces + "Opis  precica" + spaces));
		bottom.setBorder(blackline2);
		
		this.setVisible(true);
		this.add(bottom, BorderLayout.SOUTH);
		
	}
}
