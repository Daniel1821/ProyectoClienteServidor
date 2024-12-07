package com.ecodeup.jdbc;


import java.sql.*;

public class Main {
    public static void main(String[] args) {
        ConexionBD conexion = new ConexionBD();
        conexion.consultarTablas();
    }
}