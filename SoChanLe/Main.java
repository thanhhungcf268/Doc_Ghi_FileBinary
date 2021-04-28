package SoChanLe;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SoChan sc = new SoChan();
        SoLe   sl = new SoLe();
        sc.start();
        sc.join();
        sl.start();
    }
}
