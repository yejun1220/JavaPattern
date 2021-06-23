public class DuckSimulator {
    public static void main(String args[]) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck redHeadDuck = new RedHeadDuck();
        redHeadDuck.display();
        redHeadDuck.performQuack();
        redHeadDuck.performFly();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performQuack();
        rubberDuck.performFly();
    }
}
