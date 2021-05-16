/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author wesley
 */
public class ConexaoDb {
     public Connection getConnection() throws SQLException, ClassNotFoundException {
        try {
            String driverName = "com.mysql.cj.jdbc.Driver";
            String parametros = "?useTimezone=true&serverTimezone=UTC";
            String serverName = "localhost";    //caminho do servidor do BD
            String mydatabase ="ProjetoDespesas";        //nome do seu banco de dados
            String username = "root";        //nome de um usuário de seu BD
            String password = "admin";      //sua senha de acesso
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + parametros;
            Class.forName(driverName);
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
