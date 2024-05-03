public class Principal {
    public static void main(String[] args) {
        ArbolBinario arbolEnteros1 = new ArbolBinario(5);
        ArbolBinario arbolEnteros2 = new ArbolBinario(5);
        System.out.println("Instancias de Arboles creadas: " +
ArbolBinario.getInstancias());

        System.gc();

        arbolEnteros1.crearArbolEnteros();
        arbolEnteros1.imprimirRamasDerechas();

        
}