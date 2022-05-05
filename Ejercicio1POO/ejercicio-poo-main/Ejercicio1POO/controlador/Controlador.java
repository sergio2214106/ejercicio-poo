package controlador;

import java.awt.event.ActionListener;

import modelo.Mayor2Enteros;
import vista.VentanaPrincipal;

import java.awt.event.ActionEvent;

public class Controlador implements ActionListener
{
        
    
        //----------------------
        //-------Atributos------
        //----------------------

        private VentanaPrincipal vista;
        private Mayor2Enteros modelo;

        //----------------------
        //---------Metodos------
        //---------------------- 
        
        /*Metodo Constructor*/
        public Controlador(VentanaPrincipal pvista, Mayor2Enteros pmodelo)
        {
            this.vista = pvista;
            this.modelo= pmodelo;
            this.vista.miPanelOperaciones.btHallar.addActionListener(this);
            this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
            this.vista.miPanelOperaciones.btSalir.addActionListener(this);
        }
        
        @Override
        public void actionPerformed(ActionEvent ae)
        {
            // Identificar el comando generado [hallar, borrar, salir]

            String comando = ae.getActionCommand();


            if(comando.equals("salir"))
            {
                System.exit(0);
            }
            if(comando.equals("borrar"))
            {
                this.vista.miPanelEntradaDatos.borrar();
                this.vista.miPanelResultados.borrar();
            }
            if(comando.equals("hallar"))
            {
                modelo.setX(Integer.parseInt(vista.miPanelEntradaDatos.getTfX()));
                modelo.setY(Integer.parseInt(vista.miPanelEntradaDatos.getTfY()));
                modelo.HallarMayor();
                vista.miPanelResultados.mostrarResultado(modelo.getMayor());
            }
        }
    
}
