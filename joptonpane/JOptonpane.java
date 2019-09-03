/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptonpane;

import javax.swing.JOptionPane;

/**
 *
 * @author mateu
 */
public class JOptonpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog("digite sua idade");
        String nome = JOptionPane.showInputDialog("digite seu nome");
        
       int idade = Integer.parseInt(txt);
       if(idade >= 18){
           JOptionPane.showMessageDialog(null, nome + " voce pode tirar CNH");
           
       }else {
           JOptionPane.showMessageDialog(null, nome + " voce nao pode tirar CNH, voce tem apenas " + idade + " anos");
       }
       
       
    }
    
}
