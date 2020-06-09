
package estaconamentoexercicio;

import javax.swing.JOptionPane;

class Estacionamento {
    public String nomeCliente; 
    public float placaCarro;
    public double registraSaida;
    public double registraEntrada;
    private double modelo;
 
  
  
   
    public String getNomeCliente() {
        return nomeCliente;
    }

   
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    
    public float getPlacaCarro() {
        return placaCarro;
    }

   
    public void setPlacaCarro(float placaCarro) {
        this.placaCarro = placaCarro;
    }

   
    public double getRegistraSaida() {
        return registraSaida;
        
        
         
    }

  
    public void setRegistraSaida(double registraSaida) {
        this.registraSaida = registraSaida;
    }

    
    public double getRegistraEntrada() {
        return registraEntrada;
    }

   
    public void setRegistraEntrada(double registraEntrada) {
        this.registraEntrada = registraEntrada;
    }


    public double getModelo() {
        return modelo;
    }

   
    public void setModelo(double modelo) {
        this.modelo = modelo;
    }

}