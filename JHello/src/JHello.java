import org.eclipse.swt.widgets.*;

public class JHello {
  public static void main (String [] args) {
    Display display = new Display ();
    Shell shell = new Shell(display);
    shell.setText("Window Sample1");
    shell.setSize(200,100);
    shell.open();
    while (!shell.isDisposed ()){
      if (!display.readAndDispatch ()){
        display.sleep ();
      }
    }
    display.dispose ();
  }
}
