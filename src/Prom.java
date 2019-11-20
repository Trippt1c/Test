import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.IntStream;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
public class Prom {
    private static ArrayList<Table> tables;
    private static ArrayList<Group> allGroups;
    private static int maxSize;
    //main class that runs everything
    public static void main(String[] args) throws IOException {
        setup(10);
        printTables();
    }

    public static void addTable()
    {
        tables.add(new Table(tables.size()+1,maxSize));
    }

    public static void addTable(Table t)
    {
        tables.add(t);
    }

    public void setMaxSize(int i)
    {
        maxSize = i;
    }
    public static void create(int i)
    {
        //main logic method
        int pos = 0;
        for(Group x: allGroups){


        }
    }

    public static void setup(int i)
    {
        IntStream.rangeClosed(0,i).forEach(x -> tables.add(new Table(x,maxSize)));
    }

    /* works as "toString"
    prints like this
    Table 1
    ----------
    Group 1: Bob Dylan, Joe Davis, Gregg Scott
    Group 2: Jehsikhca Jones, Miss Steak, Spontaneouise Le
    ----------
     */

    public static void printTables()
    {
        for (int i = 0; i <tables.size(); i++) {
            System.out.println("Table "+i+"\n"+"--------------");
            System.out.println(tables.get(i).toString());
            System.out.println("------------");
        }

    }


}
