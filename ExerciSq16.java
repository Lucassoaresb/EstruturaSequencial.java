import java.util.Scanner;
import java.text.DecimalFormat;
class ExerciSq16{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        double area, litros, latas,total;
        double precoL = 80;
        double capacidadeL = 18;
        System.out.println("Insira o valor da área em m²: ");
        area = scan.nextDouble();
        litros = area / 3;
        latas = litros / capacidadeL;
        total = latas * precoL;
        System.out.println("Voce vai usar "+(deci.format(latas)+" latas de tinta"));
        System.out.println("O preco total é de: R$"+(deci.format(total)));
        scan.close();
    }
}