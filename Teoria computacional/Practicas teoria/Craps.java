import javax.swing.JOptionPane;

public class Craps {

    public static void main(String[] args) {
        
        int dado1, dado2, suma, punto;
        dado1 = dado();
        dado2 = dado();

        suma = dado1 + dado2;
        
        JOptionPane.showMessageDialog(null, "Juego de dados Craps :D");
        
        switch (suma) {
            case 7:
            case 11:
                JOptionPane.showMessageDialog(null, "Dado 1: " +dado1+ "\nDado 2: " +dado2+ "\nSuma: " +suma+ "\n Jugador Gana :D!!!" );
                break;
            case 2:
            case 3:
            case 12:
                JOptionPane.showMessageDialog(null, "Dado 1: " +dado1+ "\nDado 2: " +dado2+ "\nSuma: " +suma+ "\nLa casa gana 7u7r" , "La_casa_gana", JOptionPane.WARNING_MESSAGE);
                break;
            default:
                punto = suma;
                JOptionPane.showMessageDialog(null,"Dado 1: " +dado1+ "\nDado 2: " +dado2+ "\nSuma: " +suma+ "\nPunto: " +punto);
                do{
                    dado1 = dado();
                    dado2 = dado();
                    
                    suma = dado1 + dado2;
                    
                    if (suma == punto){

                        JOptionPane.showMessageDialog(null, "Dado 1: " +dado1+ "\nDado 2: " +dado2+ "\nSuma: " +suma+ "\nJugador gana");

                    }else if(suma == 7){

                        JOptionPane.showMessageDialog(null,"\nDado 1: " +dado1+ "\nDado 2: " +dado2+ "\nSuma: " +suma+ "\nHa perdido el juego :c", "Perdio xD lol!", JOptionPane.ERROR_MESSAGE);
                    }else{
                        JOptionPane.showMessageDialog(null, "\nDado 1: " +dado1+ "\nDado 2: " +dado2+ "\nSuma: " +suma+ "\nTirar de nuevo", "Tirar", JOptionPane.QUESTION_MESSAGE);
                    }
                }while(suma != punto && suma !=7);
                break;
        }
    }
    
    public static int dado(){
        return (int) (Math.random()*6) + 1; 
    }
}
