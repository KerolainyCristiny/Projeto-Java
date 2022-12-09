import java.util.Scanner;
public class Projeto1{

    public static void main(String[] agrs) {
        Scanner leia = new Scanner(System.in);
        
        System.out.println("\t\t╔════*^^*════╗");
        System.out.println("\t\t    TABUADA    ");
        System.out.println("\t\t╚════*vv*════╝");
        System.out.println("Digite o número que você deseja multiplicar: ");
        int n = leia.nextInt();
        System.out.println("Digite a quantidade de vezes que você deseja \nque o número seja multiplicado ");
        int quant = leia.nextInt();
        
        char[] digitos = String.valueOf( n ).toCharArray();
        
            String[]num = new String[10];
  	            num[0]="Zero";
	            num[1]="Um";
	            num[2]="Dois";
	            num[3]="Três";
	            num[4]="Quatro";
	            num[5]="Cinco";
	            num[6]="Seis";
	            num[7]="Sete";
	            num[8]="Oito";
	            num[9]="Nove";

                
        for ( char d : digitos ) {
            System.out.println("\n\n═════════ * ═════════");
              int b = Character. getNumericValue(d); 
            System.out.print("Tabuada de "+num[b]+"\n");

            for(int i = 1; i <= quant; i++){
                int total = n*i;
                    System.out.print("\n "+n+ " x "+i+" = "+ total);
                if (total % 10 == 0){
                    System.out.print("\t é múltiplo de 10\n");

                }
            }
        }
    }
}