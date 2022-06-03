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
    //private int a[] = 0;
    Counter score[];
    RecordsManager recordsManager = new RecordsManager("records",3);
    List<GameRecord> records = recordsManager.getRecords();

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
        int i = 0;
        for (GameRecord record: records)
        {
            
            score[i]= new Counter();
            score[i].setValue(record.getScore());
            i++;
    
        }
        addObject(score[0], 400,200);
        addObject(score[1], 400,280);
        addObject(score[2], 400,360);
        
        //score.setValue(a[0]);
        //score1.setValue(a[1]);
        //score2.setValue(a[2]);
        
        this.showText("!  S   C   O   R   E  !", 400, 100);

        this.showText("1.", 330, 200);
        this.showText("2.", 330, 280);
        this.showText("3.", 330, 360);
        
    }
}
