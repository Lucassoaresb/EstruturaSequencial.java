import java.util.Scanner;
import java.text.DecimalFormat;
class ExerciSq12{
    public static void main(String[]args){
        double alt, calculo;
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("informe sua altua: ");
        alt = scan.nextFloat();
        calculo = (72.7*alt)-58;
        System.out.print("O peso ideal para essa altura é de: ");
        System.out.println(deci.format(calculo)+" Kg");
        scan.close();
    }
}