package hHocaForLoop;

public class S6 {

    public static void main(String[] args) {
         /*  TASK :
       2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.

       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
    */

        int input1=5;
        int input2=10;


        for (int i = 1; i <=input1 ; i++) {
            System.out.println();
            for (int j = 1; j <=input2 ; j++) {

                System.out.print((i*j)+" ");

            }

        }

    }
}
