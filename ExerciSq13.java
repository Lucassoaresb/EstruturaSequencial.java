import java.util.Scanner;
import java.text.DecimalFormat;
class ExerciSq13{
    public static void main(String[]args){
        double alt, calculoh, calculom;
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("informe sua altua: ");
        alt = scan.nextFloat();
        calculoh = (72.7*alt)-58;
        calculom = (62.1*alt)-44.7;
        System.out.println("O peso ideal para essa altura é: ");
        System.out.print("Para homens: ");
        System.out.println(deci.format(calculoh)+" Kg");
        System.out.print("Para Mulheres: ");
        System.out.println(deci.format(calculom)+" Kg");
        scan.close();
    }
}