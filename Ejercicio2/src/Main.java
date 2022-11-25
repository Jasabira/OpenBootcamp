public class Main {
    public static void main(String[] args) {
        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA
        // incluido.

        int precio = 18;
        double resultadoIVA = IVA(precio);
        System.out.println("El iva del monto es de :" + resultadoIVA);
    }
    public static double IVA(int precio){

        return (1.21 * precio);
    }
}