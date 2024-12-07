package com.ecodeup.jdbc;


import java.sql.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esto es un mensaje nuevo");
        ConexionBD conexion = new ConexionBD();
        conexion.consultarTablas();
    }
}