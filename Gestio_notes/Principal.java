public class Principal {

    public static void main(String[] args) {
        
        GestorNotes gestorNotes = new GestorNotes();


        double[] notesAlumne1 = {8.5, 7.0, 9.3};
        gestorNotes.registrarNotes("Alumne1", notesAlumne1);


        double[] notes = gestorNotes.obtenirNotes("Alumne1");
        System.out.println("Notes de l'Alumne1: " + Arrays.toString(notes));

 
        CalculadoraEstadistiques calculadora = new CalculadoraEstadistiques();
        double mitjana = calculadora.calcularMitjana(notes);
        double maxim = calculadora.calcularMaxim(notes);
        double minim = calculadora.calcularMinim(notes);

        System.out.println("Mitjana de les notes: " + mitjana);
        System.out.println("Nota màxima: " + maxim);
        System.out.println("Nota mínima: " + minim);
    }
}