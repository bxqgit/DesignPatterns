package bxqgit.designpatterns.visitor;

interface Visitor {

    /* */

    void visit(final ServiceApache apache);

    void visit(final ServicePostgre postgre);

    void visit(final ServiceRedis redis);

    /* */

    void visit(final Server server);

    /* */

}
