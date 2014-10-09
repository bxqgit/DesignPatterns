package bxqgit.designpattern.visitor;

class ServiceRedis implements Service {

    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }

}
