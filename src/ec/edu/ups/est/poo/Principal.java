package ec.edu.ups.est.poo;

import ec.edu.ups.est.poo.enums.TipoDireccion;
import ec.edu.ups.est.poo.enums.TipoRol;
import ec.edu.ups.est.poo.rol.Administrativo;
import ec.edu.ups.est.poo.rol.Estudiante;
import ec.edu.ups.est.poo.rol.Profesor;
import ec.edu.ups.est.poo.rol.Visitante;

import java.util.Arrays;
import java.util.GregorianCalendar;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        // Crear Institución 1
        Institucion institucion1 = new Institucion();
        institucion1.setId(1);
        institucion1.setNombre("Politécnica Salesiana");
        List<String> sedes = Arrays.asList("Cuenca", "Guayaquil", "Quito");
        institucion1.setSedes(sedes);
        GregorianCalendar fechaInicio = new GregorianCalendar(1980, 6, 12);
        institucion1.setFechaInicio(fechaInicio);
        institucion1.addDireccion(TipoDireccion.INSTITUCION, "Ecuador", "Azuay", "Cuenca", "Lamar", "Segundo", "18-29");

        // Crear personas (Estudiante y Profesor para Institución 1)
        Estudiante estudiante = new Estudiante();
        estudiante.setCarrera("Computación");
        estudiante.setCedula("0107591752");
        estudiante.setNombre("Juan Pablo");
        estudiante.setApellido("Ortiz Torres");
        estudiante.setCorreo("jortizt7@est.ups.edu.ec");
        estudiante.setTelefono("0998120501");
        estudiante.addDireccion(new Direccion(TipoDireccion.CASA, "Ecuador", "Azuay", "Cuenca", "Av. de las Américas", "Universitaria", "1234"));

        Profesor profesor = new Profesor();
        profesor.setCedula("0103527966");
        profesor.setNombre("Carlos");
        profesor.setApellido("Pérez");
        profesor.setCorreo("cperez@ups.edu.ec");
        profesor.setTelefono("0998222333");
        profesor.addDireccion(new Direccion(TipoDireccion.INSTITUCION, "Ecuador", "Azuay", "Cuenca", "Av. de las Américas", "UPS", "1234"));

        // Asignar personas a la Institución 1
        institucion1.addAsignacion(new Asignacion(estudiante, new GregorianCalendar(2022, 8, 1), TipoRol.ESTUDIANTE));
        institucion1.addAsignacion(new Asignacion(profesor, new GregorianCalendar(2020, 2, 15), TipoRol.DOCENTE));

        // Crear Institución 2
        Institucion institucion2 = new Institucion();
        institucion2.setId(2);
        institucion2.setNombre("Universidad de Cuenca");
        institucion2.setSedes(Arrays.asList("Cuenca"));
        institucion2.setFechaInicio(new GregorianCalendar(1960, 5, 22));
        institucion2.addDireccion(TipoDireccion.INSTITUCION, "Ecuador", "Azuay", "Cuenca", "Av. de las Américas", "Luz", "9876");

        // Crear personas (Administrativo y Visitante para Institución 2)
        Administrativo administrativo = new Administrativo();
        administrativo.setCedula("0123456789");
        administrativo.setNombre("Pedro");
        administrativo.setApellido("García");
        administrativo.setCorreo("pgarcia@cuenca.edu.ec");
        administrativo.setTelefono("0997889988");
        administrativo.addDireccion(new Direccion(TipoDireccion.CASA, "Ecuador", "Azuay", "Cuenca", "Calle 12", "Calle 5", "5678"));

        Visitante visitante = new Visitante();
        visitante.setCedula("0123456790");
        visitante.setNombre("Ana");
        visitante.setApellido("Sánchez");
        visitante.setCorreo("asanchez@cuenca.edu.ec");
        visitante.setTelefono("0997889989");
        visitante.setMotivoVisita("Investigación");
        visitante.setFechaEntrada(new GregorianCalendar(2025, 3, 15));
        visitante.setFechaSalida(new GregorianCalendar(2025, 3, 18));
        visitante.addDireccion(new Direccion(TipoDireccion.CASA, "Ecuador", "Azuay", "Cuenca", "Calle Central", "Calle 10", "9875"));

        // Asignar personas a la Institución 2
        institucion2.addAsignacion(new Asignacion(administrativo, new GregorianCalendar(2020, 4, 1), TipoRol.ADMINISTRATIVO));
        institucion2.addAsignacion(new Asignacion(visitante, new GregorianCalendar(2025, 3, 15), TipoRol.VISITANTE));

        // Imprimir las instituciones y personas asignadas
        System.out.println("Institución 1:");
        System.out.println(institucion1);
        System.out.println("\nInstitución 2:");
        System.out.println(institucion2);
    }
}

