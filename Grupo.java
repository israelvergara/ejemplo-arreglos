public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    //terminar este metodo de tarea
    public void incribir(Estudiante unEstudiante)
    {
        if(estudiantes[0] == null){
            estudiantes[0] = unEstudiante;
        }
    }
    
    public void darBaja(int claveEstudiante)
    {
        //busca el numero de clave
        // y poner null en el espacio encontrado osea la clave
    }
}