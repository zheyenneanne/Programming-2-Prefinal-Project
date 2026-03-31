import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class InvoiceGenerator extends JFrame {

    JTextField txtClient, txtProject, txtHours, txtRate;
    JComboBox<String> statusBox;
    JTable table;
    DefaultTableModel model;
    JPanel generatorPanel;
    JButton btnCalculate, btnAdd, btnClear;
    JLabel txtTotal;
    private JScrollPane TABLE;


    public InvoiceGenerator()  {
        setTitle("Freelance Invoice Generator");
        setSize(700, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setContentPane(generatorPanel);
        String[] column = {"Client", "Project", "Total", "Status"};
        model = new DefaultTableModel(column, 0);
        table.setModel(model);

        btnCalculate.addActionListener(e -> {
            try {
                double hours = Double.parseDouble(this.txtHours.getText());
                double rate = Double.parseDouble(txtRate.getText());
                double total = hours * rate;
                txtTotal.setText(String.valueOf(total));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Invalid input");
            }
        });


        btnAdd.addActionListener(e -> {
            model.addRow(new Object[]{
                    txtClient.getText(),
                    txtProject.getText(),
                    txtTotal.getText(),
                    statusBox.getSelectedItem()
            });
        });

        // Clear Fields
        btnClear.addActionListener(e -> {
            txtClient.setText("");
            txtProject.setText("");
            txtHours.setText("");
            txtRate.setText("");
            txtTotal.setText("");
        });
    }

    public static void main(String[] args) {
        new InvoiceGenerator();
    }
}
