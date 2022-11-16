/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.utp.entidad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author admin
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    private int idproducto;
    private String nombre;
    private double precio;
    private int cantidad;
}
