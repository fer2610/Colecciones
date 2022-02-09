//Escriba un programa que inserte 25 enteros aleatorios de 0 a 100 en orden,
//en un objeto LinkedList. El programa debe ordenar los elementos,
//para luego calcular la suma de éstos y su promedio de punto flotante.
import java.util.LinkedList;
import java.util.Random;

public class SumaPromedio {
        public static void main(String[] args) {
            try {
                LinkedList<Integer> numeros = new LinkedList<>();
                Random random = new Random();

                for (int i = 0; i <= 24; i++) {
                    numeros.add(random.nextInt((100 - 1) + 1) + 1);

                }
                System.out.println("Los numeros generados aleatoriamente son: ");
                for (int i = 0; i <= 24; i++) {
                    int numeroo = numeros.get(i);
                    System.out.print("/" + numeroo);
                }
                System.out.println(" ");
                SumaPromedio ordenamiento= new SumaPromedio();
                ordenamiento.burbujaAscendente(numeros);
                System.out.println("Los numeros ordenados son: ");
                for (int i = 0; i <= 24; i++) {
                    int numeroo = numeros.get(i);
                    System.out.print("/" + numeroo);
                }
                System.out.println(" ");
                int suma=0;
                for (int i = 0; i <= 24; i++) {
                    int numeroo = numeros.get(i);
                    suma=suma+numeroo;
                }
                System.out.println("La suma de los numeros es: "+suma);
                float promedio=suma/25;
                System.out.println("El promedio de los numeros es: "+promedio);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
            }
        }
    public void burbujaAscendente(LinkedList<Integer> a) {
        int i, j, aux;
        for (i = 0; i < a.size() - 1; i++) {
            for (j = 0; j < a.size() - i - 1; j++) {
                if (a.get(j + 1) < a.get(j)) {
                    aux = a.get(j + 1);
                    a.set(j+1,a.get(j));
                    a.set(j,aux);
                }
            }
        }
    }
}

