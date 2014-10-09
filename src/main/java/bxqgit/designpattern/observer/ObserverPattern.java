package bxqgit.designpattern.observer;

public class ObserverPattern {

    public static void main(final String[] args) {
        final InputObservable observable = new InputObservable();
        final OutputObserver observer = new OutputObserver();
        observable.addObserver(observer);
        new Thread(observable).start();
    }

}