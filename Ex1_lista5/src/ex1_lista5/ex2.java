
package ex1_lista5;

/**
 *
 * @author Deivid Batista
 * Esse programa retorna o mês conforme o numero digitado
 */
import java.util.Scanner; 
public class ex2 
                {
    public static void main (String[] args) {
    Scanner leia = new Scanner (System.in); //funcionamento da função scanner
    int dia; //declaração da variavel dia
    
        System.out.print ("Digite o número do dia da semana: "); //Impressão na tela
        dia = leia.nextInt();      //recolhe o dado inserido  
            
            switch (dia) 
            {
                case 0:
                    System.out.print ("O dia 0 é Domingo!!");//Impressão na tela
                    break;
                case 1:
                    System.out.print ("O dia 1 é Segunda Feira!!");//Impressão na tela
                    break;
                case 2:
                    System.out.print ("O dia 2 é Terça Feira!!");//Impressão na tela
                    break;
                case 3:
                    System.out.print ("O dia 3 é Quarta Feira!!");//Impressão na tela
                    break;

                case 4:
                    System.out.print ("O dia 4 é Quinta Feira!!");//Impressão na tela
                    break;
                case 5:
                    System.out.print ("O dia 5 é Sexta Feira!!");//Impressão na tela
                    break;
                case 6:
                    System.out.print ("O dia 6 é Sábado!!");//Impressão na tela
                    break;
                default:
                    System.out.print ("Não existe dia com esse numero!!");//Impressão na tela
                    break;

                }
    }
}
    
