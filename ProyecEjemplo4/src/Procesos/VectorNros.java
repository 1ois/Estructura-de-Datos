
package Procesos;

public class VectorNros {
      private double elementos[];
      private int conta;
     public VectorNros(int tamaño)
     { conta=0;
       elementos=new double [tamaño];
    }
     public int getConta(){return conta;}
     public double getElemento(int pos){  return elementos[pos];}
     public void adicionar(double dato)
     {
         elementos[conta]=dato;
         conta++;
     }
}
