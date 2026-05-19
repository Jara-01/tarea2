package tarea2;

/** ENUM para representar los 3 tipos de reuniones posibles */
public enum tipoReunion {
    TECNICA(0),
    MARKETING(1),
    OTRO(2);
    
    private int tipo;

    tipoReunion(int tipo) {
        this.tipo = tipo;
    }
}
