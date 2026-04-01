package ex1_lista5;

/**
 *
 * @author Deivid Batista
 * Esse programa retorna o mês conforme o numero
 */
import java.util.Scanner; //Importa o scanner
public class Ex1_lista5 {
    public static void main (String[] args) {
    Scanner leia = new Scanner (System.in); //inicia o scanner
    int numero; //declaração de variavel
    
        System.out.print ("Digite o número do mês: "); //impressao na tela
        numero = leia.nextInt();        //coleta de dado digitado
            
            switch (numero) 
            {
                case 1:
                    System.out.print ("O mês número 1 é Janeiro!!"); //impressao na tela
                    break;
                case 2: 
                    System.out.print ("O mês número 2 é Fevereiro!!");//impressao na tela
                    break;
                case 3: 
                    System.out.print ("O mês número 3 é Março!!");//impressao na tela
                    break;
     
                case 4: 
                    System.out.print ("O mês número 4 é Abril!!");//impressao na tela
                    break;

                case 5: 
                    System.out.print ("O mês número 5 é Maio!!");//impressao na tela
                    break;
  
                case 6: 
                    System.out.print ("O mês número 6 é Junho!!");//impressao na tela
                    break;
        
                case 7: 
                    System.out.print ("O mês número 7 é Julho!!");//impressao na tela
                    break;
         
                case 8: 
                    System.out.print ("O mês número 8 é Agosto!!");//impressao na tela
                    break;
          
                case 9: 
                    System.out.print ("O mês número 9 é Setembro!!");//impressao na tela
                    break;
           
                case 10: 
                    System.out.print ("O mês número 10 é Outubro!!");//impressao na tela
                    break;
           
                case 11: 
                    System.out.print ("O mês número 11 é Novembro!!");//impressao na tela
                    break;
            
                case 12: 
                    System.out.print ("O mês número 12 é Dezembro!!");//impressao na tela
                    break;
          
                default: 
                    System.out.print ("Não existe mês com esse numero!!");//impressao na telaã
                    break;
    
    }
    
}
}
