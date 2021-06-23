import FlyBehavior.FlyWithWings;
import QuackBehavior.OriginQuack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        quackBehavior = new OriginQuack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    void display() {
        System.out.println("RedHeadDuck은 붉은 머리 오리.");
    }
}
