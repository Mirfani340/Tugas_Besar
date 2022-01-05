package AntrianBank;

public class Queue extends Data{
    public void deque() {

        if (isEmpty()) {
            System.out.println("\t\t\tMaaf Antrian Masih Kosong");
        }else {
            System.out.println("\n\t\t============================================================");
            System.out.print("\t\t\tNo Antri \t:\t"+ListNo.poll()+"\n\t\t\tAtas Nama \t:\t"+ListNama.poll()+ "\n\t\t\tKeperluan \t:\t"+ListKeperluan.poll());
            System.out.println("\n\t\t============================================================");
        }
    }
}

