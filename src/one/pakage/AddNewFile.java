package one.pakage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AddNewFile {

    public void AddNewFile() throws IOException {
        //2 tims nned to give folder address

        File FileDir = new File("C:\\Users\\User\\eclipse-workspace\\Phase1Project-LockedMe\\My File\\");
        if (FileDir.isDirectory()) {
            Scanner FileName = new Scanner(System.in);
            System.out.println("Enter the file name you wants to create with Extension( Like- .txt,.doc etc) :- ");
            String Nufil = FileName.nextLine();
            File Newfile = new File("C:\\Users\\User\\eclipse-workspace\\Phase1Project-LockedMe\\My File\\" + Nufil);
            Newfile.createNewFile();
            System.out.println(" Your File is Created Successfully ,Name of Your file is - " + Nufil);
            FileWriter writfile = new FileWriter(Newfile);
            System.out.println("Write your words in your new file :- ");
            String Write = FileName.nextLine();
            writfile.write(Write);
            writfile.close();
            System.out.println("Successfully wort to the file - "+Nufil);
        }
        else {
            System.out.println(FileDir.getAbsolutePath() + " Please Give correct Path of Directory or folder ");
        }
    }
    public static void main(String[] args) throws IOException {
        AddNewFile addfile = new AddNewFile();
        addfile.AddNewFile();

    }
}


