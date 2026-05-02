package engineeringDigest.multithraedingPractice.MySyncronization;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount{
  private int balance = 200;
  private final Lock lock = new ReentrantLock();
//todo with synchronized use
 /* public synchronized void withdraw(int amount){
      System.out.println(Thread.currentThread().getName() + "attempting to withdraw amount "+amount);
      if(amount < balance){
          System.out.println(Thread.currentThread().getName() +" proceeding with withdrawal");
          try{
              Thread.sleep(3000);
          }catch (InterruptedException e){

          }
          balance -= amount;
          System.out.println(Thread.currentThread().getName() +"Completed withdrawal. Remaining balance: "+ balance);
      }else {
          System.out.println(Thread.currentThread().getName()+" Insufficient balance");
      }
  }

  */

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() +"attempting to withdraw " +amount);
        try{
           // lock.lock();
            if(lock.tryLock(3000, TimeUnit.MILLISECONDS)){
                if(balance >=amount){
                    try{
                        System.out.println(Thread.currentThread().getName() +"proceeding with the withdrawal");
                        Thread.sleep(3000);
                        balance -=amount;
                        System.out.println(Thread.currentThread().getName() +"completed withdrawal.Remaining balance :"+amount);
                    }catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                    finally {
                        lock.unlock();
                    }
                }else{
                    System.out.println(Thread.currentThread().getName() +" insufficient balance");
                }

            }else{
                System.out.println(Thread.currentThread().getName() +"couldn't acquired the lock , will try later");
            }
        }catch (Exception e){
        Thread.currentThread().interrupt();
        }
    }
}
