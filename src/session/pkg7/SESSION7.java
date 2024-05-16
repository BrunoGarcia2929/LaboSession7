/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package session.pkg7;

import Entidades.Cita;
import Entidades.Medico;
import Entidades.Paciente;
import Pantallas.PantallaListarCita;
import Pantallas.PantallaListarMedico;
import Pantallas.PantallaListarPaciente;
import Pantallas.PantallaNuevaCita;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class SESSION7 {

    public static List<Cita> citasGlobal = new ArrayList<>();
    public static List<Medico> medicosGlobal = new ArrayList<>();
    public static List<Paciente> pacientesGlobal = new ArrayList<>();

    public static void main(String[] args) {

        PantallaListarCita pantalla = new PantallaListarCita();
        pantalla.setVisible(true);
    }

}
