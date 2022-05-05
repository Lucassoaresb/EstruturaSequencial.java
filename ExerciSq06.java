import java.util.Scanner;
class ExerciSq06 {

    public static void main(String[] args) {
        double raio;
        double area;
        final double PI = 3.1416;

       System.out.println("Escreva o valor do raio");
       Scanner leia = new Scanner(System.in);
       raio = leia.nextFloat();

       area  = PI* (raio*raio);

       System.out.print("O valor da area: " + area);  
       leia.close();
    }
}