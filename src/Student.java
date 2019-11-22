import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
/*
This file was made by dylan
*/
public class Student {

    //Student info
    private String Name;
    private String ID;

    //Ticket info
    private String ticketID1;
    private String ticketID2;
    private int numTicks;

    //Placement
    private int groupId;
    private int tableId;

    //create full student
    public Student(String n, String id, int grId, String tickId1, String tickId2, int numT, int tabId)
    {
      Name = n;
      ID = id;
      groupId = grId;
      ticketID1 = tickId1;
      ticketID2 = tickId2;
      tableId = tabId;
      numTicks = numT;

    }

    //create default student
    public Student(String n, String id, int numT)
    {
        Name = n;
        ID = id;
        numTicks = numT;
    }


    //getters
    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }


    public int getNumTicks() {
        return numTicks;
    }

    public String getTicketID1() {
        return ticketID1;
    }

    public String getTicketID2() {
        return ticketID2;

    }
    public ArrayList<String> getTicketIDs() {
        return Arrays.stream(new String[]{ticketID1,ticketID2}).collect(Collectors.toCollection(ArrayList::new));
    }

    public int getTableId() {
        return tableId;
    }

    public int getGroupId() {
        return groupId;
    }

    //setters
    public void setTicketID1(String ticketID1) {
        this.ticketID1 = ticketID1;
    }

    public void setTicketID2(String ticketID2) {
        this.ticketID2 = ticketID2;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
