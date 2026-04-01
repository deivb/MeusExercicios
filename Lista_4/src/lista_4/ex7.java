
package lista_4;

/**
 *
 * @author Deivid Batista
 * Esse programa calcula a faixa do IMC conforme peso apontado
 */
import java.util.Scanner;
public class ex7
    {
    public static void main (String[] args)
        {
            Scanner leia = new Scanner (System.in); //Inicia o Scanner
            double peso, altura, imc; // declaração de variavel
            
            System.out.println("Programa para cálculo de IMC ( INDICE DE MASSA CORPOREA) conforme Peso"); //imprime na tela
            System.out.println("Digite seu Peso"); //imprime na tela
            peso = leia.nextDouble(); //coleta dado na variavel
            System.out.println("Digite sua Altura");//imprime na tela
            altura = leia.nextDouble();//coleta dado na variac
            
            imc = (peso / (altura * altura)); //calculo matematico
            
            if (imc <=18.5) // estrutura condicional
            {
                System.out.println(" Abaixo do peso");//imprime na tela
            }
            
            else if (imc >= 18.5 && imc <= 25 )// estrutura condicional
            {
                System.out.println("Peso normal");//imprime na tela
            }
            
            else if (imc >= 25 && imc < 30)// estrutura condicional
             {
                System.out.println("Acima do peso");//imprime na tela
             }
            
            else if (imc >= 30)// estrutura condicional
            {
                System.out.println("Obeso");//imprime na tela
            }
            

        
        }
    
    }
