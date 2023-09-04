/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author User
 */
public class Geometry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // 1ST POINT
        MyPoint p1 = new MyPoint(10,-40);
   
        //2ND POINT
        MyPoint p2 = new MyPoint(1, 0);
        
        //DISPLAY POINTS AND QUADRANT
        p1.displayPoint(); System.out.println("Quadrant: "+p1.getQuadrant());
        System.out.print(p2);; System.out.println("Quadrant: "+p2.getQuadrant());
        
        //SHOW DISTANCE
        System.out.printf("Distance: %.2f\n",p1.getDistance(p2));
        
        //SHOW ANGLE FORMED
        System.out.printf("Angle: °%.2f\n", (p1.getAngle(p2)));
    }
    
}
