/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author aluno
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Claudin","Buchecha", 1000, 1000*1.1);
        Funcionario f2 = new Funcionario ("Marquin","SemTeto", -1000, -1000*1.1);
        System.out.println("Nome: "+f1.getNome());
        System.out.println("Sobrenome: "+f1.getSobrenome());
        System.out.println("Salario: "+f1.getSalarioMensal());
        System.out.println("Salario Anual: "+f1.getAnual());
        System.out.println("Aumento: "+f1.getAumento());
        
        System.out.println("Nome: "+f2.getNome());
        System.out.println("Sobrenome: "+f2.getSobrenome());
        System.out.println("Salario: "+f2.getSalarioMensal());
        System.out.println("Aumento: "+f2.getAumento());
        
        
        
        
        
            
    }
    
}
