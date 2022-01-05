package Multi_Thread;

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            //kelas multithread dibuat objek baru
            MultiThread multiThread = new MultiThread(i);
            /* pakai method start karena kalau pakai run
              itu tidak dijalankan di thread yang terpisah */
            multiThread.start();
        }
    }
}
