import javax.swing.*;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {
    public JLabel id = new JLabel("ID");
    public JLabel pw = new JLabel("PW");
    public JButton login = new JButton("log in");
    public JButton EXIT = new JButton("EXIT ");
    public JTextField a = new JTextField();
    public JPasswordField b = new JPasswordField();

    public Frame(){
        ha();
    }
    public void ha(){
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(10,10,400,400);
        setTitle("輸入帳號密碼");
        id.setBounds(0,0,140,40);
        pw.setBounds(0,50,140,40);
        a.setBounds(150,0,140,40);
        b.setBounds(150,50,140,40);
        login.setBounds(300,300,80,40);
        EXIT.setBounds(100,300,80,40);
        this.add(id);
        this.add(pw);
        this.add(login);
        this.add(EXIT);
        this.add(a);
        this.add(b);

        EXIT.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        login.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (a.getText().equals("ha") && (new String(b.getPassword())).equals("000")){
                    Framee frm2 = new Framee();
                    frm2.setVisible(true);
                    Frame.this.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null,"error");
                }
            }
        });
    }
}
