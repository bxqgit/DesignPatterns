package bxqgit.designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class OutputObserver implements Observer {

    public void update(final Observable obj, final Object arg) {
        System.out.println("ResponseHandler.update: " + obj + " : " + arg);
    }

}
