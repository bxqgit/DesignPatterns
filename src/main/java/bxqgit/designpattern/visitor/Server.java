package bxqgit.designpattern.visitor;

class Server implements Service {

    private final Service[] services;

    public Server() {
        services = new Service[]{
                new ServiceApache(),
                new ServicePostgre("master"),
                new ServicePostgre("slave"),
                new ServiceRedis(),

        };
    }

    public Service[] getServices() {
        return services.clone();
    }

    public void accept(final Visitor visitor) {
        for (final Service service : getServices()) {
            service.accept(visitor);
        }
        visitor.visit(this);
    }

}
