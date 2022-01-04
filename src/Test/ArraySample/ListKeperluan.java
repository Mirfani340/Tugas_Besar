package Test.ArraySample;

public class ListKeperluan extends ListNama{
    // Scanner input = new Scanner(System.in);
    public void SetKeperluan() {
        System.out.print("Keperluan : ");
        String InputKeperluan = input.next();
        Listkeperluan.add(InputKeperluan);
    }

    public void GetKeperluan() {
        for (int i = 0; i < Listkeperluan.size(); i++) {
            System.out.print(Listkeperluan.get(i)+"\t"+ListNama.get(i));
        }
        return;
    }
}
