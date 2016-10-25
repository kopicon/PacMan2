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
public abstract class MoveableGameObject 
{
 public enum Direction{UP, DOWN, LEFT, RIGHT};
 private int x;
 private int y;
 private int Speed;

 public Direction getDirection()
 {
     return Direction();
 }

    public MoveableGameObject(int x, int y, int Speed) {
        this.x = x;
        this.y = y;
        this.Speed = Speed;
    }
 

    public int getSpeed() {
        return Speed;
    }


    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public void setX(int x) {
        this.x = x;
    }
}
