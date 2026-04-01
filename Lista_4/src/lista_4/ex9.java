package lista_4;

/**
 *
 * @author Deivid Batista
 * Esse programa realiza o calculo conforme a condiçao de pagamento selecionada
 */
import java.util.Scanner; //Importa o Scanner
public class ex9 
{
    public static void main (String[]args)
    {
        Scanner leia = new Scanner (System.in); //inicializa o scanner
        double preco1;
        double preco2 = 0;
        int opcao;
        
        System.out.println("Programa para calculo de valor do produto"); //imprime na tela
        System.out.println("Digite o valor de etiqueta do produto:");//imprime na tela
        preco1 = leia.nextDouble(); //coleta do valor
        System.out.println("Meios de pagamento:");
        System.out.println("Opção 1 para venda a vista em dinheiro ou pix");//imprime na tela
        System.out.println("Opção 2 para venda a vista em cartão de credito");//imprime na tela
        System.out.println("Opção 3 para venda a prazo (2x) em cartão de credito");//imprime na tela
        System.out.println("Opção 4 para venda a prazo (3x) em cartão de credito");//imprime na tela
        System.out.println("Digite a opção de pagamento selecionada:");//imprime na tela
        opcao = leia.nextInt(); //coleta de valor 
        
        switch (opcao) //estrutura condicional
        {
            case 1: 
                    
                        preco2 = preco1 - (preco1 * 0.15); //variavel preenchida pelo calculo
                        System.out.println("O preço nessa condicao de pagamento sera: "+ preco2);//imprime na tela
                        break;
            case 2:
                        preco2 = preco1 - (preco1 * 0.05);//variavel preenchida pelo calculo
                        System.out.println("O preço nessa condicao de pagamento sera: "+ preco2);//imprime na tela
                        break;
            case 3:
                        System.out.println("O preço nessa condicao de pagamento sera:"+ preco1);//imprime na tela
                        break;
            case 4: 
                        preco2 = preco1 + (preco1 * 0.10);//variavel preenchida pelo calculo
                        System.out.println("O preço nessa condicao de pagamento sera:"+ preco2); //imprime na tela
                        break;
                        
            default:
                        System.out.println("Condiçao de pagamento invalida");
        }
    }
}