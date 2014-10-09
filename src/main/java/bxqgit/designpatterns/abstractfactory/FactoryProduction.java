package bxqgit.designpatterns.abstractfactory;

class FactoryProduction implements Factory {

    public Service createService() {
        return new ServiceProduction();
    }

}
