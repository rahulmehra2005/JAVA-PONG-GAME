package PONG_GAME;

import java.awt.*;
import java.util.*;

public class Ball extends Rectangle{
Random random;
int xVelocity;
int yVelocity;
int initialSpeed=2;

    Ball(int x, int y,int width,int height){
        super(x,y,width,height);
        random=new Random();
        int randomXDirection = random.nextInt(2) == 0 ? -1 : 1;
        setXDirection(randomXDirection * initialSpeed);

        int randomYDirection = random.nextInt(2) == 0 ? -1 : 1;
        setYDirection(randomYDirection * initialSpeed);
        }

    public void setYDirection(int randomYDirection){
        yVelocity=randomYDirection;
    }

    public void setXDirection(int randomXDirection){
        xVelocity=randomXDirection;
    }

    public void move(){
        x+=xVelocity;
        y+=yVelocity;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, width,height);
    }
}
