package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
public class PanelResultados extends JPanel
 {
        //----------------------
        //-------Atributos------
        //----------------------
        private JTextArea taResultado;
        private JScrollPane spResultado;
        //----------------------
        //---------Metodos------
        //----------------------   


        /*Método Constructor*/
        public PanelResultados() 
    
        {
            //definir contenedor del panel

            this.setLayout(null);
            this.setBackground(Color.GRAY);

            //crear y agregar area de texto
            taResultado = new JTextArea();
            spResultado = new JScrollPane(taResultado);
            spResultado.setBounds(20, 25, 435, 260);
            this.add(spResultado);



            //Borde y titulo al panel
            TitledBorder borde = BorderFactory.createTitledBorder("Panel Resultados ") ;
            borde.setTitleColor(Color.WHITE);
            this.setBorder(borde);

        }

        //Metodo de acceso a la informacion
        public void mostrarResultado(int mayor)
        {
            taResultado.setText("El numero mayor es : "+ mayor);
        }




        //Borrar resultados
        public void borrar()
        {
            taResultado.setText("");
        }
}
