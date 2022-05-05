import java.util.Scanner;
class ExerciSq07{
public static void main(String[]args){

        double base, alt, area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a base e a altura do quadrado");
        System.out.println("Valor da base: ");
        base = scan.nextDouble();
        System.out.println("Valor da altura: ");
        alt = scan.nextDouble();
        area = alt * base ;
        area = area * 2;
        System.out.println("O dobro da area: "+area);
        scan.close();
    }
}