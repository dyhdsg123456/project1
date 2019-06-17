package suspend与resume;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 */
public class Test1 {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        thread.suspend();
        thread.resume();
    }
}
