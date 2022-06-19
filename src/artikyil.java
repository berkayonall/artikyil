import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {

        int dyili;
        double sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Doğum yiliniz :");
        dyili = input.nextInt();
        sonuc = dyili%4 ;


        if (sonuc == 0){
            System.out.println(dyili +" bir artık yıldır");
        }

        if (sonuc != 0){
            System.out.println(dyili + " bir artık yıl değildir");
        }

    }
}