
package procesos;

public class PilaVectorCaracteres
{
    private String elemento[];
    private int cima;

    public PilaVectorCaracteres(int tamaño)
    {
        elemento = new String[tamaño];
        cima = -1;
    }

    public void poner(String dato)
    {
        cima = cima + 1;
        elemento[cima] = dato;
    }

    public String sacar()
    {
        String aux;
            
        aux = elemento[cima];
        cima = cima - 1;

        return aux;
    }
    
    public String getElementoCima()
    {
        return elemento[cima];
    }
    
    public boolean estaVacia()
    {
        return (cima == -1);
    }
}
