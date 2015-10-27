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
       
       // Als links/rechts knop ingedrukt is verplaats het balletje dan naar rechts.
       // Als dit buiten het kader is zet de bal dan weer terug.
       // Nadat de knop ingedrukt is is er een delay.
       // Als op de spatiebalk gedrukt wordt gaat de bal omlaag, hij gaat omlaag totdat hij op een andere bal stuit, 
       // op dat moment gaat de bal weer 1 vakje naar boven.
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
       if (Greenfoot.isKeyDown("Space")){
           setLocation(getX(), getY() + 80);
                  if (getIntersectingObjects(bal.int)=true){
                      setLocation(getX(), getY() - 80);
                  }
                  else if (getIntersectingObjects(bal.int)=false){
                      setLocation(getX(), getY() + 80);
                  }
           Greenfoot.delay(10);
        }
       
}
}
