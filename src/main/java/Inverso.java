//Escriba un programa que cree un objeto LinkedList de 10 caracteres;
//después el programa debe crear un segundo objeto LinkedList que contenga una copia de la primera lista, pero en orden inverso.
import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Scanner;

public class Inverso {
    public static void main(String[] args) {
        try {
            LinkedList<String> caracteres = new LinkedList<>();
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca 10 elementos en el teclado.");
            for (int i = 0; i <= 9; i++) {
                caracteres.add(sc.next());
            }
            System.out.println(" ");
            System.out.println("Los caracteres que escribio son: ");
            for (int i = 0; i <= 9; i++) {
                System.out.println(i + 1 + ". " + caracteres.get(i));
            }
            Inverso reve= new Inverso();
            System.out.println(" ");
            System.out.println("Los caracteres que escribio, de manera inversa son: ");
            reve.reversa(caracteres);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void reversa(LinkedList<String> r) {
        String cadenaInvertida = "";
        int n = 1;
        for (int x = r.size() - 1; x >= 0; x--) {
            cadenaInvertida = r.get(x);
            System.out.println(n+". "+cadenaInvertida);
            n++;
        }
    }
}

