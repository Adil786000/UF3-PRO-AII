public class GestorTasques {

private ArrayList<Tasca> tasques;
private HashMap<Integer, Tasca> tasquesCompletades;

public GestorTasques() {
    tasques = new ArrayList<>();
    tasquesCompletades = new HashMap<>();
}
ublic void afegirTasca(Tasca tasca) {
    tasques.add(tasca);
}

public void marcarTascaCompletada(int idTasca) {
    Tasca tascaCompletada = tasques.remove(idTasca);
    tasquesCompletades.put(idTasca, tascaCompletada);
}

public void esborrarTasca(int idTasca) {
    tasques.remove(idTasca);
}

public void mostrarTotesTasques() {
    for (Tasca tasca : tasques) {
        System.out.println(tasca);
    }
}

public void mostrarTasquesPerPrioritat(String prioritat) {
    for (Tasca tasca : tasques) {
        if (tasca.getPrioritat().equals(prioritat)) {
            System.out.println(tasca);
        }
    }
}

public static void main(String[] args) {
    GestorTasques gestor = new GestorTasques();