package view;
import javax.swing.JOptionPane;

import controller.RedesController;;
public class principal {
    public static void main(String[] args) {
        RedesController controller = new RedesController();
        int selecao = 0;
        do {
            selecao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Adaptadores\n"+ "2 - Média\n"));
            switch(selecao) {
                case 1:
                    controller.ip();break;
                case 2:
                    controller.ping();break;
            }
        } while(selecao != 2);
    }
}