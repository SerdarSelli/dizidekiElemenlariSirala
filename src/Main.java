import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dİzinin boyutu n :");
        int n = scan.nextInt();

        int[] dizi = new int[n];  // oluşan dizinin kaç elemanlı olması girilen sayıya bağlı


int sayac = 1; // hangi elemanın girildiğini konsola gösteren değer loop ta 1 artıyor

        for (int i = 0; i < n ; i++){
            System.out.print(sayac + ". Elemanı :");
            dizi[i] = scan.nextInt();
            sayac ++;
            System.out.println();
        }
        System.out.println(Arrays.toString(dizi)); // elemanlar diziye kaydedilmişmi diye kontrol ettim
        int temp ;                  // buble sort ta yer değiştirme için bu değişkeni kullanıyoruz
        for (int i = 0 ; i < dizi.length; i++){
            for (int j = 1 ; j < (dizi.length - i) ; j++){     //dizi.lenght - i dememin nedeni buble sorth yaparken en büyük eleman sona gidiyor bu yüzden sondaki elemanı bişey le kıyaslamamıza gerek yok
                    if (dizi[j-1]>dizi[j]){
                        temp = dizi[j-1] ;  // yeri değişecek büyük elemanı buna atıyoruz kaybolmaması için
                        dizi[j-1]=dizi[j];   // küçük elemanı büyük elemanın yerine tanımlıyoruz
                        dizi[j] = temp ;     // hafızaya attığımız büyük elemanı yeni yerine koyuyoruz
                    }
                }
            }

        System.out.println(Arrays.toString(dizi));


        // burdan sonrası sistemin
    }
}