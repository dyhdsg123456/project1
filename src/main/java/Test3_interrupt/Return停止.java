package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class Return停止 extends Thread {
    @Override
    public void run() {
        while (true) {
            if (this.isInterrupted()) {
                System.out.println("停止了");
                return;
            }
            System.out.println(System.currentTimeMillis());
        }

    }

    public static void main(String[] args) throws InterruptedException{
        Return停止 return停止 = new Return停止();
        return停止.start();
        Thread.sleep(2000);
        return停止.interrupt();
    }
}
