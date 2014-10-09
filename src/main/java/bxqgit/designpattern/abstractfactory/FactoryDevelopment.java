package bxqgit.designpattern.abstractfactory;

class FactoryDevelopment implements Factory {

    public Service createService() {
        return new ServiceDevelopment();
    }

}
