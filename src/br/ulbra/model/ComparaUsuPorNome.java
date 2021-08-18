/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.util.Comparator;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class ComparaUsuPorNome implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        if (o1 == null || o2 == null) {
            JOptionPane.showMessageDialog(null, "Nome em Branco");
        }
        String n1 = o1.getNome();
        String n2 = o2.getNome();
        return n1.compareTo(n2);
    }

}
