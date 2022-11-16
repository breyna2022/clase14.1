package pe.edu.utp.dao;

import com.mysql.cj.protocol.Resultset;
import java.util.List;
import pe.edu.utp.entidad.Producto;
import pe.edu.utp.operaciones.Calculos;
import java.sql.*;

/**
 *
 * @author admin
 */
public class ProductoDao implements Calculos<Producto>{
    private PreparedStatement ps;
    private Resultset rs;
    private Connection cx;

    @Override
    public int create(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int update(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(Producto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto read(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Producto> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
