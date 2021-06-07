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
        int ops = 0;
        while(ops < 6){
        JOptionPane.showMessageDialog(null, "ENTRE 1- Cadastrar Despesa \n ENTRE 2- Listar Despesa \n ENTRE 3- Buscar Despesa \n ENTRE 4- Total de gastos \n ENTRE 5- Excluir gasto \n ENTRE 6- Sair");
        ops = Integer.parseInt(JOptionPane.showInputDialog("OPÇÃO"));

        switch(ops){
    case 1 :
        ManterDespesas.Cadastrar();
        
        break;
    
    case 2:
        ManterDespesas.Listar();
        break;
    
    case 3 :
        ManterDespesas.Buscar();
        break;
    
    case 4 :
         ManterDespesas.Somar();
        break;
    
    case 5 :
          ManterDespesas.Excluir();
        break;
        
    case 6 :
         
        break;
   
}

        }
    
   

}
}
    

