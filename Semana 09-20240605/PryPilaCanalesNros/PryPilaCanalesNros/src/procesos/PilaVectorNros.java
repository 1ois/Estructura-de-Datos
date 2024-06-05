
package procesos;

public class PilaVectorNros
{
    private double elemento[];
    private int cima;

    public PilaVectorNros(int tam)
    {
        elemento = new double[tam];
        cima = -1;
    }

    public int getCima()  { return cima;}

    public double getElemento(int pos) { return elemento[pos];}
    
    public void poner(double dato)
    {
        cima = cima + 1;
        elemento[cima] = dato;
    }

    public void sacar()
    {
        cima = cima - 1;
    }
}