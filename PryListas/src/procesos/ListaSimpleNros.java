
package procesos;

public class ListaSimpleNros {
    public Nodo inicio;
    
    public ListaSimpleNros()
    {
        inicio=null;
        
    }
    
    public Nodo retornarUltimo()// Devuelve la direeccion de la memoria
                                //devielve la ultima direccion de la lista
    {
             Nodo p= inicio;
        
        
              while(p.sgte !=null)
                    p=p.sgte;
                
                return p;
    }
    
    public void adicionar(double dato){
        Nodo nuevo, ultimo;
        nuevo=new Nodo();
        nuevo.info= dato;
        nuevo.sgte=null;
        
        if(inicio==null)
            inicio= nuevo;
        else{
            // si la lista esta vacia inicio=nuevo
            ultimo =retornarUltimo();
            ultimo.sgte=nuevo;
        }
    
    }
}
