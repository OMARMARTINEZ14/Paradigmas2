/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package D021224;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.HeadlessException;



/**
 *
 * @author omarm
 */
public class FrmAltas extends javax.swing.JFrame {

	public FrmAltas() {
		super.setDefaultCloseOperation(WindowsContants.EXIT_ON_CLOSE);
		
		
		Dimension d =  new Dimension();
		d.height = 320;
		d.width = 640;
		
		super.setSize(d);
		
		super.setTitle( "Altas alumnos");
		
		super.setLayout(new FlowLayout());
		
		lblMatricula = new javax.swing.JLabel("Matricula");
		txtMatricula = new javax.swing.JTextField("Matricula");
		
		
		
		
	}
	
	
	
	
	
	
}
