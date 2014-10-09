package bxqgit.designpatterns.composite;

class Apache implements Service {

    private final String name;

    Apache(final String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Apache: " + name);
    }

}
