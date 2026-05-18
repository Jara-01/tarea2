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
}
