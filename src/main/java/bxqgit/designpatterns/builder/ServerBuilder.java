package bxqgit.designpatterns.builder;

abstract class ServerBuilder {

    protected Server server;

    public Server getServer() {
        return server;
    }

    public void createNewServer() {
        server = new Server();
    }

    public abstract void installApache();

    public abstract void installPostgre();

    public abstract void installRedis();

}
