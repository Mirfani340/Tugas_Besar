package ArrayList2D;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        Dequeue dequeue = new Dequeue();
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("\n\t\t=======================================================================================");
            System.out.println("\t\t\t\t\t Selamat datang di Bank Danamon");
            System.out.println("\t\t\t\t\tMemberikan pelayanan yang terbaik");
            System.out.println("\t\t=======================================================================================");

            int menu;
            do{
                System.out.println("\n\n");
                System.out.println("\t\t\t\t\tPilih menu : ");
                System.out.println("\t\t\t\t1. Pengambilan nomor antri");
                System.out.println("\t\t\t\t2. Pemanggilan nomor antri");
                System.out.println("\t\t\t\t3. Lihat data antrian");
                System.out.println("\t\t\t\t4. Keluar");
                System.out.print("\t\t\t\t     Pilihan Anda : ");
                menu = input.nextInt();

                if(menu==1){
                    data.SetNama();
                    data.SetKeperluan();
                }else if(menu==2){
                    //dequeue.dequeue();
                }else if(menu==3){
                    System.out.println("========================================================");
                    System.out.print("Nama\tKeperluan\n");
                    System.out.println("========================================================");
                    for (int i = 0; i < data.ListNama.size(); i++) {
                        System.out.print(data.ListNama.get(i)+"\t"+data.ListKeperluan.get(i));
                        System.out.println("\n");
                    }
                    System.out.print("==========================================================");
                }else if(menu==4){
                    System.out.println("\n\t\t\t\tTerimakasih!!!!");
                }else{
                    System.out.println("\n\t\t\t\tPerhatikan data yang Anda inputkan!!!!");
                }
            }while(menu!=4);
        }
    }
}
