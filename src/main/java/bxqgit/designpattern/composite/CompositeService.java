package bxqgit.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

class CompositeService implements Service {

    private final List<Service> services = new ArrayList<>();

    public void run() {
        for (final Service service : services) {
            service.run();
        }
    }

    public void add(final Service service) {
        services.add(service);
    }

}
