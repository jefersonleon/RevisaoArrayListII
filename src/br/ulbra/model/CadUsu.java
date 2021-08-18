/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson
 */
public class CadUsu {

    public static List<Usuario> bdUsu;

    public CadUsu() {
        //construtor
        bdUsu = new ArrayList();
    }

    public void salvar(Usuario usu) {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente salvar o usuário(a) " + usu.getNome() + "?",
                "Confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            bdUsu.add(usu);
            JOptionPane.showMessageDialog(null, "Usuario Salvo com Sucesso!", "Confirmação",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Armazenamento cancelado", "Cancelado",
                    JOptionPane.WARNING_MESSAGE);

        }
    }

    public void exibirM(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void editar(int indice, Usuario usu) {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente Alterar os dados do(a) usuário(a) "
                + bdUsu.get(indice).getNome() + "?", "Confirme", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            bdUsu.set(indice, usu);
            exibirM("Registro alterado com sucesso");
        }else{
             JOptionPane.showMessageDialog(null, "Alteração cancelada", "Cancelado",
                    JOptionPane.WARNING_MESSAGE);
        }
    }
    public void excluir(int indice){
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente Excluir o(a) usuário(a) "
                + bdUsu.get(indice).getNome() + "?", "Confirme", JOptionPane.YES_NO_OPTION)
                == JOptionPane.YES_OPTION) {
            bdUsu.remove(indice);
            exibirM("Registro removido com sucesso");
        }
    }
}
