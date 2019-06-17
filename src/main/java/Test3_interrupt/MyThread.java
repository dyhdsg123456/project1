package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        super.run();
        for (int i = 0; i < 500000; i++) {
            System.out.println("i="+(i+1));
            
        }
    }
}
