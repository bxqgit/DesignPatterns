package bxqgit.designpattern.builder;

class ServerBuilderDevelopment extends ServerBuilder {

    public void installApache() {
        server.installApache("development");
    }

    public void installPostgre() {
        server.installPostgre("development");
    }

    public void installRedis() {
        server.installRedis("development");
    }

}
