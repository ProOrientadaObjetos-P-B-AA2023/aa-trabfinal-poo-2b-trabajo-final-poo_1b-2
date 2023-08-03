package Model.Datos;

public class Estudiante {
    private String nombre;
    private String dc_identidad;
    private Carrera carrera;
    private Celular celular;

    public Estudiante(String nombre, String dc_identidad, Carrera carrera) {
        this.nombre = nombre;
        this.dc_identidad = dc_identidad;
        this.carrera = carrera;
    }

}
