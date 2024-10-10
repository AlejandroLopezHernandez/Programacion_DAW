/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PatronDAO;

/**
 *
 * @author alejandrolopezhernandez
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

/**
 *
 * @author Gustavo
 */
public interface IAlumnoDAO {
    
    public Alumno crear(int id,String nombre,double nota);
    public void almacenar(Alumno alumno);
    public List<Alumno> seleccionar(double nota);
    public Alumno seleccionar(int id);
    
    
}
