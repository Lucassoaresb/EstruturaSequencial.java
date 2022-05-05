import java.util.Scanner;
class ExerciSq10 {

    public static void main(String[]args) {
        float F, C;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o a temperatuda em graus Celsius : ");
        C = scan.nextFloat();
        F =   (C * 9/5) + 32;
        System.out.println("A temperatuda em Fahrenheit e de "+F);
        scan.close();       
    }

}