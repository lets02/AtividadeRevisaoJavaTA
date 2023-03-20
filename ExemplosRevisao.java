package AtividadeRevisao1;

import java.util.Scanner;

public class ExemplosRevisao {
    Scanner sc= new Scanner(System.in);

    //Criar métodos da Classe
    public void exemplo1() {
        //Criar um Projeto para ler 2 Notas e a Frequência
        // e falar se o aluno está reprovado ou aprovado   
        //1. ler a primeira nota
        System.out.println("Informe a Primeira nota do Aluno");
        int nota1 = sc.nextInt();
        //2. ler a segunda nota
        System.out.println("Informe a Segunda nota do Aluno");
        int nota2 = sc.nextInt();
        //3. calcular a média das notas
        double media = (nota1+nota2)/2;
        //4. mostrar a media calculada
        System.out.println("A média do aluno é"+media);
        //5. Informar o total de aulas
        System.out.println("Professor, informe o total de aulas dadas");
        int aulasDadas = sc.nextInt();
        //6. Informar a quantidade de faltas do aluno
        System.out.println("Professor, informe o nº de faltas do aluno");
        int nfaltas = sc.nextInt(); 
        //7. calcular a % de frequencia
        double frequencia = ((aulasDadas-nfaltas)/aulasDadas)*100; //transformando em porcetagem
        //8. Mostrar a % de Frequencia do aluno
        System.out.println(" O aluno teve "+frequencia+"%");
        //9. se (media>=50 e Frequencia>=75)
        if(media>50 && frequencia>=75){
            System.out.println("Aluno Aprovado");
        } else if (media<50 && frequencia>=75){
        System.out.println ("Aluno está de Recuperação");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }
}
