package BackUp.Test.AntrianBank_;

public class Riwayat extends Data{
    
    public void NoRiwayat() {
        no++;
        noAntrian.add(no);
    }
    
    
    // public String Database (Kalo didalam sini bikin lagi) {
        
    // }

    public void GetRiwayat() {
        if (noAntrian.isEmpty()) {
            System.out.println("\n\t\t\tMaaf Data Masih Kosong");
        } else {
            System.out.println("\n\t\t\t========================================================");
            System.out.print("\t\t\tNama\t|\tKeperluan\t|\tNo Antri\n");
            System.out.println("\t\t\t========================================================");
            System.out.println(RiwayatNama.get(0));
            for (int i = 0; i < RiwayatNama.size(); i++) {
                System.out.print("\t\t\t"+RiwayatNama.get(i)+"\t|\t"+RiwayatKeperluan.get(i)+"\t|\t"+noAntrian.get(i));
                
                System.out.println("\n");
            }
            System.out.print("\n\t\t\t========================================================");
        }
    }
    // public void NoRiwayat() {
    //     no++;
    //     noAntrian.add(no);
    // }

    // // public boolean isEmpty2() { // ini tidak perlu karena di ArrayList sudah ada isEmpty
    // //     return noAntrian.isEmpty();
    // // }

    // public void GetRiwayat() {
    //     if (noAntrian.isEmpty()) {
    //         System.out.println("\n\t\t\tMaaf Data Masih Kosong");
    //     } else {
    //         System.out.println("\n\t\t\t========================================================");
    //         System.out.print("\t\t\tNama\t|\tKeperluan\t|\tNo Antri\n");
    //         System.out.println("\t\t\t========================================================");
    //         System.out.println(RiwayatNama.get(0));
    //         for (int i = 0; i < RiwayatNama.size(); i++) {
    //             System.out.print("\t\t\t"+RiwayatNama.get(i)+"\t|\t"+RiwayatKeperluan.get(i)+"\t|\t"+noAntrian.get(i));
                
    //             System.out.println("\n");
    //         }
    //         System.out.print("\n\t\t\t========================================================");
    //     }
    // }
}
