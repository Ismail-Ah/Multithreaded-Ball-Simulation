import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Multiball");
        frame.setLayout(new BorderLayout());

        draw drawPanel = new draw(); 

        JButton button = new JButton("Add Ball");
        button.setText("Add");

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ball b = new ball(drawPanel); 
                drawPanel.addBall(b); 
                new Thread(b).start();
            }
        });

        frame.add(drawPanel, BorderLayout.CENTER);
        frame.add(button, BorderLayout.SOUTH);

        frame.setSize(315, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); 
        frame.setVisible(true);
    }
}
