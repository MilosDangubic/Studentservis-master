package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

import controller.WindowListener;
import javafx.scene.layout.Border;
import model.Model;

public class MainWindow extends JFrame {
	private static final long serialVersionUID = 2313125312313L;

	private  static MainWindow instance;
	private Model model;
	private MainWindowComponents components;
	
	public static MainWindow getInstance()
	{
		if(MainWindow.instance == null)
		{
			MainWindow.instance = new MainWindow();
		}
		
		return MainWindow.instance;
	}
	
	public Model getModel() 
	{
		
		return model;
	}
	public static void setInstance(MainWindow instance) {
		MainWindow.instance = instance;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public MainWindow()
	{
		this.addWindowListener(new WindowListener());
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		this.setLayout(new BorderLayout());
		this.setTitle("STUDENTSKA SLUZBA");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setPreferredSize(new Dimension(dim.width*3/4, dim.height*3/4));
		this.pack();

		
		this.setJMenuBar(new MenuBar());
		this.add(new ToolBar(), BorderLayout.NORTH);
		this.add(new StatusBar(),BorderLayout.SOUTH);
		this.setMaximumSize(dim);
		components= new MainWindowComponents();
		this.add(components,BorderLayout.CENTER);
		
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);

		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setVisible(true);
		
		
	}
}
