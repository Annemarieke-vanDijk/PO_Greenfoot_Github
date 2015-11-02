import greenfoot.*;

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    private int balBCount;
    
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Maak nieuwe wereld van 800x800 pixels.
        super(800, 800, 1); 
        
        // Plaats alle ballen in de wereld.
        bal Bal = new bal();
        bal Bal2 = new bal();
        bal Bal3 = new bal();
        bal Bal4 = new bal();
        bal Bal5 = new bal();
        bal Bal6 = new bal();
        bal Bal7 = new bal();
        bal Bal8 = new bal();
        bal Bal9 = new bal();
        bal Bal10 = new bal();
        bal Bal11 = new bal();
        bal Bal12 = new bal();
        bal Bal13 = new bal();
        bal Bal14 = new bal();
        bal Bal15 = new bal();
        
        balBCount = 0;
        //kijkt of er nog een balB is
        if (balBCount == 0) {
            addObject(new balB(), 120, 120);
            balBCount = balBCount + 1;
        }
        if (Greenfoot.isKeyDown("Space")) {
            balBCount = balBCount - 1;
        }
        // Plaats de ballen op een willekeurig plek aan de hand van 5 verschillende indelingen.
        
        int wilstructuur = Greenfoot.getRandomNumber(5);
        if (wilstructuur == 0) 
        {
            addObject(Bal, 120, 680);
            addObject(Bal2, 200, 680);
            addObject(Bal3, 280, 680);
            addObject(Bal4, 360, 680);
            addObject(Bal5, 440, 680);
            addObject(Bal6, 520, 680);
            addObject(Bal7, 600, 680);
            addObject(Bal8, 120, 600);
            addObject(Bal9, 200, 600);
            addObject(Bal10, 440, 600);
            addObject(Bal11, 600, 600);
            addObject(Bal12, 280, 600);
            addObject(Bal13, 280, 440);
            addObject(Bal14, 280, 520);
            addObject(Bal15, 200, 520);
        }
        else if (wilstructuur == 1) 
        {
           addObject(Bal, 120, 680);
            addObject(Bal2, 200, 680);
            addObject(Bal3, 280, 680);
            addObject(Bal4, 360, 680);
            addObject(Bal5, 440, 680);
            addObject(Bal6, 520, 680);
            addObject(Bal7, 600, 680);
            addObject(Bal8, 280, 600);
            addObject(Bal9, 200, 600);
            addObject(Bal10, 360, 600);
            addObject(Bal11, 600, 600);
            addObject(Bal12, 520, 600);
            addObject(Bal13, 280, 440);
            addObject(Bal14, 280, 520);
            addObject(Bal15, 520, 520);
        }
         else if (wilstructuur == 2) 
        {
             addObject(Bal, 120, 680);
            addObject(Bal2, 200, 680);
            addObject(Bal3, 280, 680);
            addObject(Bal4, 360, 680);
            addObject(Bal5, 600, 440);
            addObject(Bal6, 520, 680);
            addObject(Bal7, 600, 680);
            addObject(Bal8, 120, 600);
            addObject(Bal9, 280, 600);
            addObject(Bal10, 360, 600);
            addObject(Bal11, 600, 600);
            addObject(Bal12, 520, 600);
            addObject(Bal13, 120, 520);
            addObject(Bal14, 360, 520);
            addObject(Bal15, 600, 520);
        }
         else if (wilstructuur == 3) 
        {
            addObject(Bal, 120, 680);
            addObject(Bal2, 200, 680);
            addObject(Bal3, 280, 680);
            addObject(Bal4, 520, 680);
            addObject(Bal5, 600, 680);
            addObject(Bal6, 200, 600);
            addObject(Bal7, 440, 600);
            addObject(Bal8, 520, 600);
            addObject(Bal9, 600, 600);
            addObject(Bal10, 200, 520);
            addObject(Bal11, 440, 520);
            addObject(Bal12, 520, 520);
            addObject(Bal13, 440, 680);
            addObject(Bal14, 520, 440);
            addObject(Bal15, 520, 360);
        }
         else if (wilstructuur == 4) 
        {
            addObject(Bal, 120, 680);
            addObject(Bal2, 120, 360);
            addObject(Bal3, 280, 680);
            addObject(Bal4, 360, 680);
            addObject(Bal5, 440, 680);
            addObject(Bal6, 520, 680);
            addObject(Bal7, 120, 600);
            addObject(Bal8, 280, 600);
            addObject(Bal9, 360, 600);
            addObject(Bal10, 440, 600);
            addObject(Bal11, 520, 600);
            addObject(Bal12, 120, 520);
            addObject(Bal13, 280, 520);
            addObject(Bal14, 440, 520);
            addObject(Bal15, 120, 440);
        }
    }
}

    

