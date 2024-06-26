package procesos;

import datos.CanalTV;

public class VectorObjetos
{
    private CanalTV elementos[];
    private int conta;
            
    public VectorObjetos(int tamaño)
    {
        elementos = new CanalTV[tamaño];
        conta = 0;
    }
    
    public int getConta()   { return conta; }   

    public CanalTV getElemento(int pos) { return elementos[pos]; }

    public void adicionar(CanalTV dato)
    {
        elementos[conta] = dato;
        conta = conta + 1;
    }

    public int buscarPorNro(int dato)   // búsqueda iterativa
    {
        int i;

        for (i=0; i<conta; i=i+1)
            if (elementos[i].nro == dato)
                return i;
            
        return -1;
    }
    
    public int buscarPorNro(int i, int dato)    // búsqueda recursiva
    {
        if(i<0)
            return -1;
        else
            if(dato==elementos[i].nro)
                   return i;
                  else
                return buscarPorNro(i-1,dato);// porque llega a retornar un numero anterior      
        
    }
}

