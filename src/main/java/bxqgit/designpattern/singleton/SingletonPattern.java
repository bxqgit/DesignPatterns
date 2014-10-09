package bxqgit.designpattern.singleton;

public class SingletonPattern {

    public static void main(final String[] args) {
        final Singleton instance = Singleton.getInstance();
        System.out.println("SingletonPattern.main: instance: \"" + instance + "\"");
    }

}
