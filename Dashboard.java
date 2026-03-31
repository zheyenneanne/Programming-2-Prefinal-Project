import javax.swing.*;

public class Dashboard extends JFrame {

    private JButton btnInvoice;
    private JButton btnLogout;
    private JPanel DashPanel;

    public Dashboard() {
        setTitle("Dashboard");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(DashPanel);
        setVisible(true);

        btnInvoice.addActionListener(e -> {

        });

        btnLogout.addActionListener(e -> {
            new LoginForm();
            dispose();
        });
    }
}
