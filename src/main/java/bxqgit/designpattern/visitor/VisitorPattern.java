package bxqgit.designpattern.visitor;

public class VisitorPattern {

    static public void main(final String[] args) {
        final Server server = new Server();
        server.accept(new VisitorLog());
        server.accept(new VisitorBenchmark());
    }

}
