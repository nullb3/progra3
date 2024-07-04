package com.clase9.clase9practica;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {


    @Autowired
    private JdbcTemplate jdbcTemplate;

     public List<Producto> getAllProducts() {
        try {
            // Replace 'app_log' with your actual table name and adjust the query as needed
            String query = "SELECT * FROM test.productos";
            List<Map<String, Object>> resultProducts = jdbcTemplate.queryForList(query);
            List<Producto> productos = new ArrayList<>();

            for (Map<String, Object> row : resultProducts) {
                int id_producto = (int) row.get("id_producto");
                String nombre_producto = (String) row.get("nombre_producto");
    
                String descripcion_producto = (String) row.get("descripcion_producto");

                Producto producto = new Producto(id_producto, nombre_producto, descripcion_producto);
                productos.add(producto);
            }
            return productos;
        } catch (Exception e) {
            // Handle exceptions if needed
            e.printStackTrace();
            return null;
        }
    }

     public User authenticateUser(String username, String password) {
        System.out.println("logId = " + username);
        try {
            String query = "SELECT * FROM test.Users WHERE Username = ? and Password =?";

            return jdbcTemplate.queryForObject(query, (rs, rowNum) -> {
                int userID = (int)rs.getInt("UserID");
                String user_name = rs.getString("Username");
                String user_password = rs.getString("Password");
                String email = rs.getString("Email");
              //   public User( String username,String email, String password) {
        
                return new User(userID, user_name,email, user_password);
            }, username, password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Producto getProducto(int id) {
        System.out.println("logId = " + id);
        try {
            String query = "SELECT * FROM test.productos WHERE id_producto = ?";

            return jdbcTemplate.queryForObject(query, (rs, rowNum) -> {
                int id_producto = (int)rs.getInt("id_producto");
                String nombre_producto = rs.getString("nombre_producto");
                String descripcion_producto = rs.getString("descripcion_producto");
              
                return new Producto(id_producto, nombre_producto, descripcion_producto);
            }, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void updateProducto(Producto producto) {
        try {
            String query = "UPDATE test.productos SET nombre_producto = ?, descripcion_producto = ? WHERE id_producto = ?";
            jdbcTemplate.update(query, producto.getNombre_producto(),producto.getDescripcion_producto() , producto.getId_producto());
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions if needed
        }
    }
    public void insertProducto(Producto producto) {
        try {
            String query = "INSERT test.productos SET nombre_producto = ?, descripcion_producto = ? ";
            jdbcTemplate.update(query, producto.getNombre_producto(),producto.getDescripcion_producto());
        } catch (Exception e) {
            e.printStackTrace();
            // Handle exceptions if needed
        }
    }

    public int deleteProducto(int id) {
        try {
            String query = "DELETE FROM test.productos WHERE id_producto = ?";
            jdbcTemplate.update(query, id);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
            // Handle exceptions if needed
        }
    }

    
}