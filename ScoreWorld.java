import greenfoot.*; 
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreWorld extends World
{
    
    RecordsManager recordsManager = new RecordsManager("records.txt",3);
    

    /**
     * Constructor for objects of class ScoreWorld.
     * 
     */
    public ScoreWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 

        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        previousBotton previousBotton = new previousBotton();
        addObject(previousBotton,85,472);
        List<GameRecord> records = recordsManager.getRecords();
        
        int i = 0;
        for (GameRecord record: records)
        {
            Counter score = new Counter();
            
            score.setValue(record.getScore());
            addObject(score, 450,100+i);
            this.showText(record.getPlayerName(), 350, 100+i);
            
            i+=80;
            
        }
        
        
       
        
        this.showText("!  S   C   O   R   E  !", 400, 50);

    
        
    }
}
