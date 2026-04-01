
package ex1_lista5;

/**
 *
 * @author Deivid  Batista
 * Esse programa retorna o mês de licenciamento conforme calendário do Estado do Mato Grosso do Sul
 */
import java.util.Scanner; //importa o scanner
public class ex5 
{
    public static void main (String[] args) 
    {
    Scanner leia = new Scanner (System.in);//inicia o scanner
    int ultimo; //declaraçao variavel
    
    System.out.print ("Digite o ultimo dígito da placa do veículo: ");//impressao na tela
        ultimo = leia.nextInt();  //coleta dado
            
            switch (ultimo) 
            {
                case 1: 
                case 2:   
                             System.out.print ("O mês de licenciamento  será Abril "); //impressão tela
                    break;
        
                case 3:  
                             System.out.print ("O mês de licenciamento  será Maio ");//impressão tela
                    break;
                    
                case 4: 
                case 5:   
                             System.out.print ("O mês de licenciamento  será Junho ");//impressão tela
                    break;    
                
                case 6:   
                             System.out.print ("O mês de licenciamento  será Julho ");//impressão tela
                    break; 
                
                
                case 7: 
                case 8:   
                             System.out.print ("O mês de licenciamento  será Agosto ");//impressão tela
                    break;
                case 9:   
                             System.out.print ("O mês de licenciamento  será Setembro ");//impressão tela
                    break;
                case 0:   
                             System.out.print ("O mês de licenciamento  será Outubro ");//impressão tela
                    break;    
                    
                default: 
                        System.out.print("Digito inválido!");//impressão telaã
                 
            
            
            
            } 
                   

                }
}
