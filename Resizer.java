import java.awt.*;


public class Resizer extends Rect
{

   public Resizer(int x, int y, int w, int h)
   {
      super(x, y, w, h);
   }

   public Resizer(int x, int y, int w, int h, Color dc, Color fc)
   {
      super(x, y, w, h, dc, fc);
   }



   public void draw(Graphics win)
   {
      super.fill(win);

      super.draw(win);


      win.setColor(Color.black);

      win.drawLine(x+2, y+7, x+18, y+7);

      win.drawLine(x+2, y+14, x+18, y+14);
   }



}