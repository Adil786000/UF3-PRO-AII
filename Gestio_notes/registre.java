public class GestorNotes {
    
    private Map<String, double[]> notesAlumnes;

    public GestorNotes() {
  
    }

    public void registrarNotes(String nomAlumne, double[] notes) {
        notesAlumnes.put(nomAlumne, notes);
    }

    public double[] obtenirNotes(String nomAlumne) {
        return notesAlumnes.get(nomAlumne);
    }
}

