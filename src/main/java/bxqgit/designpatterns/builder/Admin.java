package bxqgit.designpatterns.builder;

class Admin {

    private ServerBuilder serverBuilder;

    public void setServerBuilder(final ServerBuilder pizzaBuilder) {
        this.serverBuilder = pizzaBuilder;
    }

    public Server build() {
        serverBuilder.createNewServer();
        serverBuilder.installApache();
        serverBuilder.installPostgre();
        serverBuilder.installRedis();
        return serverBuilder.getServer();
    }

}
