
package procesos;

public class ListaSimpleNros
{
    public Nodo inicio;
    
    public ListaSimpleNros()
    {
        inicio = null;
    }

    public Nodo retornarUltimo() //devuelve la dirrecion de memoria del ultimo elemento dela lista
    {
        Nodo p = inicio;

        while (p.sgte != null)
            p = p.sgte;

        return p;
    }
    public Nodo retornarAnterior (Nodo q)   //devuelve la direccion de memoria del elemento anterior a "q"
    {
        Nodo p=inicio;
        while(p.sgte != q)
     
            p=p.sgte;
        
        return p;
    }

    public void adicionar(double dato)
    {
        Nodo nuevo, ultimo;
        nuevo = new Nodo();

        nuevo.info = dato;
        nuevo.sgte = null;

        if (inicio == null)
            inicio = nuevo;
        else
        {
            ultimo = retornarUltimo();
            ultimo.sgte = nuevo;
        }
    }

    public void eliminar(Nodo actual)
            
    {
        Nodo anterior;
        if (inicio==actual)
            inicio=inicio.sgte;
        else{
            anterior=retornarAnterior(actual);
            anterior.sgte=actual.sgte;
        }
        
    }
    public int contar()
    {
        int conta = 0;
        Nodo p = inicio;

        while (p != null)
        {
            conta = conta + 1;
            p = p.sgte;
        }
        return conta;
    }

    public Nodo buscar(double dato)
    {
        Nodo p = inicio;

        while (p != null)
        {
            if (p.info == dato)
                return p;

            p = p.sgte;
        }
        return null;
    }
}
