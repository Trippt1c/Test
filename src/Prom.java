import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
public class Prom {
    private static ArrayList<Table> tables;
    //main class that runs everything
    public static void main(String[] args) throws IOException {

    }

    public static void addTable()
    {
        tables.add(new Table(tables.size()+1));
    }

    public static void addTable(Table t)
    {
        tables.add(t);
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
