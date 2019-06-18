package SynTest2272;


public class Service {
    private String anyString=new String();
    public void a(){
//        String anyString=new String();
        synchronized (anyString){
            System.out.println("a begin");


            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("a end");
        }
    }
    synchronized public void b(){
        System.out.println("b begin");
        System.out.println("b end");
    }
}
