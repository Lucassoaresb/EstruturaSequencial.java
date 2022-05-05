import java.util.Scanner;
class ExerciSq08{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double salario, horas;
        System.out.println("Digite o quando voce ganha por hora: ");
        salario = scan.nextDouble();
        System.out.println("Digite quantas horas voce trabalha por mes: ");
        horas = scan.nextDouble();
        salario = salario * horas;
        System.out.println("O seu salario mensal e de: R$"+salario);
        scan.close();
    }
}