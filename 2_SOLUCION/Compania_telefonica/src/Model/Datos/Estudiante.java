package Model.Datos;

public class Estudiante {
    private String nombre;
    private String id_Estudiante;
    private Carrera carrera;
    private Celular celular;

    public Estudiante(String nombre, String id_Estudiante, Carrera carrera, Celular celular) {
        this.nombre = nombre;
        this.id_Estudiante = id_Estudiante;
        this.carrera = carrera;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId_Estudiante() {
        return id_Estudiante;
    }

    public void setId_Estudiante(String id_Estudiante) {
        this.id_Estudiante = id_Estudiante;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }
}
