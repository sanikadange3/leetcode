import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prac6 extends JFrame implements ActionListener {
    JTextField t1, t2, t3;
    JButton b;

    prac6() {
        setTitle("Previous and Next Number");
        setSize(800, 600);
        setLayout(new FlowLayout());

        t1 = new JTextField(10);
        t2 = new JTextField(10);
        t3 = new JTextField(10);
        b = new JButton("Calculate");

        add(new JLabel("Enter Number:"));
        add(t1);
        add(new JLabel("Previous Number:"));
        add(t2);
        add(new JLabel("Next Number:"));
        add(t3);
        add(b);

        b.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int n = Integer.parseInt(t1.getText());
        t2.setText(String.valueOf(n - 1));
        t3.setText(String.valueOf(n + 1));
    }

    public static void main(String[] args) {
        new prac6();
    }
}