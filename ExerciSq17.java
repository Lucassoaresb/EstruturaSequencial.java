import java.util.Scanner;
import java.text.DecimalFormat;
class ExerciSq17{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        double area, litros, latas, totalL, totalG, galoes,MixG, MixL,PrecoMix;
        double precoL = 80;
        double capacidadeL = 18;
        double precoG = 25;
        double capacidadeG = 3.6;
        System.out.println("Insira o valor da área em m²: ");
        area = scan.nextDouble();
        litros = area / 6;
        latas = litros / capacidadeL;
        if(latas % capacidadeL !=0){
            latas+=1;
        }
        totalL = latas * precoL;
        System.out.println("Com apenas latas voce vai usar "+(deci.format(latas)+" latas de tinta"));
        System.out.println("Utilizando somente latas preco total é de: R$"+(deci.format(totalL)));
        System.out.println();
        galoes = litros / capacidadeG;
        if(galoes % capacidadeG !=0){
            galoes+=1;
        }
        totalG = galoes * precoG;
        System.out.println("Com apenas galões voce vai usar "+(deci.format(galoes)+" galões de tinta"));
        System.out.println("Utilizando somente galões preco total é de: R$"+(deci.format(totalG)));
        System.out.println();
        MixL = litros / capacidadeL;
        MixG = ((litros - (MixL * capacidadeL)) /3.6);
        PrecoMix = ((MixL * precoL)+(MixG * precoG));
        if((litros -(MixL * capacidadeL)%3.6) !=0){
            MixG +=1;
        }
        System.out.println("com galões e latas voce ira utilizar "+(deci.format(MixG))+" Galões "+(deci.format(MixL))+" Latas");
        System.out.println("Utilizando galoes e latas voce irá gastar: R$"+(deci.format(PrecoMix)));
        scan.close();
    }
}