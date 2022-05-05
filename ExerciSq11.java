import java.util.Scanner;
class ExerciSq11 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int numero, numero2;
        float numero3, a, b;
        double c;
        System.out.println("Digite dois numeros inteiros: ");
        numero = scan.nextInt();
        numero2 = scan.nextInt();
        System.out.println("Digite um numero real: ");
        numero3 = scan.nextFloat();
        a = numero * 2 * numero2/2;
        System.out.println("A. o produto do dobro do primeiro com metade do segundo = "+ a);
        b = ((numero * 3) + numero3) ;
        System.out.println("B. a soma do triplo do primeiro com o terceiro = "+b);
        c = Math.pow(numero3, 3);
        System.out.println("C. o terceiro elevado ao cubo = "+ c);
        scan.close();
    }
}