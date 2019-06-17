package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        super.run();
        try {

            for (int i = 0; i < 500000; i++) {
                if(this.isInterrupted()){
                    System.out.println("out----");
                  throw  new InterruptedException();
                }
                System.out.println("i="+(i+1));

            }
            System.out.println("我在for 下面");
        }catch (InterruptedException e){
            System.out.println(" 进入mythread catch");
        }


    }
}
