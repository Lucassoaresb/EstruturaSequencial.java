import java.util.Scanner;
class ExerciSq15 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double salario, bruto, horas,IR,INSS,Sindicato,salarioliq;
        System.out.println("Digite o quando voce ganha por hora: ");
        salario = scan.nextDouble();
        System.out.println("Digite quantas horas voce trabalha por mes: ");
        horas = scan.nextDouble();
        bruto = salario * horas;
        System.out.println("+ Salário Bruto: R$"+bruto);
        IR = bruto * 0.11;
        System.out.println("- IR (11%): R$"+IR);
        INSS = bruto * 0.08;
        System.out.println("- INSS (8%): R$"+INSS);
        Sindicato = bruto * 0.05;
        System.out.println("- Sindicato (5%): R$"+Sindicato);
        salarioliq = bruto - (INSS + IR + Sindicato);
        System.out.println("= Salário Liquido: R$"+salarioliq);
        scan.close();
    }
}