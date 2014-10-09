package bxqgit.designpattern.mediator;

public class MediatorPattern {

    public static void main(final String[] args) {

        final Mediator mediator = new Mediator();

        final Entity postgre = new Entity("Postgre", mediator::setPostgre, mediator::enablePostgre);
        final Entity mongo = new Entity("Mongo", mediator::setMongo, mediator::enableMongo);
        final Entity redis = new Entity("Redis", mediator::setRedis, mediator::enableRedis);

        postgre.enable();
        mongo.enable();
        redis.enable();

    }

}
