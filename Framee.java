import javax.swing.*;

public class Framee extends JFrame{
    public JLabel label = new JLabel("登入成功");
    public Framee(){
        q();
    }
    public void q(){
        this.setBounds(10,10,400,400);
        label.setBounds(0,100,200,200);
        this.add(label);
    }
}
