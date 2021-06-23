import FlyBehavior.FlyBehavior;
import QuackBehavior.QuackBehavior;

abstract class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    void swim() {
        System.out.println("첨벙 첨벙");
    }

    void performQuack() {
        quackBehavior.quack();
    }

    void performFly() {
        flyBehavior.fly();
    }

    abstract void display();
}