/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

/**
 *
 * @author 4littc85
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import.javax.swing.JTextField;

public class Week8 extends JFrame 
    {
     
        private JLabel lblRegNo;
        private JLabel lblColour;
        private JLabel lblMake;
        private JLabel lblModel;
        private JLabel lblStatus;
        
        private JTextField txtRegNo;
        private JTextField txtColour;
        private JTextField txtMake;
        private JTextField txtModel;
        
        private JButton btnAdd;
        private JButton btnRemove;
        
    
public Week8 () {
    
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new GridBagLayout());

        initComponents();
        
        
        lblRegNo = new JLabel("Registration No:");
        lblColour = new JLabel("Colour:");
        lblMake = new JLabel("Make:");
        lblModel = new JLabel("Model:");
        lblStatus = new JLabel ("Car Park has 15 empty spaces");
        txtRegNo = new JTextField ();
        txtColour = new JTextField ();
        txtMake = new JTextField ();
        txtModel = new JTextField ();
        btnAdd = new JButton("Add Car");
        btnRemove = new JButton("Remove Car");

    
        
    }



}
