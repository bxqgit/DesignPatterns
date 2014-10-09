package bxqgit.designpattern.abstractfactory;

class FactoryProduction implements Factory {

    public Service createService() {
        return new ServiceProduction();
    }

}
