/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accident;

import java.awt.BorderLayout;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.BASELINE;


public class AccidentPanel extends JPanel{
    private JPanel accidentPanel;
    
    private JLabel idLabel;
    private JLabel locationLabel;
    private JLabel dateLabel;
    private JLabel regoLabel;
    private JLabel commentLabel;
    
    private JTextField idInput;
    private JTextField locationInput;
    private JTextField dateInput;
    private JTextField regoInput;
    private JTextField commentInput;
    
    JButton saveButton = new JButton("Save");
    JButton clearButton = new JButton("Clear");
    
    //private GroupLayout GUILayout;
    
    public AccidentPanel(){
    accidentPanel = new JPanel();
    
    idLabel = new JLabel("Accident ID: ");
    idInput = new JTextField();
    
    locationLabel = new JLabel("Location: ");
    locationInput = new JTextField();
    
    dateLabel = new JLabel("Date: ");
    dateInput = new JTextField();
    
    regoLabel = new JLabel("Registration: ");
    regoInput = new JTextField();
    
    commentLabel = new JLabel("Comments: ");
    commentInput = new JTextField();
    
    accidentPanel.add(idLabel);
    accidentPanel.add(idInput);
    accidentPanel.add(locationLabel);
    accidentPanel.add(locationInput);
    accidentPanel.add(dateLabel);
    accidentPanel.add(dateInput);
    accidentPanel.add(regoLabel);
    accidentPanel.add(regoInput);
    accidentPanel.add(commentLabel);
    accidentPanel.add(commentInput);
    
    accidentPanel.add(saveButton);
    accidentPanel.add(clearButton);
    
    
     /*
    GUILayout = new GroupLayout(accidentPanel);
   
    setLayout(new BorderLayout());
    add(accidentPanel);
    add(idLabel);
    add(idInput);
    add(saveButton);
    add(clearButton);
*/
    }
}
