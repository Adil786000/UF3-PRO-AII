public class Nodo {
    int dato;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(int dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }

    public Nodo(char dato) {
        this.dato = dato;
        this.izquierda = null;
        this.derecha = null;
    }
}