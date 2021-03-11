package com.softserve.edu.Project.MyWindow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dao_mssql extends dao_base
{
    private Connection  connection  = null;

    private  final  String   DATABASE_CREATE = "CREATE DATABASE %s ";
    private  final  String   DROP_DATABASE   = "DROP DATABASE %s"   ;
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public dao_mssql(){
        super ("com.microsoft.sqlserver.jdbc.SQLServerDriver");
    };
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    public void setURL (String host, String database, int port) {
        if (database.length() > 0)
        	this.url = String.format("jdbc:sqlserver://localhost\\SQLEXPRESS;databasename=DbPerson" );
            //this.url = String.format("jdbc:sqlserver://%s:%d;databaseName=%s;", host, port, database);
        else
            this.url = String.format("jdbc:sqlserver://%s:%d;", host, port);;
       System.out.println(this.url);     
    };
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    public Connection getConnection (){
        return (java.sql.Connection) connection;
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    public void Connect (String login, String password) {
        //super.Connect (login, password);
        try {
        	connection = DriverManager.getConnection(this.url, login, password);

            //connection = (SQLServerConnection) DriverManager.getConnection(this.url, properties);
            System.out.println("Ok");
        } catch (SQLException e) {
        	
            connection = null;
            System.out.println(e.getMessage()+" \nNo Ok");
        }		
    };
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    public boolean createSchema(final String schema) {
        return execSQL (String.format(DATABASE_CREATE, schema)); 
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    @Override
    public boolean dropSchema(final String schema) {
        return execSQL (String.format(DROP_DATABASE, schema)); 
    }
}
;
