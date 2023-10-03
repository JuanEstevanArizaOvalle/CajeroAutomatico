import javax.swing.*;

public class Main {
    public static void main(String[] args){
        final int saldo_inicial=1000;
        int opcion;
        float ingreso, saldoActual,retiro;

        opcion =Integer.parseInt(JOptionPane.showInputDialog("bienvenido a su cajero AQUI SE LA SACAN \n"
        +"ingrese 1 si desea ingresar dinero a tu cuenta\n"
        +"ingrese 2 si desea Restirar dinero de la cuenta\n"
        +"ingrese 3 si desea Salir\n"));
        switch (opcion){
            case 1:ingreso = Integer.parseInt(JOptionPane.showInputDialog("Dijite la cantidad que desea ingresar en la cuenta :"));
            saldoActual = saldo_inicial+ingreso;
            JOptionPane.showMessageDialog(null,"el dinero actual de su cuenta es: "+saldoActual);
            break;
            case 2: retiro=Float.parseFloat(JOptionPane.showInputDialog("Dijite la cantidad que desea retirar: "));
            if (retiro>saldo_inicial){
                JOptionPane.showMessageDialog(null,"papi usted no cuenta con ese saldo deje la emocion: ");
            }
            else {
                saldoActual = saldo_inicial - retiro;
                JOptionPane.showMessageDialog(null,"PILLE SE VA A QUEDAR SIN PLATA YA SOLO TE QUEDAN : "+saldoActual);
            }
            break;
            case 3:break;
            default:JOptionPane.showMessageDialog(null,"ese numero no existe papi lea bien solo puede dijitar el 1 2 3 "); break;
        }
    }
}