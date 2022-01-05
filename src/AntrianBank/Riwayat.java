package AntrianBank;

public class Riwayat extends Data{

    public void NoRiwayat() {
        no++;
        noAntrian.add(no);
    }

    public boolean isEmpty2() {
        return noAntrian.isEmpty();
    }

    public void GetRiwayat() {
        if (isEmpty2()) {
            System.out.println("\n\t\t\tMaaf Data Masih Kosong");
        } else {
            System.out.println("\n\t\t\t========================================================");
            System.out.print("\t\t\tNama\t|\tKeperluan\t|\tNo Antri\n");
            System.out.println("\t\t\t========================================================");
            for (int i = 0; i < RiwayatNama.size(); i++) {
                System.out.print("\t\t\t"+RiwayatNama.toArray()[i]+"\t|\t"+RiwayatKeperluan.toArray()[i]+"\t|\t"+noAntrian.toArray()[i]);
            }
            System.out.print("\n\t\t\t========================================================");
        }
    }
}
