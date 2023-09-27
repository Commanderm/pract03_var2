package pract03var2.mirea.ru;

public class TestBall {
    public static void main(String[] args) {
        Ball redball = new Ball();
        Ball greenball = new Ball(10.25, 15.3);

        System.out.println(redball);
        System.out.println(greenball);

        redball.setX(1.11111);
        redball.setY(3.578902);
        System.out.println(redball);

        greenball.setXY(11, 16);
        System.out.println(greenball);

        redball.move(5.33, 5.22);
        System.out.println(redball);
    }
}
