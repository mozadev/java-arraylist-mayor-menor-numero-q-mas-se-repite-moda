import java.util.ArrayList;
import java.util.Scanner;

public class PREG3 {
    public static void main(String[] args) {
        int n;
        int numero;

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Scanner entrada=new Scanner(System.in);
        System.out.print("ingrese un numero: ");
        n=entrada.nextInt();
        for (int i = 0; i <n ; i++) {
            System.out.print("ingrese un numero: ");
            numero=entrada.nextInt();
            numeros.add(numero);

        }

        double sumapares=0;
        double sumaimpares=0;
        int contadorimpar=0;
        int contadorpar=0;
        double promedioimpar;
        double promediopar;
        for (int i = 0; i < numeros.size(); i++) {
            if(i%2!=0){
                sumaimpares=sumaimpares+numeros.get(i);
                contadorimpar++;
            }
            if(i%2==0){
                sumapares=sumapares+numeros.get(i);
                contadorpar++;
            }

        }
        promedioimpar=sumaimpares/contadorimpar;
        promediopar=sumapares/contadorpar;
        System.out.println("el promedio es : "+promedioimpar);
        System.out.println("el promedio es : "+promediopar);


        int mayor=-999;
        int menor=999;
        for (int i = 0; i < numeros.size(); i++) {
            if(numeros.get(i)>mayor){
                mayor=numeros.get(i);
            }
            if(numeros.get(i)<menor){
                menor=numeros.get(i);
            }

        }
        System.out.println("el menor es : "+menor);
        System.out.println("el mayor es : "+mayor);

        // numeros repetidos
        int maximoNumRepeticiones= 0;
        double moda= 0;

        for(int i=0; i<numeros.size(); i++)
        {
            int numRepeticiones= 0;
            for(int j=0; j<numeros.size(); j++)
            {
                if(numeros.get(i)==numeros.get(j))
                {
                    numRepeticiones++;
                }   //fin if
                if(numRepeticiones>maximoNumRepeticiones)
                {
                    moda= numeros.get(i);
                    maximoNumRepeticiones= numRepeticiones;
                }   //fin if
            }
        }   //fin for
        System.out.println("numero que mas se repite es : "+moda);
        System.out.println("numero de veces que se repite es: "+maximoNumRepeticiones);


    }

}
