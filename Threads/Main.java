package Threads;

public class Main {
    public static void main(String[] args) {
        NumberGenerator ng = new NumberGenerator();
        NumberGenerator ngs = new NumberGenerator();
        ng.start();
        ngs.start();
    }
}
