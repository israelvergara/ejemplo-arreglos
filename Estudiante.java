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
}