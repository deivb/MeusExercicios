
package ex1_lista5;

/**
 *
 * @author Deivid Batista
 * O programa trata-se de uma calculadora de operações baseada em 2 digitos
 */
import java.util.Scanner; //importa o scanner 
public class ex3 
                {
    public static void main (String[] args) {
    Scanner leia = new Scanner (System.in); //inicia o scanner
    int res; //declaração de variaveis
    int dig1 = 0; //declaração de variavel com inicio 0
    int op = 0; //declaração de variavel com inicio 0
    int dig2 = 0; //declaração de variavel com inicio 0
  
    
        System.out.println ("Calculadora de operações: "); //impressão na tela
        System.out.println ("Operação 1: Soma "); //impressão na tela
        System.out.println ("Operação 2: Subtração "); //impressão na tela
        System.out.println ("Operação 3: Multiplicação ");//impressão na tela
        System.out.println ("Operação 4: Divisão ");//impressão na tela
        System.out.println ("Operação 5: Informa se o primeiro número é divisível por 7 "); //fazer
        System.out.println ("Operação 6: Informa se o segundo número é par ou ímpar "); //fazer 
        System.out.println ("Digite o número da operação: ");//impressão na tela
        op = leia.nextInt();        //coleta de dado
        if (op != 6 ) //não pedir o primeiro numero se selecionar operação 6
             {
                 System.out.println ("Digite o digito 1: ");//impressão na tela
                 dig1 = leia.nextInt();  //coleta de dado
             }
        
        if (op != 5 ) //não pedir o segundo numero se selecionar operação 5
             {
                 System.out.println ("Digite o digito 2: ");//impressão na tela
                 dig2 = leia.nextInt();  //coleta de dado
             }
        
        
        
        
            switch (op) 
            {
                case 1: 
                    res = dig1 + dig2; //operação matematica
                    System.out.println ("O resultado da soma é :"+ res);//impressão na tela
                    break;
                                
                case 2: 
                    res = dig1 - dig2; //operação matematica
                    System.out.println ("O resultado da subtração é :"+ res); //impressão na tela
                    break;
     
                case 3: 
                     res = dig1 * dig2; //operação matematica
                    System.out.println ("O resultado da multiplicação é :"+ res); //impressão na tela
                    break;

                case 4: 
                    res = dig1 / dig2; //operação matematica
                    System.out.println ("O resultado da divisão é :"+ res); //impressão na tela
                    break;
                case 5: 
                    if (dig1 % 7 ==0 )
                        { 
                        System.out.println ("O número é divisível por 7!!"); //impressão na tela
                         }
                    
                    else
                        {
                         System.out.println ("O número não é divisível por 7!!");//impressão na tela
                         }
                    
                    break;
        
                case 6: 
                    if (dig2 % 2 == 0)
                    {
                        System.out.println ("O número é par!!"); //impressão na tela
                         }
                    else 
                    {
                        System.out.println ("O número é impar!!"); //impressão na tela
                         }
                    break;
                    
                default: 
                {
                    System.out.print ("Não existe operação com esse numero!!"); //impressão na tela
                         }
                    break;

                }
    }
}
    
