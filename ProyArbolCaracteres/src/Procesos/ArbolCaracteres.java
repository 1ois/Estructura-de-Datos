
package Procesos;


public class ArbolCaracteres {
    
      private Nodos raiz;
    public ArbolCaracteres()
    {raiz = null;}
   
    public void insertar(String dato)
    {
        Nodos nuevo, actual, padre = null;

        nuevo = new Nodos();
            
        nuevo.info = dato;
        nuevo.izq  = null;
        nuevo.der  = null;
        
        //si un  no hay raicez
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
    public Nodos buscar(String dato){
    Nodos actual=raiz;
    //Mientras  que  p sea diferetne que null
    while (actual!=null){
        if(dato.equals(actual.info)){
        
            return actual;
        }
        else
            if(dato<raiz.info)
                actual=actual.izq;
        else
                actual=actual.der;
         }
            
            return null;
    }
}
