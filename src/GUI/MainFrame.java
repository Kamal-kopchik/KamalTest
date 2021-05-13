package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.security.Key;

public class MainFrame extends JFrame {

    private GameModel gameModel;
    private ChessBoard chessBoard;


    public MainFrame() {
        chessBoard = new ChessBoard(gameModel);
        gameModel = new GameModel(chessBoard.getWidth(), chessBoard.getHeight());

        add(chessBoard);

        this.setSize(800, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}

    //----------------------------------------------------------------
    class ChessBoard extends JPanel {

        private GameModel gameModel;
        private int cells;

        public ChessBoard(GameModel gameModel) {
            this.gameModel = gameModel;
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            int width = getWidth() / cells;
            int height = getHeight() / cells;
            Color color = null;
            for (int row = 0; row < cells; row++) {
                for (int col = 0; col < cells; col++) {
                    if (row % 2 == 0) {
                        color = col % 2 == 0 ? Color.black : Color.white;
                    } else {
                        color = col % 2 == 0 ? Color.white : Color.black;
                    }
                    g.setColor(color);
                    g.fillRect(col * width, row * height, width, height);
                    g.drawRect(col * width, row * height, width, height);

                    g.setColor(Color.CYAN);
                    g.fillOval(gameModel.getX(), gameModel.getY(), gameModel.getWidth(), gameModel.getHeight());
                }
            }
        }
    }
//    //--------------------------------------------------------
//    class ModelKeyListener implements KeyListener {
//
//        @Override
//        public void keyPressed(KeyEvent e) {
//            int Keycode=e.getKeyCode();
//
//            switch(Keycode){
//                case 37:
//                    model.moveLeft();
//                    break;
//                case 38:
//                    model.movUp();
//                    break;
//                case 39:
//                    model.moveRight();
//                    break;
//                case 40:
//                    model.moveDown();
//                    break;
//            }
//            JFrame.this.repaint();
//        }

//        @Override
//        public void keyReleased(KeyEvent e) {
//
//        }
//        class Adapter extends KeyAdapter {
//
//            @Override
//            public void keyTyped(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyPressed(KeyEvent e) {
//
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//
//            }
//        }
//    }




