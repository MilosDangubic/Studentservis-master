package controller;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import view.AboutWindow;
import view.OurConfiguration;;

public class AboutControler extends AbstractAction
{

	private static final long serialVersionUID = -2526738195212606296L;

	public AboutControler() 
	{
		super("About", OurConfiguration.about);
		putValue(SHORT_DESCRIPTION, "About");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		AboutWindow.getInstance();
		
	}
}
