package bxqgit.designpatterns.builder;

public class BuilderPattern {

    public static void main(final String[] args) {

        final Admin admin = new Admin();

        final ServerBuilder serverBuilderDevelopment = new ServerBuilderDevelopment();
        final ServerBuilder serverBuilderProduction = new ServerBuilderProduction();

        admin.setServerBuilder(serverBuilderDevelopment);
        final Server development = admin.build();
        System.out.println("BuilderPattern.main: development: \"" + development + "\"");

        admin.setServerBuilder(serverBuilderProduction);
        final Server production = admin.build();
        System.out.println("BuilderPattern.main: production: \"" + production + "\"");

    }

}
