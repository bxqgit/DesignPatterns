package bxqgit.designpattern.decorator;

abstract class ServiceDecorator implements Service {

    protected Service service;

    public ServiceDecorator(final Service service) {
        this.service = service;
    }

}
