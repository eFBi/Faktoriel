import java.util.Scanner;

public class Faktroriyel {
    public static void main(String[] args) {
        /*
        N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı 
        farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

        Java ile kombinasyon hesaplayan program yazınız.

        Kombinasyon formülü
        C(n,r) = n! / (r! * (n-r)!)
         */
        Scanner inp = new Scanner(System.in);
        int pay=1;
            int payda=1;
            int fark=1;
            
                System.out.print("kombinasyon n sayısı: ");
                int n = inp.nextInt();
                System.out.print("kombinasyon r sayısı: ");
                int r = inp.nextInt();
                for(int i=1;i<=n;i++){
                pay *=i;
                }
                for(int i=1;i<=r;i++){
                        payda *=i;
                }
                for(int i=1;i<=(n-r);i++){
                        fark *=i;
                }
                int sonuc = pay/(payda*fark);
                System.out.println("C("+n+","+r+") Kombinasyonu: "+sonuc);
        
    }
}
