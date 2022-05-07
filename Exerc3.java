/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc3;

/**
 *
 * @author aluno
 */
public class Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item (201032, "Bom", 10, 200, 0);
        System.out.println("Codigo: "+i1.getCodigo());
        System.out.println("Descricao: "+i1.getDescricao());
        System.out.println("Quantidade: "+i1.getQuantComprada());
        System.out.println("Quantidade comprada: "+i1.getPrecoItem());
        System.out.println("Total: "+i1.getTotal());

        
        
        
    }
    
}
