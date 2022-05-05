import java.util.Scanner;
class ExerciSq09 {

    public static void main(String[]args) {
        float F, C;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o a temperatuda em Fahrenheit: ");
        F = scan.nextFloat();
        C =  5 * ((F-32) / 9);
        System.out.println("A temperatuda em graus Celsius. e de "+C);
        scan.close();       
    }

}