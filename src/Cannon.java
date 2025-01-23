import java.awt.*;
import static java.lang.Math.cos;
import static java.lang.Math.sin;

public class Cannon {

    final float g = 9.8f;

    public Double[] position(float angle, float speed, float time) {
        double vx = speed * cos(angle);
        double vy = speed * sin(angle);
        double x = vx * time;
        double y = vy * time - 0.5 * g * time * time;
        return new Double[]{x, y};
    }
}
