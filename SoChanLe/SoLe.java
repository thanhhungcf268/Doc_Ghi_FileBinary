package SoChanLe;

public class SoLe extends Thread{
    @Override
    public void run() {
        for (int i=1;i<12;i+=2){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
