package SynchronizedTest;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class Run {
    public static void main(String[] args) {
        SynchronizedTest.Service service = new SynchronizedTest.Service();
        SynchronizedTest.ThreadA a = new SynchronizedTest.ThreadA(service);
        a.setName("A");
        a.start();
        SynchronizedTest.ThreadB b = new SynchronizedTest.ThreadB(service);
        b.setName("B");
        b.start();
    }
}
