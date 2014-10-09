package bxqgit.designpatterns.decorator;

public class DecoratorPattern {

    public static void main(final String[] args) {
        final Service service = new ServiceDecoratorBenchmark(new ServiceDecoratorLog(new SimpleService()));
        service.run();
    }

}
