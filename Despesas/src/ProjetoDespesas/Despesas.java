/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjetoDespesas;

import dadosdao.DaoDespesas;
import dadostelas.ManterDespesas;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author wesley
 */
public class Despesas {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        // TODO code application logic here

        JOptionPane.showMessageDialog(null, "ENTRE 1- Cadastrar Despesa \n ENTRE 2- Listar Despesa \n ENTRE 3- Buscar Despesa");
        int ops = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO"));

        if (ops == 1) {
            ManterDespesas.Cadastrar();
            // ManterDespesas.Buscar();
            // ManterDespesas.Alterar();
            // ManterDespesas.Listar();
            //ManterDespesas.Excluir();
        }
        if (ops == 2) {

            ManterDespesas.Listar();

        }
        if (ops == 3) {

            ManterDespesas.Buscar();

        }
       
}

}
    

