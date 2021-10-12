package controller;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import view.HelpWindow;
import view.OurConfiguration;;

public class HelpControler extends AbstractAction
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5958812600759711154L;
	
	public HelpControler() 
	{
		super("Help", OurConfiguration.help);
		putValue(SHORT_DESCRIPTION, "App help");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		HelpWindow.getInstance();
		
	}

}
