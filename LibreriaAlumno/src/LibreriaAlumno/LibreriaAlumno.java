package LibreriaAlumno;

public class LibreriaAlumno {
    String numeroControl, nombre, especialidad,semeste;

    public LibreriaAlumno(String numeroControl, String nombre, String especialidad, String semeste) {
        this.numeroControl = numeroControl;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.semeste = semeste;
    }

    public String getNumeroControl() {
        return numeroControl;
    }

    public void setNumeroControl(String numeroControl) {
        this.numeroControl = numeroControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSemeste() {
        return semeste;
    }

    public void setSemeste(String semeste) {
        this.semeste = semeste;
    }
}
