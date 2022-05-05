import java.util.Scanner;
class ExerciSq04{
    public static void main(String[]args){
        Scanner leia = new Scanner(System.in);
        double nota,nota2, nota3, nota4;
        double media;
        System.out.println("Digite as quatro notas");
        nota = leia.nextInt();
        nota2 = leia.nextInt();
        nota3 = leia.nextInt();
        nota4 = leia.nextInt();
        media = (nota + nota2 + nota3 + nota4)/4;
        
        System.out.println("A soma dos números foi: "+media);
        leia.close();
    }
}