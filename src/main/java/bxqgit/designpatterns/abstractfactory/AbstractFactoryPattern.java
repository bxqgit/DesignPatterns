package bxqgit.designpatterns.abstractfactory;

class AbstractFactoryPattern {

    private static final String MODE_DEVELOPMENT = "development";
    private static final String MODE_PRODUCTION  = "production";

    public static void main(final String[] args) {
        run(MODE_DEVELOPMENT);
        run(MODE_PRODUCTION);
    }

    private static void run(final String mode) {
        final Service service = getFactory(mode).createService();
        service.run();
    }

    public static Factory getFactory(final String mode) {
        final Factory res;
        switch (mode) {
            case MODE_DEVELOPMENT:
                res = new FactoryDevelopment();
                break;
            case MODE_PRODUCTION:
                res = new FactoryProduction();
                break;
            default:
                res = null;
        }
        return res;
    }

}
