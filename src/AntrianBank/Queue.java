package AntrianBank;

public class Queue extends Data{
    public void deque() {

        if (isEmpty()) {
            System.out.println("\t\t\tMaaf Antrian Masih Kosong");
        }else {
            System.out.print("\n\t\t\tNo Antri "+ListNo.poll()+" Atas Nama "+ListNama.poll());
        }
    }
}
