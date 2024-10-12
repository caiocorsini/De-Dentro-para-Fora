// Beecrowd - Problema 1235 - De Dentro para Fora
// Autor: Caio Vinicius Corsini Filho

import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inputUser = new Scanner(System.in); // Para pegar input do usuário
        int N;
        String linhaAtual;

        N = inputUser.nextInt();
        int fim,meio;

        inputUser.nextLine();
        for(int i=0; i<N; i++){ // Vai iterar o número de vezes que o usuário especificou
            linhaAtual = inputUser.nextLine(); // Digita a String defeituosa
            fim = linhaAtual.length() -1;

            // Pega o meio da string original. Adaptável para tamanho par e impar.
            if(fim%2!=0) meio = fim/2;
            else meio = (fim/2)-1;

            // Reseta a String de impressão a cada iteração
            String consertado = "";

            // Append de caractéres na String de impressão
            // Comeco ja colocando a letra do meio
            consertado += linhaAtual.charAt(meio);
            int j = meio-1;

            // Loop de trás para frente
            // Vai incrementando a String de impressão
            // Loop eh interrompido quando volto para o meio
            while(j != meio){
                if(j==-1) j=fim; // Para dar a volta ao ponteiro chegar no início da String
                consertado += linhaAtual.charAt(j);
                j--;
            }
            System.out.println(consertado); // Imprime a String consertada
        }
    }
}

/* PONTOS IMPORTANTES
1. Em Java e em C, em uma divisao inteira, caso o float seja convertido para Int, o numero eh arredondado por truncamento. Isso eh, a parte
decimal eh "jogada fora", dessa forma, 2/3 ao inves de ser "1.5", vira apenas "1".
2. Em java, para pegar um caractere de uma String eu uso o metodo charAt(x), ao inves de apenas os colchetes.
*/