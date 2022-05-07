/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio;

/**
 *
 * @author aluno
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo (10,15);
        Retangulo r2 = new Retangulo (13,14);
        System.out.println("Perimetro e: "+r1.getPerimetro());
        System.out.println("Area e: "+r2.getArea());
    }
    
}
