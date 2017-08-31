/**
 * clase que crea un estudiante con variables de instancia que son su nombre y clave las cuales se 
 * inicualizan en el constructor y se les asignan alores qeu introduce el usuario
 * con
 */
public class Estudiante
{
    private String nombre;
    private int clave;
    
    /**
     * Constructor inicializa variables de instacia con los valores que otorga el usuario.
     */
    public Estudiante(int claveIni, String nombreIni)
    {
        nombre = nombreIni;
        clave = claveIni;
    }
    
    /**
     * regresa detalles del estudiante
     * @return regresa clave y nombre del estudiante.
     */
    public String dimeDetalles()
    {
        return "Clave: " +clave+ "Nombre: " +nombre;
    }
    
    /**
     * regresa la clave del estudiante
     * @ return regresa la clave del estudiante.
     */
    public int getClave()
    {
        return clave;
    }
    
    /**
     * regresa el nombre del estudiante
     * @ return regresa el nombre del estudiante.
     */
    public String getNombre()
    {
        return nombre;
    }
}