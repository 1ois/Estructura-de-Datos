
package procesos;

public class ArbolCaracteres
{
    private Nodo raiz;
    private int contaEfi;
    
    public ArbolCaracteres()
    {
        raiz = null;
    }
    public int getContaEfi(){
        return contaEfi;
    }
    
    public Nodo getRaiz()
    {
        return raiz;
    }
    
    public void insertar(String dato)
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
                if (dato.compareTo(actual.info) < 0)// esto signific amenor  en intancia de String
                    actual = actual.izq;
                else
                    actual = actual.der;
            }
            
            if (dato.compareTo(padre.info) < 0)
                padre.izq = nuevo;
            else
                padre.der = nuevo;
        }
    }
    
    public Nodo buscar(String dato)
    {
       //  contaEfi=0;
        Nodo p = raiz;
        
        while(p != null)
        { 
             // contaEfi++;
            if(dato.equals( p.info))
                return p;
         
            else
                if(dato.compareTo( p.info)<0)
                    p = p.izq;
                else
                    p = p.der;
                }
        return null;
    }
    
    public int contarNodos(Nodo p)
    {
        
        if(p==null)
            return 0;
            else
                return 1+ contarNodos(p.izq)+contarNodos(p.der);
        
        
   
    }
    
    public int contarHojas(Nodo p)
    {
        if(p ==null)
            return 0;
        else
            if()
          // borrar esta instrucción
    }    
}
