package buildermode;

import buildermode.director.Director;

public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        director.getBenzAModel().run();
        System.out.println("\n================\n");
        director.getBenzBModel().run();
        System.out.println("\n================\n");
        director.getBmwAModel().run();
        System.out.println("\n================\n");
        director.getBmwBModel().run();
        System.out.println("\n================\n");
    }
}
