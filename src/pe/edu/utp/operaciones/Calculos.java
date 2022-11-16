/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.utp.operaciones;

import java.util.List;

/**
 *
 * @author admin
 * @param <T>
 */
public interface Calculos<T> {
    int create(T t);
    int update(T t);
    int delete(T t);
    T read(int id);
    List<T> readAll();
}
