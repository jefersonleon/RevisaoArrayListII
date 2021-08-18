/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import static br.ulbra.model.CadUsu.bdUsu;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class CadHard {

    public static List<Hardware> bdHar;

    public CadHard() {
        //construtor
        bdHar = new ArrayList();
    }

    public void salvar(Hardware har) {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente salvar o periférico " + har.getNome() + "?",
                "Confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            bdHar.add(har);
            JOptionPane.showMessageDialog(null, "Hardware Salvo com Sucesso!", "Confirmação",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Armazenamento cancelado", "Cancelado",
                    JOptionPane.WARNING_MESSAGE);
        }

    }

}
