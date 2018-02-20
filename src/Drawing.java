public class Drawing extends DrawingBoard {

    public Drawing(int width, int height) {
        super(width, height);
    }

    public Drawing(String filePath) {
        super(filePath);
    }

    public static void main(String[] args) {
        Drawing space = new Drawing("C:\\Users\\Programming 1\\IdeaProjects\\DrawingBoard\\src\\EdgeOfSpace.JPG");
        Shape tire1 = new Rectangle(400, 460, 100, 100, Colors.BLACK);
        Shape tire2 = new Rectangle(700, 460, 100, 100, Colors.BLACK);
        Shape rim1 = new Rectangle(400, 460, 70, 70, Colors.GRAY);
        Shape rim2 = new Rectangle(700, 460, 70, 70, Colors.GRAY);
        Shape carBody = new Rectangle(550, 400, 600, 120, Colors.RED);
        Shape fin = new Triangle(250, 300, 450, 400, Colors.RED, Triangle.Orientation.UPRIGHT);
        Shape windShieldRim = new LineSegment(700, 250, 850, 340, Colors.RED);
        Shape windShield = new Triangle(700, 250, 850, 340, Colors.CYAN, Triangle.Orientation.UPRIGHT);
        Shape head = new Rectangle(650, 310, 50, 50, Colors.WHITE);

        Shape[] s = {carBody, tire1, tire2, rim1, rim2, fin, head, windShield, windShieldRim};
        Group car = new Group(s);
        car.drawOn(space);
        space.show();
    }
}
