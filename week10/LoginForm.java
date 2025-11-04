import javax.swing.*;

public class LoginForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FORM LOGIN");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        JLabel username = new JLabel("Username:");
        username.setBounds(50, 50, 100, 25);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 50, 180, 25);

        JLabel password = new JLabel("Password:");
        password.setBounds(50, 90, 100, 25);
        JTextField passwordField = new JTextField();
        passwordField.setBounds(150, 90, 180, 25);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(150, 130, 80, 30);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setBounds(250, 130, 80, 30);

        frame.add(username);
        frame.add(usernameField);
        frame.add(password);
        frame.add(passwordField);
        frame.add(btnLogin);
        frame.add(btnCancel);

        frame.setVisible(true);
    }
}
