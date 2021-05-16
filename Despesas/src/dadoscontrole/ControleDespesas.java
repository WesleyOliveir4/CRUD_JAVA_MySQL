/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadoscontrole;

import dadosbean.Despesas;
import dadosdao.DaoDespesas;
import java.sql.SQLException;
import java.util.List;


/**
 *
 * @author wesley
 */
public class ControleDespesas {
     static DaoDespesas daoD;
    
    public ControleDespesas() throws SQLException, ClassNotFoundException {
        daoD = new DaoDespesas();
    }

    public Despesas inserir(Despesas cEntrada) throws SQLException {
        return daoD.inserir(cEntrada);
    }

    public List<Despesas> listar(Despesas cEntrada) throws SQLException {
        return daoD.listar(cEntrada);
    }

    public Despesas alterar(Despesas cEntrada) throws SQLException {
        return daoD.alterar(cEntrada);
    }
    
     public Despesas validar(Despesas cEntrada) throws SQLException {
        return daoD.alterar(cEntrada);
    }

    public Despesas buscar(Despesas sEntrada) throws SQLException {
        return daoD.buscar(sEntrada);
    }

    public Despesas excluir(Despesas cEntrada) throws SQLException {
        return daoD.excluir(cEntrada);
    }
    
  
}
