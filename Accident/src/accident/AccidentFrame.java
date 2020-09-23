/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accident;

import java.awt.*;
import javax.swing.*;

public class AccidentFrame extends JFrame {
   
     
   public AccidentFrame(){
       super("Motor Vehicle Registration Application");
       
       JTabbedPane tabbedPane = new JTabbedPane();
       tabbedPane.addTab("Add new accident", new AccidentPanel()); 
       JLabel titleLabel=new JLabel("Queensland Road and Transport Authority");
       
       this.add(tabbedPane);
       
   }
}
