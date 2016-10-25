/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

/**
 *
 * @author KDM
 */
public class Ghost extends MoveableGameObject implements PacPrintable
{

    public Ghost(int x, int y, int Speed) {
        super(x, y, Speed);
    }
      @Override
    public String getAscii()
    {
       return "+";     
    }  
}
