import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
        //return new Student(student[0],student[1],Integer.parseInt(student[2]),student[3]);
        return null;
    }

    // creates and returns groups of students based on the sheet
    public ArrayList<Group> getGroups()
    {
        //NEEDS A REDO
        HashMap<Integer,Group> grouped = new HashMap<>();

        while(in.hasNext())
        {
            Student temp = nextStudent();

            if(!grouped.containsKey(temp.getGroupId()))
            {

                grouped.put(temp.getGroupId(),new Group(temp.getGroupId()));
                grouped.get(temp.getGroupId()).addStudent(temp);

            }
            else
            {

                grouped.get(temp.getGroupId()).addStudent(temp);

            }
        }

        return (ArrayList<Group>) grouped.values();
    }
}
