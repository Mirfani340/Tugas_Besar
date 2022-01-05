package AntrianBank;

public class Queue extends Data{
    public void deque() {
        if (isEmpty()) {
            System.out.println("Maaf Antrian Masih Kosong");
        }else {
            System.out.print("No Antri "+ListNo.poll()+" Atas Nama "+ListNama.poll());
        }
    }
}