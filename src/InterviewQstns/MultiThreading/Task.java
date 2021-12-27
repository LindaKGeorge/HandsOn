package InterviewQstns.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 implements Runnable {

    @Override
    public void run(){
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }
}

public class Task {

     /*public static void main(String[] args){
         for(int i= 0 ; i< 100; i++){
             Thread thread = new Thread(new Task1());
             thread.start();
         }
         System.out.println("Thread Name : " + Thread.currentThread().getName());
     }
*/
    public static void main(String[] args){
        ExecutorService service = Executors.newFixedThreadPool(10);
        for(int i=0; i<100 ; i++){
            service.execute(new Task1());
        }
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }

 }
