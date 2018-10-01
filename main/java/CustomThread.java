import java.util.concurrent.Callable;

class CustomThread implements Callable<String> {

    String threadName = "Thread";

    CustomThread(String name){
        this.threadName = threadName +" " +name;
    }

    public String call(){

        try {
            System.out.println("Starting " +this.threadName);
            Thread.sleep(2000);
            System.out.println(this.threadName +" was sleeping for 2 seconds");
        }

        catch(InterruptedException e){
            e.printStackTrace();
        }

        return this.threadName+" finished";
    }

}
