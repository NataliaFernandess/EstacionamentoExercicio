
package estaconamentoexercicio;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * @author Natalia
 */
public class EstaconamentoExercicio {
    private static String nomeCliente;
    private static Object formato;

  
    public static void main(String[] args) {
      Estacionamento dados = new Estacionamento();
      DecimalFormat formato =  new DecimalFormat("00.00");
      
        
       
   JOptionPane.showMessageDialog(null, "Bem vindo ao estacionamento");
   String nomeCliente =  JOptionPane.showInputDialog(null,"Insira seu nome:");
   String modelo = JOptionPane.showInputDialog(null,"Insira o modelo do seu carro para o cadastro");
   String rg = JOptionPane.showInputDialog(null,"Insira o seu RG para segurança do seu veículo");
   String placaCarro = JOptionPane.showInputDialog(null,"Insira a placa do seu carro:");
   double registraEntrada = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o horário de entrada:"));
   double registraSaida = Double.parseDouble(JOptionPane.showInputDialog(null,"Insira o horário de saída:"));
        
     
       
        double diferença = registraEntrada-registraSaida;
        double total = Math.ceil(diferença)*4;
      
        JOptionPane.showMessageDialog(null, "Seu nome:"
        +nomeCliente
        +"\nO modelo do seu carro:"
        +modelo
        +"\nO seu RG:"
        +rg
        +"\nA placa do seu carro:"
        +placaCarro
        +"\nA hora da sua entrada no estacionamento: "
        +formato.format(registraEntrada)
        +"\nA hora que você registrou a saída:"
        + formato.format(registraSaida)
        +"\nO tempo que permaneceu no estacionamento:"
        + formato.format(diferença)
        +"\nO valor que vccê tem que pagar:"
        + formato.format(total));
        
        JOptionPane.showMessageDialog(null, "Obrigada pela preferência. Volte sempre!!!");
       
    }
    
}
