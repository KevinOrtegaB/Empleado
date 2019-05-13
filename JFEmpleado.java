import java.awt.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.event.*;

public class JFEmpleado extends JFrame implements ActionListener
{
    private JPanel p1,p2,p3;
    private JLabel lblNombre,lblApellido,lblGenero,lblFechaNac,lblFechaIng,lblSalario;
    private JTextArea txtNombre,txtApellido,txtGenero,txtFechaNac,txtFechaIng,txtSalario,txtCalEdad,txtCalAnti,txtPrestaciones;
    private JButton btnModificar,btnCalEdad,btnCalAnti,btnPrestaciones,btnCambEmpleado;
    
    public JFEmpleado()
    {
       setTitle("Sistema de un Empleado");
       setVisible(true);
       setSize(400,460);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setResizable(false);
       setLayout(new BorderLayout());
       
       p1=new JPanel();
       p1.setLayout(new GridLayout(7,2,5,5));
       p1.setPreferredSize(new Dimension (400,250));
       p1.setBackground(Color.gray );
       p1.setBorder(new TitledBorder("Datos"));
       
       p2=new JPanel();
       p2.setLayout(new GridLayout(3,2,5,5));
       p2.setPreferredSize(new Dimension (400,150));
       p2.setBackground(Color.gray);
       p2.setBorder(new TitledBorder("Calculos"));
       
       p3=new JPanel();
       p3.setLayout(new FlowLayout());
       p3.setPreferredSize(new Dimension (400,60));
       p3.setBackground(Color.gray);
       p3.setBorder(new TitledBorder("Opciones"));
       
       add(p1,BorderLayout.NORTH);
       add(p2,BorderLayout.CENTER);
       add(p3,BorderLayout.SOUTH);
       
       lblNombre = new JLabel("Nombre");
       lblApellido = new JLabel("Apellido");
       lblGenero = new JLabel("Genero");
       lblFechaNac = new JLabel("Fecha de Nacimiento");
       lblFechaIng = new JLabel("Fecha de Ingreso");
       lblSalario = new JLabel("Salario");
       btnModificar = new JButton ("Modificar salario");
       
       txtNombre = new JTextArea("");
       txtApellido = new JTextArea("");
       txtGenero = new JTextArea("");
       txtFechaNac = new JTextArea("");
       txtFechaIng = new JTextArea("");
       txtSalario = new JTextArea("");
       
       p1.add(lblNombre);
       p1.add(txtNombre);
       p1.add(lblApellido);
       p1.add(txtApellido);
       p1.add(lblGenero);
       p1.add(txtGenero);
       p1.add(lblFechaNac);
       p1.add(txtFechaNac);
       p1.add(lblFechaIng);
       p1.add(txtFechaIng);
       p1.add(lblSalario);
       p1.add(txtSalario);
       p1.add( new JLabel());
       p1.add(btnModificar);
       
       btnCalEdad = new JButton ("Calcular edad");
       btnCalAnti = new JButton ("Calcular antiguedad");
       btnPrestaciones = new JButton ("Prestaciones");
       
       txtCalEdad = new JTextArea ("");
       txtCalAnti = new JTextArea ("");
       txtPrestaciones = new JTextArea ("");
       
       p2.add(btnCalEdad);
       p2.add(txtCalEdad);
       p2.add(btnCalAnti);
       p2.add(txtCalAnti);
       p2.add(btnPrestaciones);
       p2.add(txtPrestaciones);
       
       btnCambEmpleado = new JButton("Cambiar empleado");
       
       p3.add(btnCambEmpleado);
       
       btnModificar.addActionListener(this);
       btnCalEdad.addActionListener(this);
       btnCalAnti.addActionListener(this);
       btnPrestaciones.addActionListener(this);
       btnCambEmpleado.addActionListener(this);    
    }
    public void actionPerformed(ActionEvent evento){
       String comando = evento.getActionCommand(); 
         if(comando.equals("Modificar salario")){
          
        }else if(comando.equals("Calcular edad")){
            Empleado e = new Empleado(txtNombre.getText(),txtApellido.getText(),txtGenero.getText(),Double.parseDouble(txtFechaNac.getText()),Double.parseDouble(txtFechaIng.getText()),Double.parseDouble(txtSalario.getText()));
            Integer fechaAct = 2019; 
            Double edad;
             
            edad=fechaAct-Double.parseDouble(txtFechaNac.getText());
            txtCalEdad.setText(edad.toString());  
            }else if(comando.equals("Calcular antiguedad")){
              Empleado e = new Empleado(txtNombre.getText(),txtApellido.getText(),txtGenero.getText(),Double.parseDouble(txtFechaNac.getText()),Double.parseDouble(txtFechaIng.getText()),Double.parseDouble(txtSalario.getText()));
              Integer fechaAct = 2019; 
              Double antiguedad;
              
              antiguedad = fechaAct - Double.parseDouble(txtFechaIng.getText());
              txtCalAnti.setText(antiguedad.toString());
              }else if (comando.equals("Prestaciones")){
                 Empleado e = new Empleado(txtNombre.getText(),txtApellido.getText(),txtGenero.getText(),Double.parseDouble(txtFechaNac.getText()),Double.parseDouble(txtFechaIng.getText()),Double.parseDouble(txtSalario.getText()));
                 Double prest;
                  
                 prest = (Double.parseDouble(txtCalAnti.getText())* Double.parseDouble(txtSalario.getText())) / 12;
                 txtPrestaciones.setText(prest.toString());
                  }else if (comando.equals("Cambiar empleado")){
                
                      
                  }
       
    }
    
}
