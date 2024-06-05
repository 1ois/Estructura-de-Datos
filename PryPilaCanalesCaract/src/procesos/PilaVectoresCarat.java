
package procesos;

public class PilaVectoresCarat 
    

{
    private String elemento[];
    private int cima;

    public PilaVectoresCarat(int tam)
    {
        elemento = new String[tam];
        cima = -1;
    }

    public int getCima()  { return cima;}

    public String getElemento(int pos) { return elemento[pos];}
    
    public void poner(String dato)
    {
        cima = cima + 1;
        elemento[cima] = dato;
    }

    public void sacar()
    {
        cima = cima - 1;
    }
}