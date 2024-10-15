import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.swing.JPanel;

class draw extends JPanel {
    private final List<ball> balls = new CopyOnWriteArrayList<>();
    public void addBall(ball b) {
        balls.add(b);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (ball b : balls) {
            g.setColor(new Color(b.r,b.g,b.b));
            g.fillOval(b.getX(), b.getY(), 20, 20);
        }
    }
}
