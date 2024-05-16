/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.List;
/**
 *
 * @author Estudiante
 */
public class Medico {

    private String nombre;
    private String CPM;
    private List<String> especialidades;
    
    public String getTexto()
    {
        String especs = "";
        if(especialidades!=null)
        {
            for(String es: especialidades)
            {
                especs += ", "+es;
            }
        }
        
        return "Nombre: "+nombre + " CMP:" + CPM + " ESP: "+especs;
    }
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the CPM
     */
    public String getCPM() {
        return CPM;
    }

    /**
     * @param CPM the CPM to set
     */
    public void setCPM(String CPM) {
        this.CPM = CPM;
    }

    /**
     * @return the especialidades
     */
    public List<String> getEspecialidades() {
        return especialidades;
    }

    /**
     * @param especialidades the especialidades to set
     */
    public void setEspecialidades(List<String> especialidades) {
        this.especialidades = especialidades;
    }
}
