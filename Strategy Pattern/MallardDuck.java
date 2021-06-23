import FlyBehavior.FlyWithWings;
import QuackBehavior.OriginQuack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new OriginQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("MarllradDuck은 청둥오리.");
    }
}
