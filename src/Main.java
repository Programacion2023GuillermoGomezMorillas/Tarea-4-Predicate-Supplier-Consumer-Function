import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Predicate<Integer> comprobarNumero1 = x -> x > 100;
        System.out.println(comprobarNumero1.test(1234));
        //Ejercicio 2
        Predicate<Integer> comprobarNumero2 = x -> x > 100 && x < 300;
        System.out.println(comprobarNumero2.test(200));
        //Ejercicio 3
        Predicate<Integer> comprobarNumero3 = x -> x > 100 || x < 50;
        System.out.println(comprobarNumero3.test(100));
        //Ejercicio 4
        Predicate<Integer> comprobarNumero4 = x -> x != 100;
        System.out.println(comprobarNumero4.test(100));
        //Ejercicio 5
        BiPredicate<String, String> comprobarNumero5 = (x, y) -> x.equals(y);
        System.out.println(comprobarNumero5.test("hola", "holaa"));
        //Ejercicio 6
        List<Integer> listaNumeros = Arrays.asList(0, 1, 2, 3, 4, 5, 27, 29, 8, 9);
        Predicate<List<Integer>> comprobarNumero6 = x -> {
            boolean resultado = false;
            for (int n : x) {
                if (n > 25 && n < 30) {
                    resultado = true;
                }
            }
            return resultado;
        };

        //Ejercicio 7
        List<String> seisCadenas = Arrays.asList("caden", "cadena2p", "cadena3", "acadena4", "cadena5", "cadena6");
        Predicate<List<String>> comprobarCadena = x -> {
            boolean esTrue = false;
            for (String a : seisCadenas) {
                if (a.charAt(0) == 'a') {
                    esTrue = true;
                }
            }
            return esTrue;
        };
        Predicate<List<String>> comprobarTamano = e -> {
            boolean esTrue = false;
            for (String a : seisCadenas) {
                if (a.length() == 5) {
                    esTrue = true;
                }
            }
            return esTrue;
        };

        System.out.println("---------------------------------");
        System.out.println(comprobarCadena.test(seisCadenas));
        System.out.println("---------------------------------");
        System.out.println(comprobarTamano.test(seisCadenas));

        //Ejercicio 8
        Predicate<List<String>> comprobarCadena2 = x -> {
            boolean esTrue = false;
            for (String a : seisCadenas) {
                if (a.charAt(a.length() - 1) == 'p') {
                    esTrue = true;
                }
            }
            return esTrue;
        };
        System.out.println(comprobarCadena2.test(seisCadenas));

        //Ejercicio 9
        Supplier<String> mostrarString = () -> "Me gusta Java";
        System.out.println(mostrarString.get());

        //Ejercicio 10
        List<String> cincoPaises = Arrays.asList("Paris", "Mexico", "España", "Argentia", "Alemania", "Rusia");
        Random random = new Random();
        Supplier<String> devuelvePais = () -> cincoPaises.get(random.nextInt(6));
        System.out.println("me voy de viaje a " + devuelvePais.get());

        //Ejercicio 11
        Supplier<Date> mostrarFecha = () -> new Date();
        System.out.println(mostrarFecha.get());

        //Ejercicio 12
        Supplier<String> diaActual = () -> "El dia actual es: "+ LocalDate.now().getDayOfWeek();
        System.out.println(diaActual.get());

        //Ejercicio 13
        cincoPaises.forEach(a -> System.out.println(a.toUpperCase()));

        //Ejercicio 14



    }
}