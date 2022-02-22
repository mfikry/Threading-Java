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
public class MyThread implements Runnable {
    int count;
    Thread thrd;
    
    MyThread(String Name){
        thrd = new Thread(this,Name);
        count = 0;
        thrd.start();
    }
    
    public void run(){
        System.out.println(thrd.getName()+"starting");
        try{
            do{
                Thread.sleep(500);
                System.out.println("In "+thrd.getName()+"Count is"+count);
                count++;
            }
            while(count < 10);
        }
        catch(InterruptedException y)
        {
            System.out.println(thrd.getName()+" Interruped");
        }
            System.out.println(thrd.getName()+" Terminated");
    }
}

