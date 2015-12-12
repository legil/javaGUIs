import java.awt.*;


public class Rect
{
   int x;
   int y;

   int w;
   int h;


   Color dc = Color.lightGray;
   Color fc = Color.darkGray;


   public Rect(int x, int y, int w, int h)
   {
      this.x = x;
      this.y = y;

      this.w = w;
      this.h = h;
   }

   public Rect(int x, int y, int w, int h, Color dc, Color fc)
   {
      this.x = x;
      this.y = y;

      this.w = w;
      this.h = h;

      this.dc = dc;
      this.fc = fc;
   }


   public void moveBy(int dx, int dy)
   {
      x += dx;

      y += dy;
   }

   public void resizeBy(int dw, int dh)
   {
      w += dw;

      h += dh;
   }


   public boolean contains(int mx, int my)
   {
      return ((mx >= x) && (my >= y) && (mx <= x+w) && (my <= y+h));
   }


   public void draw(Graphics win)
   {
      win.setColor(fc);

      win.drawRect(x, y, w, h);
   }


   public void fill(Graphics win)
   {
      win.setColor(dc);

      win.fillRect(x, y, w, h);
   }


   public void setBounds(int x, int y, int w, int h)
   {
      this.x = x;
      this.y = y;

      this.w = w;
      this.h = h;
   }


   public void setDrawColor(Color dc)
   {
      this.dc = dc;
   }

   public void setFillColor(Color fc)
   {
      this.fc = fc;
   }

   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }



}