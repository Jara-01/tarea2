package tarea2;

/** Clase abstracta para los tipos de individuos a los que se pueden invitar */
abstract class Invitado {
    protected String apellidos;
    protected String nombres;
    protected String correo;

    /** Constructor que guarda los datos personales comúnes necesarios del individuo
     * @param apellidos Apellidos del empleado.
     * @param nombres Nombres del empleado.
     * @param correo Dirección de correo electrónico del empleado.
     */
    public Invitado(String apellidos, String nombres, String correo){
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.correo = correo;
    }

    /**
     * toString personalizado
     * @return Datos de invitado y el ID del empleado.
     */
    @Override
    public String toString(){
        return this.apellidos + " " + this.nombres + ", correo: " + this.correo;
    }

    /** Getter de correo electrónico.
     * @return Correo electrónico del individuo.*/
    public String getCorreo(){return this.correo;}
}
