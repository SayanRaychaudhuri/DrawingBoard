public class Tester {
    public static void main(String[] args) {
        Drawing space = new Drawing("C:\\Users\\Programming 1\\IdeaProjects\\DrawingBoard\\src\\EdgeOfSpace.JPG");
        space.add(new Rectangle(550, 400, 600, 120, Colors.RED));
        space.add(new Triangle(250, 300, 450, 400, Colors.RED, Triangle.Orientation.UPRIGHT));
        space.add(new LineSegment(700, 250, 850, 340, Colors.RED));
        space.add(new Triangle(700, 250, 850, 340, Colors.CYAN, Triangle.Orientation.UPRIGHT));
        space.add(new Rectangle(650, 310, 50, 50, Colors.WHITE));
        space.add(new Rectangle(400, 460, 100, 100, Colors.BLACK));
        space.add(new Rectangle(700, 460, 100, 100, Colors.BLACK));
        space.add(new Rectangle(400, 460, 70, 70, Colors.GRAY));
        space.add(new Rectangle(700, 460, 70, 70, Colors.GRAY));
        space.show();
        
    }
}