import java.util.HashSet;
import java.util.Random;
import java.util.Set;



public class Main {

    //To save already used id
    private static Set<Integer> idSet = new HashSet<Integer>();

    //number of names for id
    private static int countId = 10;

    //number of threads
    private static int countThread = 10;

    //number of iterations in the stream
    public static int countIterator = 10;

    //Max number of iterations in milliseconds
    public static int countTime = 3000;


    public static void main(String[] args) {

        for (int i = 0; i < countThread; i++) {
            Process process = new Process();

            //Assign the name (id) to the stream
            process.setName(generatorId());
            process.start();
        }

    }


    private static String generatorId() {
        Random random = new Random();

        //Id stream
        int id;

        do {
            id = random.nextInt(countId);
        } while (idSet.contains(id));

        idSet.add(id);
        return Integer.toString(id);
    }


}