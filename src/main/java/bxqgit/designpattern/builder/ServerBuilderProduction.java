package bxqgit.designpattern.builder;

class ServerBuilderProduction extends ServerBuilder {

    public void installApache() {
        server.installApache("production");
    }

    public void installPostgre() {
        server.installPostgre("production");
    }

    public void installRedis() {
        server.installRedis("production");
    }
}
