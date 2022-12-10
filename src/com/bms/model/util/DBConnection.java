/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Shabina
 */
public class DBConnection {
    
    
    public DBConnection(){
        
    }
    
    public ResultSet runSelect(JPanel cards,String query, ArrayList<Object> params, JPanel panel){
        ResultSet result=null;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/public_schema",
              "root", "admin");
            PreparedStatement st = (PreparedStatement) connection
                                        .prepareStatement(query,    ResultSet.TYPE_SCROLL_INSENSITIVE, 
                                                                            ResultSet.CONCUR_READ_ONLY);
            int i=1;
            for( Object p : params){
                st.setString(i, p.toString());
                i=i+1;
            }
            System.out.println("Running query:");
            System.out.println(st.toString());
            result = st.executeQuery();
            if (result.first()) {
                //do nothing
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return result;
    }
    
    public boolean runInsert(JPanel cards,String query, ArrayList<Object> params){
        boolean flag = false;
        try {
            Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/public_schema",
              "root", "admin");
            PreparedStatement st = (PreparedStatement) connection
            .prepareStatement(query);
            st.setString(1, params.get(0).toString());
            st.setString(2, params.get(1).toString());
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return flag;
    }
    
    public ResultSet testFunctionQuery(String query){
        ResultSet result = null;
        try{
            String myConnectionString = "jdbc:mysql://localhost:3306?" + "useUnicode=yes&characterEncoding=UTF-8";
            Connection conn = DriverManager.getConnection(myConnectionString, "root", "admin");
            Statement stmt = conn.createStatement();
            stmt.execute("SHOW DATABASES");
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getString(1));
                result=rs;
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return result;
    }
}