
package FushimiStoreUtils;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Kate
 */
public class Utils {
    
    private static final String RUTA_FONDO_JFRAME = "/FushimiStoreImg/LogoBunnyCatLogo.png";
    
    public static void cambiarFondoJFrame (JFrame Frame){
          try {
            ImageIcon fondo = new ImageIcon(Utils.class.getResource(RUTA_FONDO_JFRAME));
            Frame.setIconImage(fondo.getImage());
                                
        } catch (Exception e) {
            ImageIcon fondo = new ImageIcon();
            Frame.setIconImage(fondo.getImage());
        }
    }

    
    
    
}
