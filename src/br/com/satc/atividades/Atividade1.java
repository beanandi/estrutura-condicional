
package br.com.satc.atividades;

import java.util.Scanner;

/**
 *
 * @author Edutec
 */
public class Atividade1 {

    public static void main(String[] args) {
    /*Fazer um programa para calcular a média de 3 notas, perguntar qual a nota
    mínima para a aprovação e se tem direito à recuperação. Se tiver, perguntar
    a nota da recuperação e refazer a média. Mostrar a média e situação do aluno
    no final */
    
    Scanner entrada = new Scanner (System.in);
    float n1, n2, n3, nc;
    System.out.println("Qual foi a sua nota no primeiro trimestre?");
    n1 = entrada.nextFloat();
    System.out.println("Qual foi a sua nota no segundo trimestre?");
    n2 = entrada.nextFloat();
    System.out.println("Qual foi a sua nota no terceiro trimestre?");
    n3 = entrada.nextFloat();
    
    float media = (n1 + n2 + n3)/3;
  
    System.out.println("Qual a nota mínima para a aprovação?");
    nc = entrada.nextFloat();
    
    if (nc<= media) {
        System.out.println("Você foi aprovado! \n Sua média foi +media+");
    } else {
        System.out.println("O aluno tem direito a recuperação?" (SIM/NÃO));
        String direito = entrada.next();
        if 
    }
    
    
    
    
    
          
    
    }
    
}
