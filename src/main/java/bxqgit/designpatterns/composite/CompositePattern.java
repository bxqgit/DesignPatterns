package bxqgit.designpatterns.composite;

public class CompositePattern {

    public static void main(String[] args) {

        final Service apacheOne = new Apache("one");
        final Service apacheTwo = new Apache("two");
        final Service apacheThree = new Apache("three");

        final CompositeService compositeService = new CompositeService();
        final CompositeService compositeServiceAlpha = new CompositeService();
        final CompositeService compositeServiceBeta = new CompositeService();

        compositeServiceAlpha.add(apacheOne);
        compositeServiceAlpha.add(apacheTwo);

        compositeServiceBeta.add(apacheThree);

        compositeService.add(compositeServiceAlpha);
        compositeService.add(compositeServiceBeta);

        compositeService.run();

    }

}
