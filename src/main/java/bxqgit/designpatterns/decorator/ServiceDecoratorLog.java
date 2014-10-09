package bxqgit.designpatterns.decorator;

class ServiceDecoratorLog extends ServiceDecorator {

    public ServiceDecoratorLog(final Service service) {
        super(service);
    }

    public void run() {
        service.run();
        log();
    }

    private void log() {
        System.out.println("LogServiceDecorator.log");
    }

}
