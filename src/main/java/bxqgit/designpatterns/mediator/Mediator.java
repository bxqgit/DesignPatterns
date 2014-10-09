package bxqgit.designpatterns.mediator;

public class Mediator /*implements EventListener*/ {

    /* */

    private Entity postgre;
    private Entity mongo;
    private Entity redis;

    /* */

    public void setPostgre(final Entity postgre) {
        this.postgre = postgre;
    }

    public void setMongo(final Entity mongo) {
        this.mongo = mongo;
    }

    public void setRedis(final Entity redis) {
        this.redis = redis;
    }

    /* */

    public void enablePostgre() {
        postgre.setEnabled(true);
        mongo.setEnabled(false);
        redis.setEnabled(false);
    }

    public void enableMongo() {
        postgre.setEnabled(false);
        mongo.setEnabled(true);
        redis.setEnabled(false);
    }

    public void enableRedis() {
        postgre.setEnabled(false);
        mongo.setEnabled(false);
        redis.setEnabled(true);
    }

    /* */

}