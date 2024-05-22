
package procesos;

public class ListaSimpleCaracteres
{
    public Nodo inicio;
    private int contaEfi;
    public ListaSimpleCaracteres()
    {
        inicio = null;
    }
    
    public Nodo retornarUltimo()
    {
        Nodo p = inicio;
        
        while(p.sgte != null)
            p = p.sgte;
        
        return p;
    }
    
    public int getcontaEfi()
    {
        return contaEfi;
    }
    public Nodo retornarAnterior(Nodo q)
    {
        Nodo p = inicio;
        
        while(p.sgte != q)
            p = p.sgte;
        
        return p;
    }
    
    public void adicionar(String dato)
    {
        Nodo nuevo, ultimo;
        
        nuevo = new Nodo();
        nuevo.info = dato;
        nuevo.sgte = null;
        
        if(inicio == null)
            inicio = nuevo;
        else
        {
            ultimo = retornarUltimo();
            ultimo.sgte = nuevo;
        }
    }
    
    public Nodo buscar(String dato)
    {
        Nodo p = inicio;
        contaEfi=0;
        while(p != null)
        {
            contaEfi++;
            if(p.info.equals(dato))
                return p;
            
            p = p.sgte;
        }
        return null;
    }
    
    public void ordenar()
    {
            Nodo p, q;
        String tempo;
        contaEfi=0;
        p = inicio;
        while(p.sgte != null)
        {
           
            q = p.sgte;
            while(q != null)
            {
                if(p.info.compareTo(q.info)>0) //comparacion
                { contaEfi++;
                    tempo = p.info;
                    p.info = q.info;
                    q.info = tempo;
                }
                q = q.sgte;
            }
            p = p.sgte;
        }
    }
    
    public void insertarDespues(String dato, Nodo actual)
    {           
           Nodo nuevo;
            nuevo = new Nodo();
            nuevo.info=dato;
            nuevo.sgte= actual.sgte;
             actual.sgte=nuevo;
    }
    
    public void insertarAntes(String dato, Nodo actual)
    {
        Nodo nuevo,anterior;
        nuevo =new Nodo();
        nuevo.info=dato;
         nuevo.sgte=actual;
         anterior=retornarAnterior(actual);
         anterior.sgte=nuevo;
                
    }

  
}
