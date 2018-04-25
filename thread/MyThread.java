package thread;

public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }
    public void run(){
        try{
            for(int i=0; i<10;i++){
                System.out.print(i +" ");
                Thread.sleep(500);
                System.out.printf("\t Luồng: %s có độ ưu tiên là %d \n", getName(), getPriority());
            }
        }catch ( Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
        MyThread myThread_t1 = new MyThread("luong1");
        MyThread myThread_t2 = new MyThread("luong2");

        System.out.println("ID luồng 1: " + myThread_t1.getId());
        System.out.println("ID luồng 2: " + myThread_t2.getId());

        myThread_t1.setPriority(MIN_PRIORITY);
        myThread_t2.setPriority(MAX_PRIORITY);

        myThread_t1.start();
        myThread_t2.start();
    }




}
