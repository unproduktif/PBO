import javax.swing.*;

public class DasarGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dasar GUI");
        // frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menuFIle = new JMenu("File");
        JMenuItem menuExit = new JMenu("Exit");
        menuFIle.add(menuExit);
        menuBar.add(menuFIle);
        

        JMenu menuHelp = new JMenu("Help");
        JMenuItem menuHelpDialog = new JMenuItem("Help Info");
        menuHelp.add(menuHelpDialog);
        menuBar.add(menuHelp);
        frame.setJMenuBar(menuBar);

        menuExit.addActionListener(e -> {
            System.exit(0);
        });
        // atomic component
        JLabel label = new JLabel("Hello, GUI World!");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        
        frame.add(label);
        
        JButton button = new JButton("Click Me");
        frame.add(button, "South");

        button.addActionListener(e ->{
            label.setText("Button Clicked");
        });
        
        
        frame.setVisible(true);
    }
}