import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı Giriniz:");
        int n1=input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz");
        int n2=input.nextInt();


        System.out.println("-----EBOB------");
        int i=n1,ebob;
        while(i>=1)
        {
            if(n1%i==0 && n2%i==0)
            {
                ebob=i;
                System.out.println(ebob);
                break;
            }

            i--;
        }

        System.out.println("-----EKOK------");
        int k=1,ekok;
        while(k<=(n1*n2))
        {
            if(k%n1==0 && k%n2==0)
            {
                ekok=k;
                System.out.println(ekok);
                break;
            }
        k++;

        }

    }
}