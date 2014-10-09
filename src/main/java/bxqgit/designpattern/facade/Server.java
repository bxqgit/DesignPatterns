package bxqgit.designpattern.facade;

class Server {

    private Apache  apache;
    private Postgre postgre;
    private Redis   redis;

    public Server() {
        this.apache = new Apache();
        this.postgre = new Postgre();
        this.redis = new Redis();
    }

    public void startServer() {
        apache.start();
        postgre.start();
        redis.start();

    }

}
