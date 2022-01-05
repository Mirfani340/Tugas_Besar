package BackUp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Queue extends Keperluan {

    ArrayList<String> dataa = new ArrayList<>();

    String[] data;
    int head = 0;
    int flag = 1;

    public Queue(){
        dataa = new ArrayList<>();
    }

    public Queue(int jumlah) {
        data = new String[jumlah];
    }

    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\n\t\t\t\tMasukan ID \t\t\t: ");
        String Id = sc.nextLine();
        System.out.print("\t\t\t\tMasukan Nama \t\t: ");
        String nama = sc.nextLine();
        System.out.print("\t\t\t\tMasukan Keperluan \t: ");
        String keperluan = sc.nextLine();

        String dataCustomer[] = { Id, nama, keperluan};
        if (head < data.length) {
            data[head] = Arrays.toString(dataCustomer);
            head++;
        } else {
            System.out.println("\t\t\t\tQueue is full");
        }
    }

    public String dequeue() {
        String tmp = data[0];
        for (int i = 0; i < data.length - 1; i++) {
            data[i] = data[i + 1];
        }
        head--;
        if (head >= 0) {
            data[head] = null;
            flag++;
        } else {
            flag = 0;
            head = 0;
            return "\t\t\t\tQueue is empty";
        }
        return "No.00" + flag + ", Nama : " + tmp;
    }

    public void print() {
        if (data[0] == null){
            System.out.println("Antrian kosong");
        } else{
            System.out.println("\n\n");
            for (int i = 0; i < data.length; i++) {
                System.out.println("\t\t\t\tNo.00" + (flag++) + ", Customer : " + data[i]);}
        }
    }
}
