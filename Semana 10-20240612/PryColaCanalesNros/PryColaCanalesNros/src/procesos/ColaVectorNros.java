
package procesos;

public class ColaVectorNros
{
    private double elemento[];
    private int frente, fiinal, n;
            
    public ColaVectorNros(int tam)
    {
        elemento = new double[tam];
        n = tam;

        frente = -1;
        fiinal = -1;
    }
    
    public int getFrente()  { return frente; }

    public int getFinal()   { return fiinal; }

    public double getElemento(int pos)  { return elemento[pos]; }

    public void adicionar(double dato)
    {
        if (frente == -1)
        {
            frente = 0;
            fiinal = 0;
        }
        else
            if (fiinal == n - 1)
                fiinal = 0;
            else
                fiinal = fiinal + 1;

        elemento[fiinal] = dato;
    }

    public double atender()
    {
        double aux;
        
        aux = elemento[frente];
                
        if (frente == fiinal)
        {
            frente = -1;
            fiinal = -1;
        }
        else
            if (frente == n - 1)
                frente = 0;
            else
                frente = frente + 1;
        
        return aux;
    }
}