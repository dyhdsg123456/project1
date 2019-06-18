package SynTest2211;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:
 */
public class Service {

//    synchronized public void methodA() {
//        System.out.println("methodA begin");
//        Boolean isrun = true;
//        while (isrun) {
//
//        }
//        System.out.println("methodA end");
//    }
//    synchronized public void methodB() {
//        System.out.println("methodB begin");
//        System.out.println("methodB end");
//    }
public void methodA() {
    Object o1 = new Object();
    synchronized (o1){
        System.out.println("methodA begin");
        Boolean isrun = true;
        while (isrun) {}
        System.out.println("methodA end");
    }
}
    Object o2 = new Object();
     public void methodB() {
    synchronized (o2){
        System.out.println("methodB begin");
        System.out.println("methodB end");
    }
    }
}
