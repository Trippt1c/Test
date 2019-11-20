/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
/*
This file was made by dylan
*/
public class Student {

    private String Name;
    private String ID;
    private int groupId;
    private String ticketID;

    //students come from one CSV
    public Student(String n, String i, int g,String t)
    {
      Name = n;
      ID = i;
      groupId = g;
      ticketID = t;
    }

    public int getGroupId() {
        return groupId;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }
}
