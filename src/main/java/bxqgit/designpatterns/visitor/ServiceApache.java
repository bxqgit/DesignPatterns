package bxqgit.designpatterns.visitor;

class ServiceApache implements Service {

    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }

}
