
package procesos;

import datos.CanalTV;

public class ArbolObjetos
{
    private Nodo raiz;
    
    public ArbolObjetos()
    {
        raiz = null;
    }
    
    public Nodo getRaiz()
    {
        return raiz;
    }
    
    public void insertar(CanalTV dato)
    {
        Nodo nuevo, actual, padre = null;

        nuevo = new Nodo();
            
        nuevo.info = dato;
        nuevo.izq  = null;
        nuevo.der  = null;

        if (raiz == null)
            raiz = nuevo;
        else
        {
            actual = raiz;
            while (actual != null)
            {
                padre = actual;
                if (dato.nro < actual.info.nro)
                    actual = actual.izq;
                else
                    actual = actual.der;
            }
            
            if (dato.nro < padre.info.nro)
                padre.izq = nuevo;
            else
                padre.der = nuevo;
        }
    }
}
