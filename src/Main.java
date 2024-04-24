import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        Predicate<Integer> comprobarNumero1 = x -> x>100;
        System.out.println(comprobarNumero1.test(1234));
        //Ejercicio 2
        Predicate<Integer> comprobarNumero2 = x -> x>100 && x<300;
        System.out.println(comprobarNumero2.test(200));
        //Ejercicio 3
        Predicate<Integer> comprobarNumero3 = x -> x>100 || x<50;
        System.out.println(comprobarNumero3.test(100));
        //Ejercicio 4
        Predicate<Integer> comprobarNumero4 = x -> x!=100;
        System.out.println(comprobarNumero4.test(100));
        //Ejercicio 5
        BiPredicate<String, String> comprobarNumero5 = (x, y) -> x.equals(y);
        System.out.println(comprobarNumero5.test("hola", "holaa"));
        //Ejercicio 6
        List<Integer> listaNumeros = Arrays.asList(0,1,2,3,4,5,27,29,8,9);
        Predicate<List<Integer>> comprobarNumero6 = x -> {
            boolean resultado = false;
            for (int n : x){
                if (n>25 && n<30){
                    resultado = true;
                }
            }
            return resultado;
        };
        //Ejercicio 7
    }
}