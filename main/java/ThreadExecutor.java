import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadExecutor {

    public static void main(String[] args) {

        ArrayList<String> results = new ArrayList<String>();
        ArrayList<Future<String>> futures = new ArrayList();
        ExecutorService executor = Executors.newFixedThreadPool(5);
        //loop
            for (int i = 0; i < 5; i++) {

                    futures.add(executor.submit(new CustomThread(Integer.toString(i + 1))));

            }
            for (int i = 0; i <= futures.size()-1; i++){
                try {
                    results.add(futures.get(i).get());
                    System.out.println(results.get(i));
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }

            executor.shutdown();
        }
    }

