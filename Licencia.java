import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{
	
	private JTextArea textarea1;
	private JScrollPane scroll1;
	private JLabel label1, label2;
	private JCheckBox check1;
	private JButton boton1, boton2;
	String nombre = "";
	
	public Licencia() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;
		
		label1 = new JLabel("TERMINOS Y CONDICIONES");
		label1.setBounds(215,5,200,30);
		label1.setFont(new Font("Andale mono", 1, 14));
		label1.setForeground(new Color(0,0,0));
		add(label1);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Andale mono", 0, 9));
		textarea1.setText("\n\n    TERMINOS Y CONDICIONES" + 
				  "\n\n 	A.  PROHIBIDA SU VENTA O DISTRIBUCION SIN AUTORIZACION DE $anty." + 
				  "\n   	B.  PROHIBIDA LA ALTERACION DEL CODIGO FUENTE O DISEÑO DE LAS INTERFACES." +
				  "\n   	C.  $anty NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +	
				  "\n\n    LOS ACUERDOS LEGALES EXPUESTO A CONTINUACION RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE." +	
				  "\n 	PARA ACEPTAR ESTOS TERMINOS HAGA CLICK EN (ACEPTO)" +	
				  "\n 	SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLICK EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." +	
				  "\n\n    CONTACTAR A $anty para mas info (es un pro(: ) ");
		scroll1 = new JScrollPane(textarea1);
		scroll1.setBounds(10,40,575,200);
		add(scroll1);
		
		check1 = new JCheckBox("Yo " + nombre + " Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);
		add(check1);
		
		boton1 = new JButton("Continuar");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);
		
		boton2 = new JButton("No Acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);
		
		ImageIcon imagen = new ImageIcon("images/coca-cola.png");
		label2 = new JLabel(imagen);
		label2.setBounds(315,135,300,300);
		add(label2);
	}
	
	public void stateChanged(ChangeEvent evento) {
		if(check1.isSelected() == true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		}
		if(check1.isSelected() == false) {
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == boton1) {
			Principal interfazPrincipal = new Principal();
			interfazPrincipal.setBounds(0,0,640,535);
			interfazPrincipal.setVisible(true);
			interfazPrincipal.setResizable(false);
			interfazPrincipal.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if(evento.getSource() == boton2) {
			Bienvenida interfazBienvenida = new Bienvenida();
			interfazBienvenida.setBounds(0,0,400,500);
			interfazBienvenida.setVisible(true);
			interfazBienvenida.setResizable(false);
			interfazBienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}
	
	public static void main(String args[]) {
		Licencia interfazlicencia = new Licencia();
		interfazlicencia.setBounds(0,0,600,360);
		interfazlicencia.setVisible(true);
		interfazlicencia.setResizable(false);
		interfazlicencia.setLocationRelativeTo(null);
	}
}