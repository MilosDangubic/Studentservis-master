package view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.AboutControler;
import controller.CloseApp;
import controller.DeleteEntity;
import controller.HelpControler;
import controller.NewEntityAdd;
import controller.new_student.EditControler;

public class MenuBar extends JMenuBar
{
	public static final long serialVersionUID=32616873898087L;
	
	
	
	public  MenuBar() 
	{
		JMenu files= new JMenu("Files");
		JMenu edit= new JMenu("Edit");
		JMenu help= new JMenu("Help");
		
		//TODO bind Action
		JMenuItem newEntity= new JMenuItem(new NewEntityAdd());
		//TODO bind Action
		JMenuItem closeApp= new JMenuItem(new CloseApp());
		files.add(newEntity);
		files.add(closeApp);
		//TODO bind Action
		JMenuItem deleteEntity= new JMenuItem(new DeleteEntity());
		//TODO bind Action
		JMenuItem editEntity= new JMenuItem(new EditControler());
		edit.add(deleteEntity);
		edit.add(editEntity);
		
		
		JMenuItem helpMenuItem= new JMenuItem( new HelpControler());
		JMenuItem about= new JMenuItem(new AboutControler());
		help.add(helpMenuItem);
		help.add(about);
		
		
		add(files);
		add(edit);
		add(help);
	}
	

}
