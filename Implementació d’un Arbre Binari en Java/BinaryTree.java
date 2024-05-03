public class BinaryTree {
    
    private static int instancias = 0;
    private Node raiz;
    private int profundidad;
    
    public BinaryTree(int profundidad) {
        instancias++;
        this.profundidad = profundidad;
    }
    
    public static int getInstancias() {
        return instancias;
    }
    
    public void crearArbolEnteros() {
        this.raiz = new Nodo(1);
        Nodo actual = this.raiz;
        for (int i = 2; i <= this.profundidad; i++) {
            actual.derecha = new Nodo(i);
            actual = actual.derecha;
        }
    }
    
    public void crearArbolCaracteres() {
        this.raiz = new Nodo('A');
        Nodo actual = this.raiz
        for (char c = 'B'; c < (char) ('A' + this.profundidad); c++){
            actual.izquierda = new Nodo(c);
            actual = actual.izquierda;
        }
