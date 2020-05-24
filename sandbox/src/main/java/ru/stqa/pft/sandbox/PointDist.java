// test only for me//not a homework//
package ru.stqa.pft.sandbox;

public class PointDist {
  public static void main (String[] args) {
   double p1x = 5;
   double p1y = 5;
   double p2x = 5;
   double p2y = 0;
   double distP1P2 = distance(p1x, p1y, p2x, p2y);
    System.out.println(distP1P2);

   }


  public static double distance (double p1x,double p1y, double p2x, double p2y) {
    double x = Math.pow(p2x - p1x, 2);
    double y = Math.pow(p2y - p1y, 2);
    double dist = Math.sqrt(x + y);


    return dist;

  }



}
