package tarea2;

/** Nota escrita asociada a una reunión */
class Nota {
    private String contenido;

    /**
     * Constructor de nota, requiere la existencia de una determinada reunión a pesar de no registrar ningún dato de esta
     * Además, necesita ser instanciada con su contenido
     * @param texto Texto que se quiere almacenar en la nota
     * @param reunion Reunión específica que debe existir para crear una nota
     */
    public Nota(String texto, Reunion reunion){
        this.contenido = texto;
    }

    /** toString personalizado
     * @return Contenido de la
     */
    @Override
    public String toString(){
        return "Nota: " + this.contenido;
    }
}
