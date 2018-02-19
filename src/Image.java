public class Image extends Colors{

    public static void main(String[] args) {
        Drawing space = new Drawing("C:\\Users\\Nupur\\IdeaProjects\\DrawingBoard\\src\\EdgeOfSpace.JPG");
        Shape tire1 = new Rectangle(400, 460, 100, 100, space, BLACK);
        Shape tire2 = new Rectangle(700, 460, 100, 100, space, BLACK);
        Shape rim1 = new Rectangle(400, 460, 70, 70, space, GRAY);
        Shape rim2 = new Rectangle(700, 460, 70, 70, space, GRAY);
        Shape carBody = new Rectangle(550, 400, 600, 120, space, RED);
        Shape fin = new Triangle(250, 300, 450, 400, space, RED, Triangle.Orientation.UPRIGHT);
        Shape windShieldRim = new LineSegment(700, 250, 850, 340, space, RED);
        Shape windShield = new Triangle(700, 250, 850, 340, space, CYAN, Triangle.Orientation.UPRIGHT);
        Shape head = new Rectangle(650, 310, 50, 50, space, WHITE);

        Shape[] s = {carBody, tire1, tire2, rim1, rim2, fin, head, windShield, windShieldRim};
        Group car = new Group(s);
        car.drawOn(space);
        space.show();

    }
}
