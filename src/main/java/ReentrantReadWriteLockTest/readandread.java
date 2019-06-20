package ReentrantReadWriteLockTest;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Author: dyh
 * Date:   2019/6/20
 * Description:
 */
public class readandread {
   private  ReentrantReadWriteLock lock=new ReentrantReadWriteLock();
   public void read()  {
       try {
//            lock.readLock().lock();
//       System.out.println("获取读锁:"+ Thread.currentThread().getName()+" "+System.currentTimeMillis());
           lock.writeLock().lock();
           System.out.println("获取写锁:"+ Thread.currentThread().getName()+" "+System.currentTimeMillis());

           Thread.sleep(10000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }finally {
           lock.writeLock().unlock();
       }

   }

    public static void main(String[] args)throws Exception {
        readandread readandread = new readandread();
        ThreadA threadA = new ThreadA(readandread);
        threadA.setName("a");
        ThreadB threadB = new ThreadB(readandread);
        threadB.setName("b");
        threadA.start();
        threadB.start();
    }

    static class ThreadA extends Thread{
       private readandread readandread;
       public ThreadA(readandread read){
           readandread=read;
       }

        @Override
        public void run() {
            super.run();
            readandread.read();
        }
    }
    static class ThreadB extends Thread{
        private readandread readandread;
        public ThreadB(readandread read){
            readandread=read;
        }

        @Override
        public void run() {
            super.run();
            readandread.read();
        }
    }
}
