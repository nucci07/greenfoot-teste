import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tigre here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mario2 extends Actor
{
    GifImage myGif = new GifImage("mario2.gif");
    GreenfootSound hadu = new GreenfootSound("poder.wav");
    
    private int sTimer = 0;
    public int speed=3;
    /**
     * Act - do whatever the rafael_leao wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        
        setImage(myGif.getCurrentImage());
        
        movemento();
}

 public void movemento(){
                   if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if (Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if (Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if (Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
        else if (Greenfoot.isKeyDown("f")){
         getWorld().addObject(new hadouken(), getX() + 10, getY() + 20);   
        }
    
    }
    
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3 )) {
            setRotation(direction * 90);
        }
    }
}
