package tarea2;

abstract class Invitado {
    protected String apellidos;
    protected String nombre;
    protected String correo;

    public Invitado(String apellidos, String nombre, String correo){
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public String toString(){
        return "Invitado " + this.apellidos + " " + this.nombre + ", correo: " + this.correo;
    }

    public String getNombre(){return this.nombre;}
}
