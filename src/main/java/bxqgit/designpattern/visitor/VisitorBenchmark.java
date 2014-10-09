package bxqgit.designpattern.visitor;

class VisitorBenchmark implements Visitor {

    public void visit(final ServiceApache apache) {
        System.out.println("Benchmarking apache");
    }

    public void visit(final ServicePostgre postgre) {
        System.out.println("Benchmarking postgre: " + postgre.getName());
    }

    public void visit(final ServiceRedis redis) {
        System.out.println("Benchmarking redis");
    }

    public void visit(final Server server) {
        System.out.println("Benchmarking server");
    }

}
