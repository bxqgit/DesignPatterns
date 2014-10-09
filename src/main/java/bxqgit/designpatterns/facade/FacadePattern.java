package bxqgit.designpatterns.facade;

public class FacadePattern {

    public static void main(final String[] args) {
        final Server server = new Server();
        server.startServer();
    }

}
