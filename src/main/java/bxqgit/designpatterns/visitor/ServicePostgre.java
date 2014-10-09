package bxqgit.designpatterns.visitor;

class ServicePostgre implements Service {

    private final String name;

    ServicePostgre(final String name) {
        this.name = name;
    }

    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }

    public String getName() {
        return name;
    }

}
