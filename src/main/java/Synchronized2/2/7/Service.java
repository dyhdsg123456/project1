package SynchronizedTest;

/**
 * Author: dyh
 * Date:   2019/6/18
 * Description:使用synchronized（非this对象）同步代码块格式进行同步操作时，必须是同一个对象，如果不是则变为异步调用
 */
public class Service {
    private String usernameparam;
    private String passwordparam;
    private String anyString=new String();
    public void set(String username,String password){
//        String anyString=new String();
        synchronized (anyString){
            System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"进入同步块");
            usernameparam=username;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            passwordparam=password;
            System.out.println("线程名称为:"+Thread.currentThread().getName()+"在"+System.currentTimeMillis()+"离开同步块");
        }
    }
}
