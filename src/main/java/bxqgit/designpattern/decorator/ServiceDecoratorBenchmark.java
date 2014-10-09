package bxqgit.designpattern.decorator;

class ServiceDecoratorBenchmark extends ServiceDecorator {

    public ServiceDecoratorBenchmark(final Service service) {
        super(service);
    }

    public void run() {
        service.run();
        benchmark();
    }

    private void benchmark() {
        System.out.println("BenchmarkServiceDecorator.benchmark");
    }

}
