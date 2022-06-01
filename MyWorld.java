import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Uresti uresti = new Uresti();
        addObject(uresti,359,285);
        uresti.setLocation(224,394);
        uresti.setLocation(248,191);
        uresti.setLocation(418,287);
        uresti.setLocation(292,386);
        Niña niña = new Niña();
        addObject(niña,730,326);
        niña.setLocation(679,362);
        Niño niño = new Niño();
        addObject(niño,886,404);
        niño.setLocation(812,380);
        niña.setLocation(694,449);
        niña.setLocation(708,448);
        niño.setLocation(856,363);
        ExitButton exitButton = new ExitButton();
        addObject(exitButton,896,539);
        Título título = new Título();
        addObject(título,531,60);
        título.setLocation(489,68);
        título.setLocation(565,69);
        título.setLocation(498,65);
        PlayButton playButton = new PlayButton();
        addObject(playButton,496,154);
        HelpButton helpButton = new HelpButton();
        addObject(helpButton,931,36);
        helpButton.setLocation(343,161);
        uresti.setLocation(351,162);
        uresti.setLocation(480,145);
        removeObject(uresti);

        Uresti uresti2 = new Uresti();
        addObject(uresti2,289,369);
        helpButton.setLocation(423,179);
        playButton.setLocation(618,165);
        playButton.setLocation(649,125);
        playButton.setLocation(876,57);
        helpButton.setLocation(884,120);
        uresti2.setLocation(160,325);
        uresti2.setLocation(222,405);
        uresti2.setLocation(240,329);
        uresti2.setLocation(125,365);
        uresti2.setLocation(318,409);
        playButton.setLocation(703,150);
        helpButton.setLocation(843,155);
        ScoreButton scoreButton = new ScoreButton();
        addObject(scoreButton,768,86);
        scoreButton.setLocation(926,33);
        helpButton.setLocation(919,386);
        helpButton.setLocation(920,90);
        playButton.setLocation(753,80);
        exitButton.setLocation(103,44);
        playButton.setLocation(923,527);
        helpButton.setLocation(743,58);
        scoreButton.setLocation(861,50);
        scoreButton.setLocation(887,65);
        exitButton.setLocation(138,66);
        helpButton.setLocation(737,53);
        scoreButton.setLocation(850,57);
        scoreButton.setLocation(898,47);
        scoreButton.setLocation(864,68);
        scoreButton.setLocation(852,56);
        helpButton.setLocation(779,73);
        scoreButton.setLocation(917,71);
    }
}
