import java.util.Random;

public class Person {

    protected int x, y;
    private String image = "\uD83E\uDDD9\u200D";
    private int lives = 3;

    Random r = new Random();

    public Person(int sizeBoard) {
        this.y = sizeBoard;
        this.x = Math.max(1, r.nextInt(sizeBoard));
    }

    public Person(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Person() {
        this(1, 1);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getLives() { return lives; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public boolean moveCorrect(int newX, int newY) {
        return (this.x == newX && Math.abs(this.y - newY) == 1) ||
                (this.y == newY && Math.abs(this.x - newX) == 1);
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void loseLife() {
        lives--;
    }
}
