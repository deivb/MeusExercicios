package lista_4;

/**
 *
 * @author Deivid Batista
 * Este programa vai ler o numero e verificar se o mesmo e multiplo de 8
 */
import java.util.Scanner; //importa o scanner
public class ex4 
{
    public static void main (String [] args)
    {
        Scanner leia = new Scanner (System.in); //inicia o scanner
        int valor; //declaracao de variavel
        
        System.out.println("Sistema para verificar se o numero e multiplo de 8"); //imprime na tela
        System.out.println("Digite o numero");//imprime na tela
        valor = leia.nextInt(); //coleta o valor
        
        if (valor % 8 ==0) //estrutura condicional
        {
            System.out.println("O numero informado " +valor+ " e multiplo de 8"); //imprime na tela
        }
        else
        {
            System.out.println("O numero informado " +valor+ " nao e multiplo de 8"); //imprime na tela
        }
        
    }
   
}
