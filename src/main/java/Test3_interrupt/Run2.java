package Test3_interrupt;

/**
 * Author: dyh
 * Date:   2019/6/17
 * Description:
 * interrupted:测试当前线程是否已经是中断状态，执行后将状态设置为false（连续2次调用第二次为false）
 *  isInterrupted() 测试线程是否已经中断，但不清除状态标志
 *  静态方法interrupted将会清除中断状态（传入的参数ClearInterrupted为true），而实例方法isInterrupted则不会（传入的参数ClearInterrupted为false）
 *  https://www.liangzl.com/get-article-detail-18504.html
 */
public class Run2 {
    public static void main(String[] args) throws InterruptedException {
     Thread.currentThread().interrupt();
        System.out.println("是否停止1?="+Thread.interrupted());
        System.out.println("是否停止2?="+Thread.interrupted());
        System.out.println("end");
    }
}
