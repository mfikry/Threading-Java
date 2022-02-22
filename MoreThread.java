/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author GenoSyst
 */
public class MoreThread {
    public static void main(String args[]){
        System.out.println("Main Thread Starting");
        MyThread mt1 = new MyThread("Child #1");
        MyThread mt2 = new MyThread("Child #2");
        MyThread mt3 = new MyThread("Child #3");
        
        do{
            System.out.print(".");
            try{
                Thread.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println("Main thread interrupted");
            }
        }while(mt1.count != 10 ||mt2.count != 10 ||mt3.count != 10);
        System.out.println("Main Thread Ending");
    }
}

