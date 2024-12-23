package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdvancedCalculatorGUI extends JFrame {
    private final JTextField display;
    private final StringBuilder currentInput = new StringBuilder();
    private final Calculator calculator = new Calculator();

    public AdvancedCalculatorGUI() {
        setTitle("Advanced Calculator");
        setSize(400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Display
        display = new JTextField();
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Buttons Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 4, 5, 5));

        String[] buttons = {
                "7", "8", "9", "÷",
                "4", "5", "6", "×",
                "1", "2", "3", "-",
                "0", ".", "=", "+",
                "C", "√", "^", "log"
        };

        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 18));
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = ((JButton) e.getSource()).getText();

            try {
                switch (command) {
                    case "C":
                        currentInput.setLength(0);
                        display.setText("");
                        break;
                    case "=":
                        double result = calculator.evaluate(currentInput.toString());
                        display.setText(String.valueOf(result));
                        currentInput.setLength(0);
                        break;
                    case "√":
                        double sqrtValue = calculator.squareRoot(Double.parseDouble(currentInput.toString()));
                        display.setText(String.valueOf(sqrtValue));
                        currentInput.setLength(0);
                        break;
                    case "^":
                        currentInput.append("^");
                        display.setText(currentInput.toString());
                        break;
                    case "log":
                        double logValue = calculator.log(Double.parseDouble(currentInput.toString()));
                        display.setText(String.valueOf(logValue));
                        currentInput.setLength(0);
                        break;
                    default:
                        currentInput.append(command);
                        display.setText(currentInput.toString());
                        break;
                }
            } catch (Exception ex) {
                display.setText("Error");
                currentInput.setLength(0);
            }
        }
    }
}
