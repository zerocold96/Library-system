package librarysystem;
import javax.swing.*;
import java.awt.event.*;

public class Login extends JFrame {

public static void main(String[] args) {
Login frameTabel = new Login();
}

private final JButton loginButton = new JButton("LOGIN");
private final JPanel panel = new JPanel();
private final JTextField loginIDText = new JTextField(15);
private final JPasswordField passwordText = new JPasswordField(15);
private final JLabel userLabel = new JLabel("LOGIN ID: ");
private final JLabel passLabel = new JLabel("PASSWORD: ");

Login(){
    super("Library System Login");
    setSize(300,200);
    setLocation(500,280);
    panel.setLayout (null);


    loginIDText.setBounds(85,30,150,20);
    passwordText.setBounds(85,65,150,20);
    loginButton.setBounds(110,100,80,20);
    userLabel.setBounds(10,30,80,20);
    passLabel.setBounds(10,65,80,20);

    panel.add(loginButton);
    panel.add(loginIDText);
    panel.add(passwordText);
    panel.add(userLabel);
    panel.add(passLabel);

    getContentPane().add(panel);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    actionlogin();
}

public void actionlogin(){
    loginButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String puname = loginIDText.getText();
            String ppaswd = passwordText.getText();
            
            if(puname.equals("test") && ppaswd.equals("12345")) {
                Welcome regFace =new Welcome();
                regFace.setVisible(true);
                dispose();
                } else {

                    JOptionPane.showMessageDialog(null,"Invalid LoginID or Password");
                    loginIDText.setText("");
                    passwordText.setText("");
                    loginIDText.requestFocus();
                 }

            }
        });
    }
}



