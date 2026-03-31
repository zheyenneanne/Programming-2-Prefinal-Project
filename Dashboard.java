import javax.swing.*;

public class Dashboard extends JFrame {

    private JButton btnInvoice;
    private JButton btnLogout;
    private JPanel DashPanel;

    public Dashboard() {

        btnInvoice.addActionListener(e -> {
             new InvoiceGenerator().setVisible(true);

        });

        btnLogout.addActionListener(e -> {
            new LoginForm();
            dispose();
        });
    }
}
