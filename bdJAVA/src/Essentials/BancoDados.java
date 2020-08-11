package Essentials;

import javafx.collections.FXCollections;


import java.sql.*;
import java.util.List;

public class BancoDados {



    public static void save(Produtos p){
        PreparedStatement stmt = null;
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Product.db");

            String sql = "INSERT INTO product (code, name, price , quantity) values (?,?,?,?)";
            stmt = conn.prepareStatement(sql);

            stmt.setLong(1, p.getCode());
            stmt.setString(2, p.getName());
            stmt.setDouble(3, p.getVal());
            stmt.setInt(4, p.getQuant());

            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(conn != null) {
                try {conn.close();}
                catch (SQLException e) { e.printStackTrace();}
            }
            if(stmt != null) {
                try {stmt.close();}
                catch (SQLException e) { e.printStackTrace();}
            }
        }
    }

    public static List<Produtos> leitura(){
        PreparedStatement stmt = null;
        Connection conn = null;
        List<Produtos> produtosBase;
        produtosBase = FXCollections.observableArrayList();
        String sql = "SELECT * FROM product";
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:Product.db");
            stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();


            while (rs.next()){

                if(!rs.isClosed()){
                    produtosBase.add(new Produtos(rs.getString("name"), rs.getInt("quantity"),rs.getDouble("price"),rs.getLong("code")));
                }

            };


        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            if(conn != null) {
                try {conn.close();}
                catch (SQLException e) { e.printStackTrace();}
            }
            if(stmt != null) {
                try {stmt.close();}
                catch (SQLException e) { e.printStackTrace();}
            }
        }

        return produtosBase;
    }

    public static void update(Produtos p,Produtos b){
        String sql = "UPDATE product SET name = ?, quantity = ?, price = ? WHERE code = ?";
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:Product.db");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getName());
            stmt.setInt(2, p.getQuant());
            stmt.setDouble(3, p.getVal());
            stmt.setLong(4, b.getCode());
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(long pKey){
        String sql = "DELETE FROM product WHERE code = ?" ;
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:Product.db");
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setLong(1, pKey);
            stmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
