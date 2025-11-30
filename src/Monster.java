import java.util.Random;
import java.util.Scanner;

public class Monster {

    private String image = "\uD83E\uDDDF\u200D";
    protected final int x, y;
    Random r = new Random();

    public Monster(int sizeBoard) {
        this.y = r.nextInt(sizeBoard - 1);
        this.x = r.nextInt(sizeBoard);
    }

    public String getImage() { return image; }
    public int getY() { return y; }
    public int getX() { return x; }

    public boolean conflictPerson(int px, int py) {
        return py - 1 == this.y && px - 1 == this.x;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean taskMonster(int difficultGame) {
        System.out.println("Решите задачу:");

        int a = r.nextInt(100);
        int b = r.nextInt(100);
        int correct = a + b;

        System.out.println("Реши пример: " + a + " + " + b + " = ?");
        Scanner sc = new Scanner(System.in);

        if (sc.nextInt() == correct) {
            System.out.println("Верно! Ты победил монстра");
            return true;
        }

        System.out.println("Ты проиграл эту битву!");
        return false;
    }
}
