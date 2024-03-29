import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
/*
This file was made by dylan test
*/
public class excelReader {
    private Scanner in;

    //this class acts as a kind of scanner
    public excelReader(String fileName) throws IOException
    {
        in = new Scanner(new File(fileName));
    }

    //basic nextLine functionality
    public String nextLine()
    {
        return in.nextLine();
    }

    //only access scanner if needed
    public Scanner getIn() {
        return in;
    }

    //parses CSV file to make a new student
    public Student nextStudent()
    {
        // assumes order of spreadsheet is name, ID, Group#
        String[] student = in.nextLine().split(",");
        return new Student(student[1],student[2]+student[3]+student[4],Integer.parseInt(student[5]));
    }

    // creates and returns groups of students based on the sheet

}
