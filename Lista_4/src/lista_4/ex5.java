package lista_4;

/**
 *
 * @author Deivid Batista
 * Este programa imprimirá o resultado da soma quando a soma for maior que 20. Se a soma for
menor ou igual a 20, o programa imprime uma mensagem de aviso ao usuário
 */
import java.util.Scanner; //importa o scanner
public class ex5 
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner (System.in); //inicia o scanner
        int numero1, numero2, condicional; //declaraçao de variaveis
        int soma = 0;//declaraçao de variaveis
        
        System.out.println("Sistema para soma de 2 numeros!");//imprime na tela
        System.out.println("Digite o numero 1:");//imprime na tela
        numero1 = leia.nextInt(); //coleta o valor
        System.out.println("Digite o numero 2:");//imprime na tela
        numero2 = leia.nextInt(); //coleta o valor
        
        soma = numero1 + numero2; //calculo matematico
        if (soma > 20) //estrutura condicional
        {
            System.out.println("A soma de " +numero1+ " E " +numero2+ " É maior que 20 e igual a " +soma);//imprime na tela
        }
        else //estrutura condicional
        {
            System.out.println("A soma de " +numero1+ " E " +numero2+ " é menor ou igual a 20");//imprime na tela
        }   
    }
}
