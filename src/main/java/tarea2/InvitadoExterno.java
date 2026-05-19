package tarea2;

class InvitadoExterno implements Invitable {
    private String apellidos;
    private String nombre;
    private String correo;

    public InvitadoExterno(String apellidos, String nombre, String correo){
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.correo = correo;
    }

    @Override
    public void invitar() {}

    @Override
    public String toString(){
        return "Invitado no empleado " + this.apellidos + " " + this.nombre + ", correo: " + this.correo;
    }
}
