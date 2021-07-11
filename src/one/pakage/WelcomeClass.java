package one.pakage;

import java.io.IOException;
import java.util.Scanner;

public class WelcomeClass {

	public static void main(String[] args) throws IOException {
		

  {
	        System.out.println(" Welcome from LockedMe Application for File Operations");
	        System.out.println("Develop by :-  VIJAY PATIL ");
	        Scanner WC = new Scanner(System.in);

	            while (true) {
	                System.out.println("");
	                System.out.println("Type y to Continue the File operation or e to exit:-");
	                String ask = WC.nextLine();
	                if (ask.equals("y")) {
	                    System.out.println("Choose Below option as per your Requirement\n Option Menu Are:-");
	                    
	                    System.out.println("Press - s - To Show all file." );
	                    System.out.println("Press - c - To create a New file Enter");
	                    System.out.println("Press - d - To Delete a File ");
	                    System.out.println("Press - r - To Read File ");
	                    System.out.println("Press - f - To Search(Find) ");
	                    System.out.println("Pressyy - e - To Exit from Application  ");
	                    	                    	                   	              
	                    System.out.println("Please select correct option to perform the application :- ");
	                } else if (ask.equals("e")) {
	                    Exit ex = new Exit();
	                    ex.Exit();
	                    break;
	                } else {
	                    System.err.println(" Invalid option please choose correct option and restart the application ");
	                    return ;
	                }
	                String as = WC.nextLine();
	                if (as.equals("e")){
	                        Exit EX = new Exit();
	                        EX.Exit();
	                        break;
	                }
	                switch (as) {
	                    case "s":
	                        ShowFile sow = new ShowFile();
	                        sow.ShowFile();
	                        break;
	                    case "c":
	                        AddNewFile crt = new AddNewFile();
	                        crt.AddNewFile();
	                        break;
	                    case "d":
	                        DeleteFile de = new DeleteFile();
	                        de.DeleteFile();
	                        break;
	                    case "r":
	                        Readfile re = new Readfile();
	                        re.Readfile();
	                        break;
	                    case "f":
	                        SearchFile sf = new SearchFile();
	                        sf.SearchFile();
	                        break;

	                    default:
	                        System.err.println(" Invalid option please choose correct option form Option Menu ");
	                }
	            }
	        }
	    


	}

}
