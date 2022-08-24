import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{
	
	private JMenuBar mb;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miNegro, miElCreador, miSalir, miNuevo;
	private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, label1erApellido, label2doApellido, labelDepartamento, labelAntiguedad, 
				   labelResultado, labelCopy;
	private JTextField txtNombreTrabajador, txt1erApellidoTrabajador, txt2doApellidoTrabajador;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JScrollPane scroll1;
	private JTextArea textarea1;
	String nombreAdm = "";
	
	public Principal() {
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla Principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida interfazBienvenida = new Bienvenida();
		nombreAdm = interfazBienvenida.texto;
		
		mb = new JMenuBar();
		mb.setBackground(new Color(255,0,0));
		setJMenuBar(mb);
		
		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		mb.add(menuOpciones);
		
		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		mb.add(menuCalcular);
		
		menuAcercaDe = new JMenu("Acerca De");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		mb.add(menuAcercaDe);
		
		menuColorFondo = new JMenu("Color de fondo");
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.setForeground(new Color(255,0,0));
		menuOpciones.add(menuColorFondo);
		
		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setFont(new Font("Andale Mono", 1, 14));
		miCalculo.setForeground(new Color(255,0,0));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);
		
		miRojo = new JMenuItem("Rojo");
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		miRojo.setForeground(new Color(255,0,0));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);
		
		miNegro = new JMenuItem("Negro");
		miNegro.setFont(new Font("Andale Mono", 1, 14));
		miNegro.setForeground(new Color(255,0,0));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);
		
		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);
		
		miElCreador = new JMenuItem("El creador");
		miElCreador.setFont(new Font("Andale Mono", 1, 14));
		miElCreador.setForeground(new Color(255,0,0));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);
		
		miSalir = new JMenuItem("Salir");
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		miSalir.setForeground(new Color(255,0,0));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);
		
		ImageIcon imagen = new ImageIcon("images/logo-coca.png"); 
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);
		
		labelBienvenido = new JLabel("Bienvenido " + nombreAdm);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setFont(new Font("Andale Mono", 1, 32));
		labelBienvenido.setForeground(new Color(255,255,255));
		add(labelBienvenido);
		
		labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setFont(new Font("Andale Mono", 0, 24));
		labelTitle.setForeground(new Color(255,255,255));
		add(labelTitle);
		
		labelNombre = new JLabel("Nombre Completo");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setFont(new Font("Andale Mono", 1, 12));
		labelNombre.setForeground(new Color(255,255,255));
		add(labelNombre);
		
		txtNombreTrabajador = new JTextField();
		txtNombreTrabajador.setBounds(25,213,150,25);
		txtNombreTrabajador.setBackground(new Color(224,224,224));
		txtNombreTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txtNombreTrabajador.setForeground(new Color(255,0,0));
		add(txtNombreTrabajador);
		
		label1erApellido = new JLabel("Primer Apellido");
		label1erApellido.setBounds(25,248,180,25);
		label1erApellido.setFont(new Font("Andale Mono", 1, 12));
		label1erApellido.setForeground(new Color(255,255,255));
		add(label1erApellido);
		
		txt1erApellidoTrabajador = new JTextField();
		txt1erApellidoTrabajador.setBounds(25,273,150,25);
		txt1erApellidoTrabajador.setBackground(new Color(224,224,224));
		txt1erApellidoTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txt1erApellidoTrabajador.setForeground(new Color(255,0,0));
		add(txt1erApellidoTrabajador);
		
		label2doApellido = new JLabel("Segundo Apellido");
		label2doApellido.setBounds(25,308,180,25);
		label2doApellido.setFont(new Font("Andale Mono", 1, 12));
		label2doApellido.setForeground(new Color(255,255,255));
		add(label2doApellido);
		
		txt2doApellidoTrabajador = new JTextField();
		txt2doApellidoTrabajador.setBounds(25,334,150,25);
		txt2doApellidoTrabajador.setBackground(new Color(224,224,224));
		txt2doApellidoTrabajador.setFont(new Font("Andale Mono", 1, 14));
		txt2doApellidoTrabajador.setForeground(new Color(255,0,0));
		add(txt2doApellidoTrabajador);
		
		labelDepartamento = new JLabel("Seleccione el departamento:");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
		labelDepartamento.setForeground(new Color(255,255,255));
		add(labelDepartamento);
		
		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new Color(224,224,224));
		comboDepartamento.setFont(new Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new Color(255,0,0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al Cliente");
		comboDepartamento.addItem("Departamento de Logistica");
		comboDepartamento.addItem("Departamento de Gerencia");
		
		labelAntiguedad = new JLabel("Selecciona la antiguedad:");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);
		
		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new Color(224,224,224));
		comboAntiguedad.setFont(new Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new Color(255,0,0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 año de servicio");
		comboAntiguedad.addItem("2 a 6 años de servicio");
		comboAntiguedad.addItem("7 años o mas de servicio");
		
		labelResultado = new JLabel("Resultado del Calculo:");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Andale Mono", 1, 12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);
		
		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(224,224,224));
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(255,0,0));
		textarea1.setText("\n	Aqui aparece el resultado del calculo de las vacaciones.");
		scroll1 = new JScrollPane(textarea1);
		scroll1.setBounds(220,333,385,90);
		add(scroll1);
		
		labelCopy = new JLabel("©The Coca-Cola Company | Todos los derechos reservados.");
		labelCopy.setBounds(135,445,500,30);
		labelCopy.setFont(new Font("Andale Mono", 1, 12));
		labelCopy.setForeground(new Color(255,255,255));
		add(labelCopy);
	}
	
	public void actionPerformed(ActionEvent evento) {
		if(evento.getSource() == miCalculo) {
			
			String nombreTrabajador = txtNombreTrabajador.getText();
			String primerA = txt1erApellidoTrabajador.getText();
			String segundoA = txt2doApellidoTrabajador.getText();
			String Departamento = comboDepartamento.getSelectedItem().toString();
			String Antiguedad = comboAntiguedad.getSelectedItem().toString();

			if(nombreTrabajador.equals("") || primerA.equals("") || segundoA.equals("") || Departamento.equals("") || Antiguedad.equals("")){
				
				JOptionPane.showMessageDialog(null,"Debes llenar todos los campos.");
			} else {

				if(Departamento.equals("Atencion al Cliente")) {
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
								  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 6 dias de vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
								  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 14 dias de vacaciones.");
					}
					if(Antiguedad.equals("7 años o mas de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
							 	  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 20 dias de vacaciones.");
					}
				}
				if(Departamento.equals("Departamento de Logistica")) {
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
								  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 7 dias de vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
								  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 15 dias de vacaciones.");
					}
					if(Antiguedad.equals("7 años o mas de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
							 	  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 22 dias de vacaciones.");
					}
				}
				if(Departamento.equals("Departamento de Gerencia")) {
					if(Antiguedad.equals("1 año de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
								  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 10 dias de vacaciones.");
					}
					if(Antiguedad.equals("2 a 6 años de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
								  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 20 dias de vacaciones.");
					}
					if(Antiguedad.equals("7 años o mas de servicio")) {
						textarea1.setText("\n	El trabajador " + nombreTrabajador + " " + primerA + " " + segundoA +
							 	  "\n	quien labora en " + Departamento + " con " + Antiguedad +
								  "\n	recibe 30 dias de vacaciones.");
					}
				}
			}
		}
		if(evento.getSource() == miRojo) {
			getContentPane().setBackground(new Color(255,0,0));
		}
		if(evento.getSource() == miNegro) {
			getContentPane().setBackground(new Color(0,0,0));
		}
		if(evento.getSource() == miNuevo) {
			
			txtNombreTrabajador.setText("");
			txt1erApellidoTrabajador.setText("");
			txt2doApellidoTrabajador.setText("");
			comboDepartamento.setSelectedIndex(0);
			comboAntiguedad.setSelectedIndex(0);
			textarea1.setText("\n	Aqui aparece el resultado del calculo de las vacaciones.");
		}
		if(evento.getSource() == miSalir) {
			
		Bienvenida interfazBienvenida = new Bienvenida();
		interfazBienvenida.setBounds(0,0,400,500);
		interfazBienvenida.setVisible(true);
		interfazBienvenida.setResizable(false);
		interfazBienvenida.setLocationRelativeTo(null);
		this.setVisible(false);
		}
		if(evento.getSource() == miElCreador) {
			
			JOptionPane.showMessageDialog(null,"Desarrollado por $anty");
		}
	}
	
	public static void main(String args[]) {
		Principal interfazPrincipal = new Principal();
		interfazPrincipal.setBounds(0,0,640,535);
		interfazPrincipal.setVisible(true);
		interfazPrincipal.setResizable(false);
		interfazPrincipal.setLocationRelativeTo(null);
	}
}