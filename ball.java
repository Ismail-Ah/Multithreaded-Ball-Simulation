import java.util.Random;

public class ball implements Runnable {
    private int x, y, dx, dy;
    private final int speed = 2;
    private final int[] speeds = {-2, 2};
    private final draw drawPanel;
    public int r;
    public int g;
    public int b;

    public ball(draw panel) {
        this.drawPanel = panel;
        x = (int) (Math.random() * 290); 
        y = (int) (Math.random() * 220); 
        dx = speeds[new Random().nextInt(2)];  
        dy = speeds[new Random().nextInt(2)];  
        r =(int)  (Math.random()*255);
        g =(int)  (Math.random()*255);
        b =(int)  (Math.random()*255);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move1() {
        if (x >= 290) dx = -speed;
        if (x <= 0) dx = speed;   
        if (y >= 220) dy = -speed;
        if (y <= 0) dy = speed;   

        x += dx;
        y += dy;
    }

    @Override
    public void run() {
        while (true) {
            move1(); 
            drawPanel.repaint(); 
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
