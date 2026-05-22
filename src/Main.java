import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

void main() {
    JFrame frame = new JFrame("Simple Calculator");
    Image Icon = Toolkit.getDefaultToolkit().getImage("C:/Users/AwabPC/IdeaProjects/CalculatorSwing/src/Images/CalculatorIcon.png");
    frame.setIconImage(Icon);
    frame.setSize(500, 500);
    frame.setLayout(new GridLayout(6, 1,5,5));
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JLabel label = new JLabel("Enter First Number:");
    JLabel label2 = new JLabel("Enter Second Number:");
    label.setFont(new Font("Arial", Font.BOLD, 20));
    label2.setFont(new Font("Arial", Font.BOLD, 20));
    JTextField field1 = new JTextField();
    field1.setFont(new Font("Arial", Font.BOLD, 20));
    JTextField field2 = new JTextField();
    field2.setFont(new Font("Arial", Font.BOLD, 20));
    JLabel label3 = new JLabel("Result :");
    label3.setFont(new Font("Arial", Font.BOLD, 20));
    JLabel label4 = new JLabel("______");
    label4.setFont(new Font("Arial", Font.BOLD, 20));
    JButton button  = new JButton("+ | Add");
    JButton button2 = new JButton("- | Subtract");
    JButton button3 = new JButton("* | Multiply");
    JButton button4 = new JButton("/ | Divide");
    JButton button5 = new JButton("% | Modulo");
    JButton button6 = new JButton("^ | Exponent");

    frame.add(label);
    frame.add(field1);
    frame.add(label2);
    frame.add(field2);
    frame.add(button);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);
    frame.add(button6);
    frame.add(label3);
    frame.add(label3);
    frame.add(label4);
    ActionListener listener = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try{
                double num1 = Double.parseDouble(field1.getText());
                double num2 = Double.parseDouble(field2.getText());
                double result = 0;
                if(e.getSource() == button) {
                    result = num1 + num2;
                }else if(e.getSource() == button2) {
                        result = num1 - num2;
                }else if(e.getSource() == button3) {
                    result = num1 * num2;
                }else if(e.getSource() == button4) {
                    if (num2 != 0){
                        result = num1 / num2;
                    }else {
                        label4.setText("cannot divide by zero");
                        return;
                    }
                }else if(e.getSource() == button5) {
                    result = num1 % num2;
                }else if(e.getSource() == button6) {
                    result = Math.pow(num1, num2);
                }
                        label4.setText(String.valueOf(result));
            }catch(NumberFormatException ex){
                label4.setText("Invalid input");
            }
        }
    };
    button.addActionListener(listener);
    button2.addActionListener(listener);
    button3.addActionListener(listener);
    button4.addActionListener(listener);
    button5.addActionListener(listener);
    button6.addActionListener(listener);
    frame.setVisible(true);
}