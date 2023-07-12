package RazNoe;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Name implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
                System.out.println("Clicked аt " + e.getX() + "," + e.getY());
                //передаем слушателю параметры клика

        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }


        public static void main(String[] args) {
                // создаем окно
                JFrame jf = new JFrame();
                // устанавливаем ему размеры
                jf.setSize(400, 300);
                //создаем слушателя и подключаем его к окну.
                jf.addMouseListener(new Name());
                // и показываем его
                jf.setVisible(true);
        }
}