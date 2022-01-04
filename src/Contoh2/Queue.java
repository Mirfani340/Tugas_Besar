package Contoh2;

import java.util.Scanner;

public class Queue extends Keperluan {

    String[] data;
    int head = 0;
    int flag = 1;

    public Queue(int jumlah) {
        data = new String[jumlah];
    }

    public void enqueue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukan Nama : ");
        String inputan = sc.nextLine();
        if (head < data.length) {
            data[head] = inputan;
            head++;
        } else {
            System.out.println("Queue is full");
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
            return "Queue is empty";
        }
        return "No.00" + flag + ", Nama : " + tmp;
    }

    public void print() {
        if (data[0] == null){
            System.out.println("Antrian kosong");
        } else
        for (int i = 0; i < data.length; i++) {
            System.out.println("No.00" + (flag++) + ", Nama : " + data[i]);
        }
    }
}
