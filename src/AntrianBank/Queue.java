package AntrianBank;

import java.io.IOException;

public class Queue extends Data{
    public void deque() throws InterruptedException, IOException {
        if (isEmpty()) {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("\t\t\tMaaf Antrian Masih Kosong");
            Thread.sleep(3000);
        }else {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            System.out.println("\n\t\t====================================================");
            System.out.print("\t\t\tNo Antri \t:\t"+ListNo.poll()+"\n\t\t\tAtas Nama \t:\t"+ListNama.poll()+ "\n\t\t\tKeperluan \t:\t"+ListKeperluan.poll());
            System.out.println("\n\t\t====================================================");
            Thread.sleep(3000);
        }
    }
}

