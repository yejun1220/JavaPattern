import FlyBehavior.FlyNoWay;
import QuackBehavior.MuteQuack;

public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("RubberDuck은 고무오리.");
    }
}
