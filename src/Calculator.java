import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Calculator extends JFrame {

    public Calculator() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240, 370);
        setResizable(false);
        setLocationRelativeTo(null);

        Container container = getContentPane();
        container.setBackground(Color.DARK_GRAY);

        JTextField inputSpace = new JTextField("0");
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Dialog", Font.PLAIN, 40));
        inputSpace.setBackground(Color.DARK_GRAY);
        inputSpace.setForeground(Color.WHITE);
        inputSpace.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 1)));

        container.add(BorderLayout.NORTH, inputSpace);

        JPanel btnPanel = new JPanel();
        btnPanel.setBackground(Color.DARK_GRAY);
        btnPanel.setLayout(new GridLayout(5,4,1,1));
        String buttonNames[] = {"C", "±","%", "÷", "7", "8", "9", "x","4", "5", "6", "-", "1", "2", "3","+", " ", "0", ".", "="};

        for (int i = 0; i < buttonNames.length; i++) {
            JButton jButton = new JButton(buttonNames[i]);
            jButton.setText(buttonNames[i]);
            jButton.setFont(new Font("Dialog", Font.BOLD, 20));
            jButton.setBorder(new TitledBorder(new LineBorder(Color.DARK_GRAY, 1)));
            jButton.setForeground(Color.WHITE);

            if(buttonNames[i].matches("[÷+=x-]")) {
                jButton.setBackground(new Color(255, 159, 9));
            }else if(buttonNames[i].matches("[C±%]")) {
                jButton.setBackground(new Color(97, 99, 102));
            } else if (buttonNames[i].matches(" ")) {
                jButton.setBackground(Color.DARK_GRAY);
            } else {
                jButton.setBackground(new Color(123, 125, 127));
            }

            btnPanel.add(jButton);
        }

        container.add(btnPanel);

        setVisible(true);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
