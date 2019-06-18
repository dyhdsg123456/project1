package SynTest2211;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class Run {
    public static void main(String[] args) {
        Service service = new Service();
        ThreadA threadA = new ThreadA(service);
        threadA.start();
        ThreadB threadB = new ThreadB(service);
        threadB.start();
    }
}
