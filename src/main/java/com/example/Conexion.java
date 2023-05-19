package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/Productos";
        String user = "root";
        String password = "1234";
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url, user, password);
            System.out.println("La conexión se realizó satisfactoriamente" +url);
            Statement st = conexion.createStatement();
            //String insertar = "Insert into Productos(id, codigo, nombre, precio, cantidad) values (8, '0000', 'Platanitos', 4500, 12);";
            //st.execute(insertar);
            //String leer = "Select * from Productos";
            //st.execute(leer);
            //String actualizar = "Update Productos set id=10 where id = 1;";
            //st.execute(actualizar);
            String eliminar = "Delete from Productos where codigo= '0000'";
            st.execute(eliminar);

        } catch (ClassNotFoundException e) {
           e.printStackTrace();
        }

    }
}
