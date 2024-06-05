
package procesos;

public class ExpresionAritmetica 
{
    PilaVectorNros pilaOperandos;
    PilaVectorCaracteres pilaOperadores;
    
    public ExpresionAritmetica(int n)
    {
        pilaOperadores = new PilaVectorCaracteres(n);
        pilaOperandos  = new PilaVectorNros(n);
    }
    
    public boolean esUnOperador(char c)
    {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }
    
    public int getPrioridad(char operador)
    {
        switch(operador)
        {
            case '^': return 3;
            case '/':
            case '*': return 2;
            case '-':
            case '+': return 1;
        }
        return 0;
    }
    
    public String convertirAposFija(String infija)
    {
        // implementar, luego eliminar  return null
        return null;
    }
    
    public double evaluar(String posfija)
    {
        String acum = "";
        char caracter;
        int i, total;
        double a, b, c;
        
        total = posfija.length();
        
        for (i = 0; i < total; i = i+1)
        {
            caracter = posfija.charAt(i);
            
            if (caracter == ' ' || caracter == ',')
                ;
            else
                if (esUnOperador(caracter))
                {
                    b = pilaOperandos.sacar();
                    a = pilaOperandos.sacar();

                    switch(caracter)
                    {
                        case '+': c = a + b;
                                  break;
                        case '-': c = a - b;
                                  break;
                        case '*': c = a * b;
                                  break;
                        case '/': c = a / b;
                                  break;
                        default : c = Math.pow(a, b);
                    }
                    pilaOperandos.poner(c);
                }
                else
                {
                    acum = acum + caracter;
                    
                    if (posfija.charAt(i+1) == ' ' || posfija.charAt(i+1) == ',')
                    {
                        c = Double.parseDouble(acum);
                        pilaOperandos.poner(c);
                        acum = "";
                    }
                }
        }
        return pilaOperandos.sacar();
    }
}
