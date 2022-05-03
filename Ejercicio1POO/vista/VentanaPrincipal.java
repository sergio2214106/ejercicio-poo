package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
        //----------------------
        //-------Atributos------
        //----------------------

        public PanelEntradaDatos miPanelEntradaDatos;


        //----------------------
        //---------Metodos------
        //----------------------


        /*Método Constructor*/
        public VentanaPrincipal()
        {
            //Contenedor de la ventana
                this.setLayout(null);

            //Crear y agregar panel

            miPanelEntradaDatos = new PanelEntradaDatos();
            miPanelEntradaDatos.setBounds(5,5,480,200);
            this.add(miPanelEntradaDatos);

            //Caracteristias de la ventana
            this.setTitle("Mayor de 2 enteros");
            this.setSize(500,500);
            //this.setLocation(100, 100);
            this.setLocationRelativeTo(null);
            this.setResizable(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setVisible(true);
        }
}