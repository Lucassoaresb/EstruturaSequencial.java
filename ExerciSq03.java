import java.util.Scanner;
class ExerciSq03{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        int numero, numeor2, soma;
        System.out.println("Digite dois número");
        numero = leia.nextInt();
        numeor2 = leia.nextInt();
        soma = numero + numeor2;
        System.out.println("A soma dos números foi: "+soma);
        leia.close();
    }
}