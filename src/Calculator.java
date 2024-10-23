import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        setTitle("계산기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(240, 370);

        setVisible(true);
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
