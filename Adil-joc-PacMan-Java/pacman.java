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


    public PacMan(int initialPosX, int initialPosY) {
        this.posX = initialPosX;
        this.posY = initialPosY;
        this.score = 0;
        this.lives = 3;
    }

    public  void move(int newPosX, int newPosY) {
        this.posX = newPosX;
        this.posY = newPosY;
    
    }

    public void  pickupBola() {
        this.score += 10;

    }

    public void  pickupBolaEspecial() {
        this.score += 50;
    }   

    public void  pickupFruit() {
        this.score += 20;

    }  

    public void  loseLife() {
        this.lives--;
    
    }
    public boolean detectCollitionGhost(Fantasma fantasma) {
        return false;
     }
    }

    

