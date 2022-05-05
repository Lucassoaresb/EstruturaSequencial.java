import java.util.Scanner;
class ExerciSq05{
    public static void main(String[]args){

    Scanner leia = new Scanner(System.in);
    float valorCm, valorM;
    
    System.out.println("Digite o comprimento em metros: ");
    valorM = leia.nextFloat();
    //valorCm = leia.nextDouble();
    valorCm = valorM * 100;
    System.out.println("Valor convertido "+ valorCm);
    leia.close();
    }
}