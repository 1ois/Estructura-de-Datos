
package procesos;

public class ArbolNros
{
    private Nodo raiz;
    private int contaEfi;
    public ArbolNros()
    {
        raiz = null;
        
    }
    
    public Nodo getRaiz()
    {
        return raiz;
    }
    public int getContaEfi( ){
        return contaEfi;
    }
            
    public void insertar(double dato)
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
                if (dato < actual.info)
                    actual = actual.izq;
                else
                    actual = actual.der;
            }
            
            if (dato < padre.info)
                padre.izq = nuevo;
            else
                padre.der = nuevo;
        }
    }
    
    public Nodo buscar(double dato)
    {
        contaEfi=0;
        Nodo p = raiz;
        
        while(p != null)
        { 
              contaEfi++;
            if(dato == p.info)
                return p;
         
            else
                if(dato < p.info)
                    p = p.izq;
                else
                    p = p.der;
       
        }
        return null;
    }
    
    public int determinarNroDeHijos(Nodo p)
    {
        // implementar
        if(p.izq !=null && p.der != null)
            return 2;
        else
            if(p.izq==null &&  p.der==null)
                return 0;
            else
                return 1;
                
    }
}