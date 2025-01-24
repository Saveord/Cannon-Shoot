public class Data {
    public static void main(String[] args) {

        Cannon c = new Cannon();

        float t = 0;
        float dt = 0.2f;

        for (int n = 0 ; n < 10 ; n++) {
            t = n * dt;
            Double[] p = c.position(3.14f / 3f, 20f, t);
            System.out.println(t + ": (" + p[0] + ", " + p[1] + ")");
        }
    }
}