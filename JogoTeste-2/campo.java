import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class campo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class campo extends World
{
    private GreenfootSound bgMusic = new GreenfootSound("warm-feeling.mp3");
    
    public void started()
    {
        bgMusic.playLoop();
    }
    
       public void stopped()
    {
        bgMusic.pause();
    }
    
    public campo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepara o mundo para o início do programa.
     * Ou seja: criar os objetos iniciais e adicioná-los ao mundo.
     */
    private void prepare()
    {
        neymar neymar = new neymar();
        addObject(neymar,157,238);
        neymar.setLocation(370,60);
        neymar.setLocation(493,268);
        neymar.setLocation(507,266);
        mario2 mario2 = new mario2();
        addObject(mario2,147,232);
        mario2.setLocation(265,173);
        mario2.setLocation(82,347);
        mario2.setLocation(143,210);
        neymar.setLocation(351,260);
        neymar.setLocation(358,237);
        Counter counter = new Counter();
        addObject(counter,128,27);
        neymar.setLocation(344,314);
        neymar.setLocation(368,229);
    }
}
