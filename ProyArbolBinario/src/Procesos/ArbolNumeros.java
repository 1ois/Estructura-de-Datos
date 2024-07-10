
package Procesos;


public class ArbolNumeros {
    public Nodo raiz;
//    inicializamos  
    public ArbolNumeros(){raiz = null;}
       
    public void insertar(double dato)
    {
        Nodo nuevo, actual, padre = null;

        nuevo = new Nodo();
            
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
    public Nodo buscar(double dato){
    Nodo actual=raiz;
    //Mientras  que  p sea diferetne que null
    while (actual!=null){
        if(dato==actual.info){
        
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
