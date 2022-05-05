import java.util.Scanner;
class ExerciSq14{
    public static void main(String[]args){
        float peso, excesso, multa, pesolimite=50;
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos quilos de peixe Seu João pescou hoje? ");
        peso = scan.nextFloat();
        if (peso>pesolimite){
            excesso = peso - pesolimite;
            multa = excesso * 4;
            System.out.println("Seu João vai pagar uma multa no valor de: R$"+multa);
        
        }else{
            System.out.println("Não será necessário pagar multa, Seu João pescou "+peso+" Kg de peixe");
        }
        scan.close();
    }
}