import java.util.ArrayList;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
public class Table {

    private int ID;
    private ArrayList<Group> seated;

    //stores groups of students. singles will be added to their own group
    public Table(int i)
    {
        ID = i;
        seated = new ArrayList<Group>();
    }

    public ArrayList<Group> getSeated() {
        return seated;
    }

    public int getID() {
        return ID;
    }

    public void addGroup(Group g)
    {
        seated.add(g);
    }

    /*prints like this
    Group 1: Bob Dylan, Joe Davis, Gregg Scott
    Group 2: Jehsikhca Jones, Miss Steak, Spontaneouise Le
     */
    public String toString()
    {
        String groups = "";
        for (int i=0;i<seated.size();i++) {
            groups+="Group "+i+":"+seated.get(i).getStudents().toString()+"\n";
        }
        return groups;
    }
}
