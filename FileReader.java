package gitChallenge31.GitChallenge31;

import java.io.*;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) throws IOException {
        //http://textfiles.com/100/captmidn.txt
        File file = new File("/Users/aichumamat/Desktop/31GitHub/captmidn.txt");
        Scanner sc = new Scanner(file);
        //this reads the first line  of the file
//        System.out.println(sc.nextLine());

        //let's get all the lines in the file
//        while(sc.hasNextLine()){
//            System.out.println(sc.nextLine());
//        }

        //let's export that to a new file by storing into a String and will make a change in a text
        String fileContent = "This is a new file created by Aichu.";
        while(sc.hasNextLine()){

            //this concatenates the previous String line and adding new line
        fileContent = fileContent.concat(sc.nextLine() + "\n");

        //let's add the path to a new file, saving it on a desktop
            FileWriter writer = new FileWriter("/Users/aichumamat/Desktop/wowfile.txt");
            writer.write(fileContent);
            writer.close();
        }


    }
}
