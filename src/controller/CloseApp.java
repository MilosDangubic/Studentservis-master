package controller;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import view.OurConfiguration;


public class CloseApp extends AbstractAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4548877033153022976L;

	public CloseApp() {
		super("Close", OurConfiguration.closeIcon);
		putValue(SHORT_DESCRIPTION, "Close application");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
