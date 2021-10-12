package serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import model.Model;
import view.MainWindow;
import view.OurConfiguration;

public class Serialiaze {
	public static void serialiaze () 
	{
		try {
			FileOutputStream fos = new FileOutputStream(OurConfiguration.resourcesPath + "data.ss");
			ObjectOutputStream oos= new ObjectOutputStream(fos);
			oos.writeObject(MainWindow.getInstance().getModel());
			fos.close();
			oos.close();
			System.out.println("Serilization has finished succesfuly");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void deserialiaze() 
	{
		Model model=null;
		try {
			FileInputStream fis = new FileInputStream(OurConfiguration.resourcesPath + "data.ss");
			ObjectInputStream ois= new ObjectInputStream(fis);
			 model= (Model)ois.readObject();
			fis.close();
			ois.close();
			System.out.println("Deserialization has finished succesfuly");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(model!=null) 
		{
			MainWindow.getInstance().setModel(model);
		}
		else 
		{
			MainWindow.getInstance().setModel(new Model());
		}
		
	}
}
