
package procesos;

public class VectorCaracteres
{
    private String elementos[];
    private int conta;
    
    public VectorCaracteres(int tamaño)
    {
        conta = 0;
        elementos = new String[tamaño];
    }
    
    public int getConta()               { return conta; }
    
    public String getElemento(int pos)  { return elementos[pos]; }
    
    public void adicionar(String dato)
    {
        elementos[conta] = dato;
        conta = conta + 1;
    }
    
    public int buscarBinaria(String dato)
    {
        int limInf, limSup, medio;

        ordenar();   // Requisito

        limInf = 0;
        limSup = conta - 1;

        do
        {
            medio = (limInf + limSup) / 2;

            if (dato.equals(elementos[medio]))
                return medio;

            if (dato.compareTo(elementos[medio]) < 0)
                limSup = medio - 1;
            else
                limInf = medio + 1;
        }
        while(limInf <= limSup);

        return -1;
    }
    
    public void ordenar()
    {
        // implementar
    }
    
    public void insertar(String dato, int pos)
    {
        // implementar
    }
}
