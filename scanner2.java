import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class scanner2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> razaPerros = new ArrayList<String>();
        String resp;

        do {
            System.out.println("Ingrese la raza de perro: ");
            razaPerros.add(sc.nextLine());
            System.out.println("Quiere ingresar nueva raza?: Y o N ");
            resp = sc.nextLine();
        } while (resp.equals("Y"));

        Collections.sort(razaPerros);
        System.out.println("El listado final ordenado de raza de perros es: " + razaPerros);
        System.out.println("----------------*****------------------");

        System.out.println("Ingrese una raza de perro para eliminarlo de la lista: ");
        String respuesta = sc.nextLine();

        if (razaPerros.contains(respuesta)) {
            System.out.println("la raza de perros ha sido encontrado en la lista y se procede a eliminar");
            razaPerros.remove(respuesta);
            System.out.println("El listado final ordenado de raza de perros es: " + razaPerros);

        } else {
            System.out.println("La raza de perro ingresada no estaba en la lista");

            System.out.println("----------------*****------------------");
        }


    }
}
