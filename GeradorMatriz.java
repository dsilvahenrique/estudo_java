import java.util.Random;
import java.util.Scanner;

public class GeradorMatriz {
    public static void main(String[] args) {
        
         int linha, coluna;
       
        Scanner teclado = new Scanner (System.in);
            System.out.println("                            Bem Vindo ao Gerador de Matriz!");
            System.out.println("Quantas linhas deseja?");
            linha = teclado.nextInt();
            System.out.println("Quantas colunas deseja?");
            coluna = teclado.nextInt();
            System.out.println("Matriz " + linha +" X "+ coluna );
        teclado.close();

        int matriz[][] = new int[linha][coluna];

        Random shuffle = new Random();
        for (int w = 0; w < linha; w++) {
            for (int i = 0; i < coluna; i++) {
                int numero = shuffle.nextInt(99);
                System.out.print(numero +"  ");
                matriz[w][i] = numero;
            }   System.out.println();
        }

        System.out.println(matriz[1][1]);

    }  
}
