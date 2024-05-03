public class CalculadoraEstadistiques {

    public double calcularMitjana(double[] notes) {
        double suma = 0;
        for (int i = 0; i < notes.length; i++) {
            suma += notes[i];
        }
        return suma / notes.length;
    }

    public double calcularMaxim(double[] notes) {
        double maxim = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] > maxim) {
                maxim = notes[i];
            }
        }
        return maxim;
    }

    public double calcularMinim(double[] notes) {
        double minim = notes[0];
        for (int i = 1; i < notes.length; i++) {
            if (notes[i] < minim) {
                minim = notes[i];
            }
        }
        return minim;
    }
}