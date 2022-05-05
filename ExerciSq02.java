import java.util.Scanner;
class ExerciSq02{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero");
        numero = leia.nextInt();
        System.out.println("O numero informado foi "+numero);
        leia.close();
    }
}