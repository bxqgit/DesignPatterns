package bxqgit.designpatterns.visitor;

class VisitorLog implements Visitor {

    public void visit(final ServiceApache apache) {
        System.out.println("Logging apache");
    }

    public void visit(final ServicePostgre postgre) {
        System.out.println("Logging postgre: " + postgre.getName());
    }

    public void visit(final ServiceRedis redis) {
        System.out.println("Logging redis");
    }

    public void visit(final Server server) {
        System.out.println("Logging server");
    }

}
