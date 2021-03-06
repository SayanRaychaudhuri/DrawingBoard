public class Tester {
    public static void main(String[] args) {
        Drawing space = new Drawing("C:\\Users\\Nupur\\IdeaProjects\\DrawingBoard\\src\\EdgeOfSpace.JPG");
        space.add(new Rectangle(550, 400, 600, 120, Colors.RED));
        space.add(new Ellipse(810, 400,150, 57, Colors.RED));
        space.add(new Triangle(175,250, 250, 350, 425, 350, Colors.RED));
        space.add(new LineSegment(700, 250, 850, 340, Colors.RED));
        space.add(new RightTriangle(700, 250, 850, 340, Colors.CYAN, RightTriangle.Orientation.UPRIGHT));
        space.add(new Circle(650, 310, 50, Colors.WHITE));
        space.add(new Group(new Drawable[]{new Circle(400, 460, 110, Colors.BLACK), new Circle(400, 460, 80, Colors.GRAY)}));
        space.add(new Group(new Drawable[]{new Circle(700, 460, 110, Colors.BLACK), new Circle(700, 460, 80, Colors.GRAY)}));
        space.drawOn();
    }
}
