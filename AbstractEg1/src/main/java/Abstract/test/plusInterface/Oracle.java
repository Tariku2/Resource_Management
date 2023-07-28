package Abstract.test.plusInterface;

public class Oracle implements IT{
    @Override
    public void develop() {
        System.out.println("I am coding");

    }

    @Override
    public void support() {
        System.out.println("I am Supporter");

    }

    @Override
    public void test() {
        System.out.println("I am testing");

    }

    @Override
    public void implement() {
        System.out.println("I am deploying");

    }
}
