/*Requisits del joc:

1.- Implementar les classes necessàries per representar els objectes del joc Pac-Man, incloent-hi:

- PacMan: Representa el personatge principal del joc.
        - Mètodes:
            - move(int newPosX, int newPosY): Mou Pac-Man a una nova posició al laberint.
            - pickupBola(): Recol·lecta una bola normal i augmenta la puntuació.
            - pickupBolaEspecial(): Recol·lecta una bola especial i atorga poder temporal a Pac-Man.
            - pickupFruita(): Recollita una fruita i augmenta la puntuació.
            - loseLife(): Disminueix una vida quan Pac-Man és capturat per un fantasma.
            - detectColisionFantasma(Fantasma fantasma): Verifica si Pac-Man col·lisiona amb un fantasma.*/

        
public class PacMan {
    private int posX;
    private int posY;
    private int score;
    private int lives;

    
    public PacMan() {
