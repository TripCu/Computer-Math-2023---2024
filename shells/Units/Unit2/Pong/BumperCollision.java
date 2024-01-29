package Pong;//

import Lab14.Ball;
import Lab14.Bumper;

public class BumperCollision {
   private static double nearestX;
   private static double nearestY;

   public BumperCollision() {
   }

   public static void collide(Lab14.Bumper bumper, Lab14.Ball ball) {
      if (bumper.inBumper(ball)) {
         while(true) {
            if (!bumper.inBumper(ball)) {
               findImpactPoint(bumper, ball);
               double ux = nearestX - ball.getX();
               double uy = nearestY - ball.getY();
               double ur = Math.sqrt(ux * ux + uy * uy);
               ux /= ur;
               uy /= ur;
               int dx = (int)ball.getdx();
               int dy = (int)ball.getdy();
               double dot_1 = ux * (double)dx + uy * (double)dy;
               double dot_2 = -uy * (double)dx + ux * (double)dy;
               dot_1 *= -1.0;
               double[] d = new double[]{dot_1 * ux - dot_2 * uy, dot_1 * uy + dot_2 * ux};
               dx = (int)Math.round(d[0]);
               dy = (int)Math.round(d[1]);
               ball.setdx((double)dx);
               ball.setdy((double)dy);
               break;
            }

            ball.setX(ball.getX() - ball.getdx() / 10.0);
            ball.setY(ball.getY() - ball.getdy() / 10.0);
         }
      }

   }

   private static void findImpactPoint(Bumper bumper, Lab14.Ball ball) {
      nearestX = (double)bumper.getX();
      nearestY = (double)bumper.getY();

      int y;
      for(y = bumper.getX(); y <= bumper.getX() + bumper.getXWidth(); ++y) {
         updateIfCloser(y, bumper.getY(), ball);
         updateIfCloser(y, bumper.getY() + bumper.getYWidth(), ball);
      }

      for(y = bumper.getY(); y <= bumper.getY() + bumper.getYWidth(); ++y) {
         updateIfCloser(bumper.getX(), y, ball);
         updateIfCloser(bumper.getX() + bumper.getXWidth(), y, ball);
      }

   }

   private static void updateIfCloser(int x, int y, Ball b) {
      if (distance((double)x, (double)y, b.getX(), b.getY()) < distance(nearestX, nearestY, b.getX(), b.getY())) {
         nearestX = (double)x;
         nearestY = (double)y;
      }

   }

   private static double distance(double x1, double y1, double x2, double y2) {
      return Math.sqrt(Math.pow(x1 - x2, 2.0) + Math.pow(y1 - y2, 2.0));
   }
}
