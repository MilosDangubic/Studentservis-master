package view;

import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class OurConfiguration 
{
	private static Path currentRelativePath = Paths.get("");
	public static Path  relativePath=Paths.get("");
	public static String resourcesPath= relativePath.toAbsolutePath().toString()+"/resources/"; 
	
	public static Icon newIcon = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/plus.png");
	public static Icon closeIcon = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/close.png");
	public static Icon addIcon = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/add.png");
	public static Icon editIcon = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/edit.png");
	public static Icon deleteIcon = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/bin.png");
	public static Icon add1 = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/friend.png");
	public static Icon add2 = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/friends.png");
	public static Icon about = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/about.png");
	public static Icon help = new ImageIcon(currentRelativePath.toAbsolutePath().toString() + "/resources/question.png");

}
