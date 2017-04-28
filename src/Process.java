import java.util.Random;


public class Process extends Thread {

    //Iteration delay time
    int time = 0;
    Random random = new Random();


    @Override
    public void run() {

        for (int i = 0; i < Main.countIterator; i++) {

            //Added an iteration delay to the output
            System.out.println("beep id=" + getName() + " i=" + i + " через " + time + " мл.сек");

            time = random.nextInt(Main.countTime);

            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


}
