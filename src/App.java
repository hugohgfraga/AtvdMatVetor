import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        /*1)  int[] numeros = new int[10];

        for(int n = 0; n < 10; n++){
            System.out.println("Digite um numero: ");
            numeros[n] = scan.nextInt();
        }*/


        /*2) char[][] nome = {
            {'H', 'U', 'G', 'O'},
            {' ', 'H', 'E', 'N'},
            {'R', 'I', 'Q', 'U'},
            {'E', ' ', 'G', 'R'},
            {'A', 'Z', 'I', 'A'},
            {'N', 'I', ' ', 'F'},
            {'R', 'A', 'G', 'A'}
        };

        for(char[] linhas:nome){
            for(char coluna:linhas){
                System.out.print(coluna);
            }

        }*/
    

        /*3) int[][] num =new  int[5][5];
        int mr = Integer.MIN_VALUE; 

       /*  for(int nu = 0; nu < 5; nu++){
            for(int nd = 0; nd< 5; nd++){
                System.out.println("Insira um valor: ");
                num[nu][nd] = scan.nextInt();

                if(num[nu][nd] > mr){
                    mr = num[nu][nd];
                }
            }
        }

        System.out.println("O maior valor digitado foi: " + mr); 

         */


        /*4) /*int[] vet = new int[10];

        for(int i = 0; i < vet.length; i++){
            vet[i] = random.nextInt(50) +1;
        }

        System.out.print("Vetor gerado: ");
        for (int num : vet) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Digite um número inteiro de 1 a 50 para ser buscado no vetor: ");
        int busca = scan.nextInt();

        int nv;
        for(nv = 0; nv < vet.length; nv++){
            if(vet[nv] == busca){
                    System.out.println("O número digitado foi encontrado na indice: " + nv);
                    break;
            }
        }

        if (nv == vet.length) {
            System.out.println("O número digitado não foi encontrado no vetor.");
        }*/


        /*5) int[][] mat = new int[3][3];

        for(int li = 0; li < mat.length; li++){
            for(int colun = 0; colun <mat.length; colun++){
                mat[li][colun] = random.nextInt(10) +1;
            }
        }

        for(int li = 0; li < mat.length; li++){
            int somali = 0;
            for(int colun = 0; colun <mat[li].length; colun++){
              System.out.print(mat[li][colun] + " ");
              somaLinha += mat[li][colun];
            }
            System.out.println(" | A soma da linha foi: " + somaLinha);
        }*/
    }
}