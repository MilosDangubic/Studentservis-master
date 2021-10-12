package mainPackage;

import javax.swing.UIManager;

import view.MainWindow;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  
        try { 
        	  
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel"); 
        } 
        catch (Exception e) { 
            System.out.println("Look and Feel problem"); 
        } 
        
        
        
		MainWindow.getInstance();
		

	}

}
