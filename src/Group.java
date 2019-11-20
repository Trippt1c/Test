import java.util.ArrayList;

/**
 * Created by Tripptic on 11/19/2019.
 * Project: PromPTing
 * Good Luck
 */
/*
This file was made by dylan
*/
public class Group {

    private int ID;
    private ArrayList<Student> students;

    //stores groups of students from 1-10
    public Group() {
        ID = 0;
        students = new ArrayList<Student>();
    }

    public Group(int i) {
        ID = i;
        students = new ArrayList<Student>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public int getID() {
        return ID;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public int size() {
        return students.size();
    }

    @Override
    public String toString() {
        String grouped="";
        for (Student x:students) {
            grouped+=x.getName()+", ";
        }
        return grouped;
    }
}
