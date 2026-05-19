package tarea2;

class Empleado implements Invitable {
    private String id;
    private String apellidos;
    private String nombre;
    private String correo;

    public Empleado(String id, String apellidos, String nombre, String correo){
        this.id = id;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public void invitar(Invitacion invitacion) {System.out.println("Empleado " + this.correo + " invitado.");}

    @Override
    public String toString(){
        return "Empleado " + this.apellidos + " " + this.nombre + ". ID: " + this.id + ", correo: " + this.correo;
    }

    public String getNombre(){return this.nombre;}
}
