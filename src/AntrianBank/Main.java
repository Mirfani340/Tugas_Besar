package AntrianBank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("\n\t\t============================================================");
            System.out.println("\t\t\t\t\t Selamat datang di Bank");
            System.out.println("\t\t\t\tMemberikan pelayanan yang terbaik");
            System.out.println("\t\t============================================================");
            int menu;
            do{
                System.out.println("\n");
                System.out.println("\t\tPilih menu : ");
                System.out.println("\n\t\t\t\t1. Pengambilan nomor antri");
                System.out.println("\t\t\t\t2. Pemanggilan nomor antri");
                System.out.println("\t\t\t\t3. Lihat data antrian");
                System.out.println("\t\t\t\t4. Keluar");
                System.out.print("\n\t\tPilihan Anda : ");

                menu = input.nextInt();

                if(menu==1){
                    queue.SetNo();
                    queue.SetNama();
                    queue.SetKeperluan();
                }else if(menu==2){
                    queue.deque();
                }else if(menu==3){
                    queue.GetData();
                }else if(menu==4){
                    System.out.println("\n\t\t\t\tTerimakasih!!!!");
                }else{
                    System.out.println("\n\t\t\t\tPerhatikan data yang Anda inputkan!!!!");
                }
            }while(menu!=4);
        }
    }
}
