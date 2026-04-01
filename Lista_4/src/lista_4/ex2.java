package lista_4;

/**
 *
 * @author Deivid Batista
 * Esse programa calculara o aumento do salario a partir do salario inicial bruto e o novo salario apos aumento com os descontos
 */

import java.util.Scanner; //importa o scanner
public class ex2 
{
    public static void main (String[]args)
    {
        Scanner leia = new Scanner (System.in); //inicia o scanner
        double salini, salaume,novosal; //declaracao de variaveis
        
        System.out.println("Sistema para calculo de Salario" );//imprime na tela
        System.out.println("Digite o salario antes do aumento: " );//imprime na tela
        salini = leia.nextDouble(); //coleta valor
        salaume = (salini+(salini *0.3)); //calculo matematico
        novosal = (salaume - (salaume * 0.21)); //calculo matematico
        
        System.out.println("O salario bruto apos aumento, sera: "+salaume);//imprime na tela
        System.out.println("O salario liquido apos aumento e descontos sera: " +novosal);//imprime na tela
        
    }
    
    
}
