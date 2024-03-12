package ATM;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface {
    private JFrame frame;
    private JTextField textField;
    private JTextField textField2;
    private JButton withdrawButton;
    private int SCREEN_WIDTH = 600;
    private int SCREEN_HEIGHT = 600;
    private JButton sendButton;
    Account currentAccount = Database.getAccount(1);
    private int CurrentAccountNumber = currentAccount.getAccountNumber();
    private String CurrentUser = currentAccount.getUsername();
    private double CurrentAccountBalance = currentAccount.getAvailableBalance();


    public Interface() {
        // Create the main frame
        frame = new JFrame("User Interface");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        frame.setBackground(Color.gray);
        frame.setFocusable(true);
        frame.addKeyListener(null);

        // Create the text field
        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(SCREEN_WIDTH/2 - 100, SCREEN_HEIGHT/2-150, 200, 30);
        textField.setText("User: "  + CurrentUser);
        textField.setHorizontalAlignment(JTextField.CENTER);
        
        textField2 = new JTextField();
        textField2.setEditable(false);
        textField2.setBounds(SCREEN_WIDTH/2 - 100, SCREEN_HEIGHT/2-100, 200, 30);
        textField2.setText("Balance: "  + Double.toString(CurrentAccountBalance));
        textField2.setHorizontalAlignment(JTextField.CENTER);

        // Create the withdraw button
        withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(100, SCREEN_HEIGHT/2-15, 180, 30);
        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                int amount = Integer.parseInt(text);
                withdraw(amount);
            }
        });

        // Create the send button
        sendButton = new JButton("Send");
        sendButton.setBounds(300, SCREEN_HEIGHT/2-15, 180, 30);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                int amount = Integer.parseInt(text);
                send(amount);
            }
        });

        // Add the components to the frame
        frame.add(textField);
        frame.add(textField2);
        frame.add(withdrawButton);
        frame.add(sendButton);

        // Show the frame
        frame.setLayout(null);
        frame.setVisible(true);
        frame.requestFocus();
    }

    private void withdraw(int amount) {
        String text = textField.getText();

    }

    private void send(int amount) {
        String text = textField.getText();
    }

}
