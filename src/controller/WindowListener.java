package controller;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import serialiazation.Serialiaze;

public class WindowListener extends WindowAdapter{
	public void windowClosing(WindowEvent e)
	{
		System.out.println("Window closing recevied");
		Serialiaze.serialiaze();
	}
	
	public void windowOpened(WindowEvent e)
	{
		System.out.println("WIndow opening recevied");
		Serialiaze.deserialiaze();
		view.MainWindowComponents.initializeStudentTable();
		view.MainWindowComponents.initializeSubjectTable();
		view.MainWindowComponents.initializeProfessorTable();
	}
}
