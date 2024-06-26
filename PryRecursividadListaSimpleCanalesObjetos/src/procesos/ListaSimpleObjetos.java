
package procesos;

import datos.CanalTV;

public class ListaSimpleObjetos
{
    public Nodo inicio;

    public ListaSimpleObjetos()
    {
       inicio = null;
    }

    public Nodo retornarUltimo()
    {
        Nodo p = inicio;

        while (p.sgte != null)
            p = p.sgte;

        return p;
    }

    public Nodo retornarAnterior(Nodo q)
    {
        Nodo p = inicio;

        while (p.sgte != q)
            p = p.sgte;

        return p;
    }

    public void adicionar(CanalTV dato)
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

    public Nodo buscarPorNro(int dato)  // búsqueda iterativa
    {
        Nodo p = inicio;

        while (p != null)
        {
            if (p.info.nro == dato)
                return p;
            p = p.sgte;
        }
        return null;
    }
        
    public Nodo buscarPorNro(Nodo p, int dato)  // búsqueda recursiva
    {
        // implementar
        return null;
    }
}
