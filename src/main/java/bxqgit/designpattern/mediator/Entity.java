package bxqgit.designpattern.mediator;

import java.util.function.Consumer;

public class Entity {

    /* */

    private final String   name;
    private final Runnable mediatorEnable;

    /* */

    public Entity(final String name, final Consumer<Entity> mediatorSet, final Runnable mediatorEnable) {
        this.name = name;
        mediatorSet.accept(this);
        this.mediatorEnable = mediatorEnable;
    }

    /* */

    public void enable() {
        mediatorEnable.run();
    }

    public void setEnabled(final boolean enabled) {
        if (enabled) {
            System.out.println(name + ": enabled");
        }
    }

    /* */

}
