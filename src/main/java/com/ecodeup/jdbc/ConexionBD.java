package com.ecodeup.jdbc;

import java.sql.*;

public class ConexionBD {

    public static void consultarTablas () {
        String url = "jdbc:mysql://localhost:3306/octobereats?serverTimezone=UTC";
        String username = "root";
        String password = "Daniel22";


        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            System.out.println("Tabla USUARIOS: ");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM USUARIOS");


            while (resultSet.next()) {
                System.out.println(resultSet.getString("id") + " | " +
                        resultSet.getString("nombre") + " | " +
                        resultSet.getString("correo") + " | " +
                        resultSet.getString("contraseña") + " | " +
                        resultSet.getString("area"));

            }
            resultSet.close();

            System.out.println("\nTAbla RESTAURANTES");

            resultSet = statement.executeQuery("SELECT * FROM RESTAURANTES");

            while (resultSet.next()) {

                System.out.println(resultSet.getString("id") + " | " +
                        resultSet.getString("nombre") + " | " +
                        resultSet.getString("direccion") + " | " +
                        resultSet.getString("estado"));

            }
            resultSet.close();

            System.out.println("\nTabla MENU");
            resultSet = statement.executeQuery("SELECT * FROM MENU");

            while (resultSet.next()) {

                System.out.println(resultSet.getString("id") + " | " +
                        resultSet.getString("nombre") + " | " +
                        resultSet.getString("precio"));
            }
            resultSet.close();

            System.out.println("\nTabla PEDIDOS");
            resultSet = statement.executeQuery("SELECT * FROM PEDIDOS");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("idUsuario") + " | " +
                        resultSet.getString("idRestaurante") + " | " +
                        resultSet.getString("estado") + " | " +
                        resultSet.getString("totalPedido"));
            }
            resultSet.close();

            System.out.println("\nTabla OBJETOS PEDIDO");
            resultSet = statement.executeQuery("SELECT * FROM OBJETOSPEDIDO");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("idPedido") + " | " +
                        resultSet.getString("idObjetoMenu") + " | " +
                        resultSet.getString("cantidadObjetos"));
            }
            resultSet.close();
            connection.close();
            statement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}






