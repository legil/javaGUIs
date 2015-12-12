import java.awt.*;

public class FakeWindow extends Rect
{
   Titlebar titlebar;

   Resizer resizer;


   public FakeWindow(String title, int x, int y, int w, int h)
   {
      super(x, y, w, h, Color.lightGray, Color.black);

      titlebar = new Titlebar(title, x, y, w, 20, Color.black, Color.blue);

      resizer = new Resizer(x+w-20, y+h-20, 20, 20, Color.red, Color.black);

   }


   public void moveBy(int dx, int dy)
   {
      super.moveBy(dx, dy);
      titlebar.moveBy(dx, dy);
      resizer.moveBy(dx, dy);

   }


   public void resizeBy(int dw, int dh)
   {
      super.resizeBy(dw, dh);

      titlebar.resizeBy(dw, 0);

      resizer.moveBy(dw, dh);

   }



   public void draw(Graphics win)
   {
      super.fill(win);
      super.draw(win);

      titlebar.draw(win);
      resizer.draw(win);

   }

}