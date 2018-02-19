public class Image {

    public static void main(String[] args) {
        Drawing space = new Drawing("C:\\Users\\Nupur\\IdeaProjects\\DrawingBoard\\src\\EdgeOfSpace.JPG");
        Shape tire1 = new Rectangle(400, 460, 100, 100, space, 0x000000);
        Shape tire2 = new Rectangle(700, 460, 100, 100, space, 0x000000);
        Shape rim1 = new Rectangle(400, 460, 70, 70, space, 0x999999);
        Shape rim2 = new Rectangle(700, 460, 70, 70, space, 0x999999);
        Shape carBody = new Rectangle(550, 400, 600, 120, space, 0xFF0000);
        Shape Fin = new Triangle(250, 300, 450, 400, space, 0xFF0000, Triangle.Orientation.UPRIGHT);
        Shape WindShieldRim = new LineSegment(700, 250, 850, 340, space, 0xFF0000);
        Shape WindShield = new Triangle(700, 250, 850, 340, space, 0x00FFFF, Triangle.Orientation.UPRIGHT);
        Shape head = new Rectangle(650, 310, 50, 50, space, 0xFFFFFF);

        Shape[] s = {carBody, tire1, tire2, rim1, rim2, Fin, head, WindShield, WindShieldRim};
        Group car = new Group(s);
        car.drawOn(space);
        space.show();


    }
}
