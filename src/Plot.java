import javax.swing.*;
import java.awt.*;

public class Plot {

    public static void main(String[] args) {

        JFrame f = new JFrame();
        Cannon c = new Cannon();

        JPanel p = new JPanel() {

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                float t = 0;
                float dt = 0.2f;
                float scale = 20f;
                int y0 = -450;
                int x = 0;
                int y = 0;
                int x1 = 0;
                int y1 = 0;
                Double[] p;
                p = c.position(3.14f / 3f, 20f, 0);
                x = (int)(p[0] * scale);
                y = (int)(p[1] * scale);

                for (int n = 1 ; n < 20 ; n++) {

                    t = n * dt;
                    p = c.position(3.14f / 3f, 20f, t);
                    x1 = (int)(p[0] * scale);
                    y1 = (int)(p[1] * scale);
                    System.out.println(t + ": (" + p[0] + ", " + p[1] + ")");
                    g.drawLine(x, -y - y0, x1, -y1 - y0);
                    x = x1;
                    y = y1;
                }
            }
        };

        f.setSize(800, 600);
        f.setLocationRelativeTo(null);
        f.add(p);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
