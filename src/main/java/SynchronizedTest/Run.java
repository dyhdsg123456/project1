package SynchronizedTest;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class Run {
    public static void main(String[] args) {
       Service service = new Service();
        ThreadA a = new ThreadA(service);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(service);
        b.setName("B");
        b.start();
    }
}
