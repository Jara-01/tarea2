package tarea2;

class Nota {
    private String contenido;

    public Nota(String texto){
        this.contenido = texto;
    }

    @Override
    public String toString(){
        return "Nota: " + this.contenido;
    }
}
