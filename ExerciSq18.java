import java.util.Scanner;
import java.text.DecimalFormat;
class ExerciSq18{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0");
        float tamanho, velocidade, tempo;
        System.out.println("Informe o tamanho do arquivo em (MB): ");
        tamanho = scan.nextFloat();
        System.out.println("Informe a velocidade da internet (MBps): ");
        velocidade = scan.nextFloat();
        tempo = ((tamanho/velocidade)*60);
        System.out.println("O tempo aproximado de download: "+(deci.format(tempo))+" minutos");
        scan.close();
    }
}