package lista_4;

/**
 *
 * @author Deivid Batista
 *Esse programa serve para verificar se o numero digitado e par ou impar
 */
import java.util.Scanner; //importa o scanner
public class ex3 {
    public static void main (String []args)
    {
        Scanner leia = new Scanner (System.in); // inicia o scanner
        int numero;
        System.out.println("Sistema para verificar se o numero digitado e par ou impar");
        System.out.println("Digite o numero:");
        numero = leia.nextInt(); //coleta o valor
        
        if (numero %2 == 0)
        {
            System.out.println("O numero informado e par!!");
        }
        else
        {
            System.out.println("O numero informado e impar!!");
        }
    }
    
    
}
