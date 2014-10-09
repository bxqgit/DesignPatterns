package bxqgit.designpatterns.observer;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Observable;

public class InputObservable extends Observable implements Runnable {

    private final BufferedReader bufferedReader;

    public InputObservable() {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.print("# ");
                final String input = bufferedReader.readLine();
                if (input.equals("exit")) {
                    break;
                }
                setChanged();
                notifyObservers(input);
            }
        }
        catch (final Throwable th) {
            throw new RuntimeException(th);
        }
    }

}
