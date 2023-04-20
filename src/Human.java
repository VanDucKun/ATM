public class Human implements IHuman{

    @Override
    public void eat() {
        System.out.println("Human eat");
    }

    @Override
    public void sleep() {
        System.out.println("Human sleep");
    }

    @Override
    public void walk() {
        System.out.println("Human walk");
    }

    @Override
    public void talk() {
        System.out.println("Human talk");
    }
}
