import greenfoot.*;

/**
 * Write a description of class bal1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bal extends Actor


{   
    // Voeg alle afbeeldingen toe in het programma. (Uit krab voorbeeld)
    private GreenfootImage image0;
    private GreenfootImage image1;
    private GreenfootImage image2;
    private GreenfootImage image3;
    private GreenfootImage image4;
    private GreenfootImage image5;
    private GreenfootImage image6;
    private GreenfootImage image7;
        
    public bal()
    {
        
    //Alle afbeeldingen worden gekoppeld aan een variabele. (Uit krab voorbeeld)
     image0 = new GreenfootImage("bal0.png");
     image1 = new GreenfootImage("bal1.png");
     image2 = new GreenfootImage("bal2.png");
     image3 = new GreenfootImage("bal3.png");
     image4 = new GreenfootImage("bal4.png");
     image5 = new GreenfootImage("bal5.png");
     image6 = new GreenfootImage("bal6.png");
     image7 = new GreenfootImage("bal7.png");
     
    // Genereer willekeurig nummer en sla op in de variabele nummerbal.      
    int nummerbal = Greenfoot.getRandomNumber(8);
    
    // Geef afbeelding aan de hand van variabele
    if (nummerbal == 0) 
        {
            setImage(image1);
        }
    else if (nummerbal == 1)
        {
            setImage(image2);
        }
    else if (nummerbal == 2)
        {
            setImage(image3);
        }
    else if (nummerbal == 3)
        {
            setImage(image4);
        } 
    else if (nummerbal == 4)
        {
            setImage(image5);
        }    
    else if (nummerbal == 5)
        {
            setImage(image6);
        }
    else if (nummerbal == 6)
        {
            setImage(image7);
        }
    else if (nummerbal == 7)
        {
            setImage(image0);
        }
    
    }
}
