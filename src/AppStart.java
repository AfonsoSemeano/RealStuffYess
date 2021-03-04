import java.util.Locale;
import java.util.Scanner;

public class AppStart{
    public static void main(String [] args){
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Escreva um tamanho (Small, Medium ou Large).");
        String input = inputReader.next();
        input = input.toUpperCase();
        Size size = Size.valueOf(input);
        System.out.println("Name:           "+input);
        System.out.println("toString():     "+size.toString());
        System.out.println("Ordem:          "+size.ordinal());
        System.out.println("Valor minimo:   "+size.getMinValue());
        System.out.println("Valor maximo:   "+size.getMaxValue());
        System.out.println("Código:         "+size.getCode());
    }
}
