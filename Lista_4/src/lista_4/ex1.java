package lista_4;

/**
 *
 * @author Deivid Batista
 * Esse programa vai calcular a media de 2 notas baseada nos pesos apresentados e trara a média ponderada.
 */
import java.util.Scanner; //importa o scanner
public class ex1
{
    public static void main (String[]args)
    {
        Scanner leia = new Scanner (System.in); //inicializa o scanner
        double nota1,peso1,resultado1,nota2,peso2,resultado2,media;
        
        System.out.println("Sistema para calculo de notas: "); //imprime na tela
        System.out.println("Digite a nota 1: "); //imprime na tela
        nota1 = leia.nextDouble(); //coleta o valor 
        System.out.println("Digite o peso nota 1: "); //imprime na tela
        peso1 = leia.nextDouble(); //coleta o valor 
        System.out.println("Digite a nota 2: "); //imprime na tela
        nota2 = leia.nextDouble(); //coleta o valor 
        System.out.println("Digite o peso da nota 2: "); //imprime na tela
        peso2 = leia.nextDouble(); //coleta o valor 
        
        resultado1 = (nota1*peso1); //calculo matematico
        resultado2 = (nota2*peso2); //calculo matematico
        media= (resultado1 + resultado2) / (peso1 +peso2);  //calculo matematico
        System.out.println("A média ponderada será: "+media); //imprime na tela
        
    }


    
}
