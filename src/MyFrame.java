import javax.swing.*;
public class MyFrame extends JFrame
{
    public MyFrame(){
        setTitle("My empty Frame");
        setSize(300,200);
        setLocation(10,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        JFrame test = new MyFrame();
        test.setVisible(true);
    }
}
