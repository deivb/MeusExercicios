
    package lista_4;

    /**
     *
     * @author Deivid Batista
     *Esse programa serve para controle de notas escolares.
     */
    import java.util.Scanner; //importa o scanner
    public class ex10 {
        public static void main (String []args)
        {
            Scanner leia = new Scanner (System.in); // inicia o scanner
            int ra; //declaracao de variavel
            double av1, av2, ml1,ml2,bimestre1,bimestre2,mediafinal;//declaracao de variaveis
            String conceito;//declaracao de variavel
            System.out.println("Sistema para controle de notas escolares ");//imprime na tela
            System.out.println("Digite o numero do RA:");//imprime na tela
            ra = leia.nextInt(); //coleta o valor
            System.out.println("Digite a nota da Avaliação 1:");  //imprime na tela
            av1 = leia.nextDouble(); //coleta o valor
            System.out.println("Digite a nota da Lista de exercicios 1:");  //imprime na tela
            ml1 = leia.nextDouble(); //coleta o valor
            System.out.println("Digite a nota da Avaliação 2:");  //imprime na tela
            av2 = leia.nextDouble(); //coleta o valor
            System.out.println("Digite a nota da Lista de exercicios 2:");  //imprime na tela
            ml2 = leia.nextDouble(); //coleta o valor

            bimestre1= ((av1*0.8) + (ml1* 0.2)); //operaçao matematica
            bimestre2= ((av2*0.8) + (ml2* 0.2)); //operaçao matematica
            mediafinal= ((bimestre1+bimestre2)/2); //operaçao matematica

            System.out.println("Aluno RA : "+ra); //imprime na tela
            System.out.println("Media Bimestre 1 : "+bimestre1); //imprime na tela
            System.out.println("Media Bimestre 2 : "+bimestre2); //imprime na tela
            System.out.println("Media Final : "+mediafinal); //imprime na tela

            if(mediafinal>= 9) //estrutura condicional
            {
                conceito = "A"; //preenchimento de variavel
            }

            else if (mediafinal >=7.5 && mediafinal < 9) //estrutura condicional
            {
                conceito = "B"; //preenchimento de variavel
            }

            else if (mediafinal >=6 && mediafinal < 7.5) //estrtural condicional
            {
                conceito = "C"; //preenchimento de variavel
            }

            else if (mediafinal >=4 && mediafinal < 6.0) //estrutura condicional
            {
                conceito = "D"; //preenchimento de variavel
            }

            else //estrutura condicional
            {
                conceito = "E"; //preenchimento de variavel
            }

            System.out.println("Conceito  : "+conceito); //impressao na tela

            if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C") ) //estrutura condicional
            {
                 System.out.println("Aprovado  !!!!"); //imprime na tela
            }

            else
            {
                System.out.println("Reprovado  !!!!"); //imprime na telaã
            }

        }


    }