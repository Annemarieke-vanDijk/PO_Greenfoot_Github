import greenfoot.*;

/**
 * Write a description of class balBestuur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balB extends bal
{
    /**
     * Act - do whatever the balBestuur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       checkCollision();
       
       
       
       // Als links/rechts knop ingedrukt is verplaats het balletje dan naar rechts.
       // Als dit buiten het kader is zet de bal dan weer terug.
       // Nadat de knop ingedrukt is is er een delay.
       if (getY() == 120){
       if (Greenfoot.isKeyDown("Left")){
        
           setLocation(getX() - 80, getY());
           if  (getX() >= 650) {
               setLocation(getX() - 80, getY()); 
            }
            if  (getX() <= 100) {
                setLocation(getX() + 80, getY()); 
            }
            Greenfoot.delay(10);
       }
       if (Greenfoot.isKeyDown("Right")){
        
           setLocation(getX() + 80, getY());
           if  (getX() >= 650) {
               setLocation(getX() - 80, getY()); 
            }
            if  (getX() <= 100) {
                setLocation(getX() + 80, getY()); 
            }
            Greenfoot.delay(10);
       }
    
    /*Als je op de spatiebalk drukt gaat de bal eerst helemaal omlaag. 
      Een ander stuk code zorgt dat de bal eventueel weer omhoog gaat om te zorgen dat er geen twee ballen in één vakje zitten.
      Dat is de 'private void checkCollision()'*/
    if (Greenfoot.isKeyDown("Space")){
        int i = 0;
        while (i < 7)
        {
            setLocation(getX(), getY() + 80);
            Greenfoot.delay(i+1);
            i = i + 1;
        }
        
    }
}
       

}
//deze private void detecteert of dat bal1 een andere bal tegen komt. Als bal1 een andere bal tegen komt gaat bal1 80 pixels omhoog. Dit herhaald zich totdat
//bal1 geen andere bal meer tegen komt. 
private void checkCollision()
{
    bal a = (bal) getOneIntersectingObject(bal.class);
    if(a != null) {
        setLocation(getX(), getY() - 80);
    }
}
}
