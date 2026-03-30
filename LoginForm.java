import javax.swing.*;
import java.awt.*;

public class LoginForm extends JFrame {
    JTextField txtUser;
    JPasswordField txtPass;
    JButton btnLogin;
    JPanel txtPanel;
    JLabel sheet;

    public LoginForm() {
        setTitle("Login");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    setContentPane(txtPanel);
    setVisible(true);


        // Button action
        btnLogin.addActionListener(e -> {
            String user = txtUser.getText();
            String pass = new String(txtPass.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                new Dashboard().setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Invalid credentials!");
            }
        });
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}