/**
 * clase que permite crear un objeto grupo la cual permite inscribir y dar de 
 * baja un estudiante tambien permite buscarlo por su clave y su nombre
 */
public class Grupo
{
    private String nomMateria;
    private Estudiante[] estudiantes;
    
    /**
     * Consturctor donde se inicalizan variables  y arreglos.
     */
    public Grupo(int totalEstudiantes, String nomMateria)
    {
        estudiantes = new Estudiante[totalEstudiantes];
        this.nomMateria = nomMateria;
    }
    
    /**
     * Busca un estudiante por medio de su clave.
     * @param ClaveEstudiante Parametro que representa la clave del estudiante a buscar
     * @return Regresa la posicion del estudiante en el arreglo . -1 si no existe.
     */
    private int buscarEstudiante(int claveEstudiante)
    {
        for(int i=0; i < estudiantes.length ; i++)
        {
            if(estudiantes[i] != null){
                if(estudiantes[i].getClave() == claveEstudiante)
                {
                    return i;
                }
            }
        }
        return -1;
    }    
    
    /**
     * Busca un estudiante por medio de su nombre.
     * @param nombreEstudiante Parametro que representa el nombre del estudiante a buscar
     * @return Regresa la posicion del estudiante en el arreglo . -1 si no existe.
     */
    public int buscarEstudiante(String nombreEstudiante)
    {
        for(int i=0; i < estudiantes.length; i++)
        {
            if(estudiantes[i] != null){
                if(estudiantes[i].getNombre() == nombreEstudiante)
                {
                    return i;
                }
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
     * @return Regresa verdadero si el estudiante fue inscrito o falso en caso 
     * de que el estudiante no se pudiera inscribir.
     */
    public boolean inscribir(Estudiante unEstudiante)
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
    
    /**
     * Da de baja un estudiante por medio de su clave
     * @param claveEstudiante es la variable que recibe la clave a dar de baja.
     * @return Regresa verdadero si el estudiante se pudo dar de baja y 
     * falso si no se pudo dar de baja.
     */
    public boolean darBaja(int claveEstudiante)
    {
        int dimePosicion = this.buscaEspacioDisponible();
        if(dimePosicion != -1)
        {
            estudiantes[dimePosicion] = null;
            return true; // el arreglo esta vacio o no econtro al estudiante
        }
        return false;
    }
   
    /**
     * Da de baja un estudiante por medio de su nombre
     * @param nombreEstudiante es la variable que recibe el a dar de baja.
     * @return Regresa verdadero si el estudiante se pudo dar de baja y 
     * falso si no se pudo dar de baja.
     */
    public boolean darBaja(String nombreEstudiante)
    {
        int dimePosicion = this.buscaEspacioDisponible();
        if(dimePosicion != -1)
            {
                estudiantes[dimePosicion] = null;
                return true;
            }
        return false;
    }
}
