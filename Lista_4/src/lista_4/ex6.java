package lista_4;

/**
 *
 * @author Deivid Batista
 * Esse programa calcula a faixa etária conforme a idade apresentada!!
 */

import java.util.Scanner; //importa o scanner
public class ex6 {
    public static void main (String[] args) 
    { 
        Scanner leia = new Scanner (System.in); //inicia scanner
        int idade; //declaração de variavel
        
        
        System.out.println ("Programa para classificação etária");//imprime na tela
        System.out.println ("Digite sua idade");//imprime na tela
        idade = leia.nextInt(); //coleta dado
        
                
                if (idade >=0 && idade <=8) //comando condicional
                {
                    System.out.println ("Pessoa na Infância"); //imprime na tela
                }
                
                else if (idade >=9 && idade <=13)//comando condicional
                {
                    System.out.println ("Pessoa na Pré Adolescencia");//imprime na tela
                }
                
                else if (idade >=14 && idade <=17)//comando condicional
                {
                    System.out.println ("Pessoa na Adolescencia");//imprime na tela
                }
                
                else if (idade >=18 && idade <=65)//comando condicional
                {
                    System.out.println ("Pessoa Adulta");//imprime na tela
                }
                
                else if (idade >65) //comando condicional
                {
                    System.out.println ("Pessoa Idosa");//imprime na tela
                }
        
    }
    
    
}
