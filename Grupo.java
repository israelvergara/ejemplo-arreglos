public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param CalveEstudiante Parametro que representa la clave del estudiante a buscar
     * @return Regresa la posicion del estudiante en el arreglo . -1 si no existe.
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0; i < estudiantes.length ; i++)
        {
            if(estudiantes[i].getClave() == claveEstudiante)
            {
                return i;
            }
        }
        return -1;
    }    
    
    /**
     * Busca un espacion disponible en el arreglo para guardar un estudiante
     * @return Regresa la primer posicion nula dentro del arreglo
     */
    private int buscaEspacioDisponible()
    {
        for(int i=0; i < estudiantes.length ; i++)
        {
            if(estudiantes[i] == null)
            {
                return i;
            }
            
        }
        return -1;
    }
    
    /**
     * Inscribe un estudiante nuevo en el grupo.
     * @param unEstudiante Es el objeto estudiante a inscribir en el grupo.
     * @return regrera verdadero si el estudiante fue inscrito o falso en caso 
     * de que el estudiante no se pudiera inscribir.
     */
    public boolean incribir(Estudiante unEstudiante)
    {
        int existe = this.buscarEstudiante(unEstudiante.getClave());
        if(existe != -1)
        { 
            return false; //estudiante ya inscrito
        }
        int posDisponible = this.buscaEspacioDisponible();
        if(posDisponible == -1)
        {
            return false; // el arreglo está lleno
        }
        estudiantes[posDisponible] = unEstudiante; // inscribe el estudiante
        return true;// el estudiante fue inscrito
    }
    
    public void darBaja(int claveEstudiante)
    {
        //busca el numero de clave
        
        for(int i=0; i < estudiantes.length; i++){
            if(claveEstudiante == estudiantes[i].getClave())
            {
                estudiantes[i] = null;
                break;
            }
            else{
                System.out.println("La clave no se encuentra");
            }
        }
        // y poner null en el espacio encontrado osea la clave
    }
}