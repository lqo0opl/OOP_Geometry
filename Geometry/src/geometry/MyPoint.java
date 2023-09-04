/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;
import java.lang.Math;
/**
 *
 * @author User
 */
public class MyPoint {
    private int x;
    private int y;
    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
    
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
   public double getDistance(MyPoint point){
       double location;
       location = Math.sqrt(((this.x - point.x)*(this.x - point.x)) + ((this.y - point.y)*(this.y - point.y)));
       return location;
    }
   
   public void displayPoint(){
       System.out.printf("(%d,%d)", this.x, this.y);
   }
   
   public String toString(){
       return "("+this.x+","+this.y+")";
   }
   
   public int getQuadrant(){
       int quadrant;
       if(this.x == 0 || this.y == 0){        
           if(this.x == 0 && this.x == 0){
               quadrant = 0;
           }else{
                if(this.x > 0 || this.x < 0){
                quadrant = 5;
                }else{
                quadrant = 6;
                }
           }
       }else{
          if(this.x > 0){
              if(this.y < 0){
                  quadrant = 4;
              }else{
                  quadrant = 1;
              }
          }else{
              if(this.y < 0){
                  quadrant = 3;
              }else{
                  quadrant = 2;
              }             
          }
       }
       return quadrant;
   }
   
   public double getAngle(MyPoint point){
       double angle;
       angle = Math.toDegrees(Math.atan((point.y-this.y)/(point.x-this.x)));
       return angle;
   }
   
}
