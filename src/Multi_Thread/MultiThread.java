package Multi_Thread;

public class MultiThread extends Thread{

    //angka untuk memperjelas multiThread berasal
    private int threadOrigin;

    //constructor
    public MultiThread(int threadOrigin) {
        this.threadOrigin = threadOrigin;
    }

    //polimorfisme
    @Override
    //mengoveride method run dari kelas Thread yg ada di Java
    public void run(){

        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread "+i+ " from number " + threadOrigin);

            try {
                //jeda istirahat tiap thread yaitu 1 second
                Thread.sleep(1000);
            }
            //pengecualian
            catch (InterruptedException e){

            }
        }
    }
}
