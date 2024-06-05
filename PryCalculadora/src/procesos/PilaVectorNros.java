
package procesos;

public class PilaVectorNros
{
    private double elemento[];
    private int cima;

    public PilaVectorNros(int tamaño)
    {
        elemento = new double[tamaño];
        cima = -1;
    }

    public void poner(double dato)
    {
        cima = cima + 1;
        elemento[cima] = dato;
    }

    public double sacar()
    {
        double aux;
            
        aux = elemento[cima];
        cima = cima - 1;

        return aux;
    }
}
