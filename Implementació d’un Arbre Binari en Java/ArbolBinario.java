public class ArbolBinario {
    
    private static int instancias = 0;
    private Nodo raiz;
    private int profundidad;
    
    // Constructor de la clase ArbolBinario, incrementa el contador de instancias
    public ArbolBinario(int profundidad) {
        instancias++;
        this.profundidad = profundidad;
    }
    
    // Método estático para obtener el número de instancias creadas
    public static int getInstancias() {
        return instancias;
    }
    
    // Método para crear un árbol de enteros con una rama derecha
    public void crearArbolEnteros() {
        this.raiz = new Nodo(1);
        Nodo actual = this.raiz;
        for (int i = 2; i <= this.profundidad; i++) {
            actual.derecha = new Nodo(i);
            actual = actual.derecha;
        }
    }
    
    // Método para crear un árbol de caracteres con una rama izquierda
    public void crearArbolCaracteres() {
        this.raiz = new Nodo('A');
        Nodo actual = this.raiz;
        for (char c = 'B'; c < (char) ('A' + this.profundidad); c++) {
            actual.izquierda = new Nodo(c);
            actual = actual.izquierda;
            
        }
    }
}