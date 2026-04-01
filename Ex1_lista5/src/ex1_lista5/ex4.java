
package ex1_lista5;

/**
 *
 * @author Deivid Batista
 * Esse programa calcula o salário de um professor conforme seu nível
 */
import java.util.Scanner; //Importa o scanner
public class ex4 
{
    public static void main (String[] args) 
    {
    Scanner leia = new Scanner (System.in); // Inicia o scanner
    int nivel, horas; //Declaração de variaveis
    int resultado = 0; //Declaração de variável iniciando com 0
    
    System.out.print ("Digite o nível do Professor: "); //Impressão na tela
        nivel = leia.nextInt(); //Coleta do valor digitado
    System.out.print ("Digite as horas trabalhadas: ");//Impressão na tela
        horas = leia.nextInt();   //Coleta do valor digitado         
            
            switch (nivel) 
            {
                case 1: 
                        
                             resultado = horas * 12; //Calculo conforme nivel 1
                             System.out.print ("O Salário do Professor será "+ resultado); //Impressão na tela
                    break;
                case 2: 
                            resultado = horas * 17; //Calculo conforme nivel 2
                             System.out.print ("O Salário do Professor será "+ resultado); //Impressão na tela
                    break;
                case 3:  
                             resultado = horas * 25; //Calculo conforme nivel 3
                             System.out.print ("O Salário do Professor será "+ resultado); //Impressão na tela
                    break;
                         
                default: 
                        System.out.print("Nível inválido!"); //Retorno de nivel incorretoã
                 
            
            
            
            } 
                   

                }
}
