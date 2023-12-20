
package electricity.billing.system;

/**
 *
 * @author partiksingh
 */
import javax.swing.*;
import java.awt.*;
public class Splash extends JFrame implements Runnable{
    Thread t;
    
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/elect.jpg"));
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);
        
        
        setVisible(true);
        
int x = 1;
    for (int i = 2; i < 600; i += 4, x += 1) {
        setSize(2 * i, i);
        try{
               Thread.sleep(10);
           }catch(Exception e){
               e.printStackTrace();
           }
    }

    setLocationRelativeTo(null);
    
    t = new Thread(this);
    t.start();
        
        setVisible(true);
        
     
        
    }
    
    public void run(){
    try{
        Thread.sleep(2000);
        setVisible(false);
        
        //Login frame
        new Login();
        
    }catch(Exception e){
        e.printStackTrace();
    }
}
    
    public static void main(String[] args){
        new Splash();
    }
}
