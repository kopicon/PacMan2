/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.util.ArrayList;

/**
 *
 * @author KDM
 */
public class World 
{
  private Object[][] level1 = new Object [20][10];
  private PacManMain pacMan;
  private ArrayList<Ghost> ghostList; 
  private ArrayList<Dot> dotList;
  private ArrayList<DotFruit> dotFruitList;
  private ArrayList<Wall> wallList;

  public World()
  {
      this(new PacManMain());
      
  }
    public World(PacManMain pacMan) 
    {
        this.pacMan = pacMan;
        
    }
    
  @Override
    public String toString()
    {
        String levelString="";
        for (int i = 0; i < level1[0].length; i++) 
        {
            for (int j = 0; j < level1.length; j++) 
            {
                levelString += level1[j][i].getAscii();
                
            }
             levelString += "/n";
        }
        System.out.println(levelString);
        return levelString;   
    }
public void createMockup()
{
//creat walls
    for (int i = 0; i < level1.length; i++) 
    {
        level1[i][0]=new Wall(); //top wall
        level1[i][level1[0].length-1]=new Wall();
    }
        for (int i = 0; i < level1[0].length; i++) 
    {
        level1[0][i] = new Wall(); //top wall
        level1[level1.length-1][i]=new Wall();
    }
    level1[5][5] = pacMan;
    level1[6][4] = Ghost(8,2,1, MoveableGameObject.Direction.DOWN);

}
}
    

