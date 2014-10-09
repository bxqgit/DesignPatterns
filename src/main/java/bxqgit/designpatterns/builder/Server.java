package bxqgit.designpatterns.builder;

class Server {

    private String apache;
    private String postgre;
    private String redis;

    public String getApache() {
        return apache;
    }

    public void installApache(final String apache) {
        this.apache = apache;
    }

    public String getPostgre() {
        return postgre;
    }

    public void installPostgre(final String postgre) {
        this.postgre = postgre;
    }

    public String getRedis() {
        return redis;
    }

    public void installRedis(final String redis) {
        this.redis = redis;
    }

    /* */

    @Override
    public String toString() {
        return "Server{" +
               "apache='" + apache + '\'' +
               ", postgre='" + postgre + '\'' +
               ", redis='" + redis + '\'' +
               '}';
    }

}
