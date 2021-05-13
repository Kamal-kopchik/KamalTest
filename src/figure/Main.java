package figure;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main extends JFrame {

    private JPanel mainPanel;
    private JPanel controlPanel;

    private JButton circle;
    private JButton rectangle;
    private JButton cross;

    private int prevX;
    private int prevY;

    private Figure selected;

    private ArrayList<Figure> figures = new ArrayList<>();

    public Main() {
        mainPanel = new CanvasPanel();
        mainPanel.setBackground(Color.CYAN);
        mainPanel.setFocusable(true);
        mainPanel.requestFocus();
        controlPanel = new JPanel();

        circle = new JButton("Circle");
        rectangle = new JButton("Rectangle");
        cross = new JButton("Cross");

        circle.addActionListener(e -> {
            figures.add(Utils.createFigure("circle"));
            mainPanel.requestFocus();
            repaint();
        });
        rectangle.addActionListener(e -> {
            figures.add(Utils.createFigure("rectangle"));
            mainPanel.requestFocus();
            repaint();
        });
        cross.addActionListener(e -> {
            figures.add(Utils.createFigure("cross"));
            mainPanel.requestFocus();
            repaint();
        });

        mainPanel.addMouseListener(new CanvasMouseListener());
        mainPanel.addKeyListener(new CanvasKeyListener());
        mainPanel.addMouseMotionListener(new CanvasMouseMotionListener());

        controlPanel.setLayout(new GridLayout(1, 0));
        controlPanel.add(rectangle);
        controlPanel.add(circle);
        controlPanel.add(cross);

        setLayout(new BorderLayout());
        add(mainPanel, BorderLayout.CENTER);
        add(controlPanel, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        JFrame frame = new Main();

        frame.setTitle("Figures");
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    class CanvasMouseListener extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            if (e.getButton() == MouseEvent.BUTTON3) {
                if (selected != null) {
                    selected.setSelected(false);
                    repaint();
                }
                for (Figure figure : figures) {
                    if (figure.contains(e.getX(), e.getY())) {
                        selected = figure;
                        break;
                    }
                }
                if (selected != null) {
                    selected.setSelected(true);
                    repaint();
                    JOptionPane.showMessageDialog(null, selected);
                }
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            super.mousePressed(e);

            if (e.getButton() == MouseEvent.BUTTON1) {
                if (selected != null) {
                    selected.setSelected(false);
                    selected = null;
                    repaint();
                }
                for (Figure figure : figures) {
                    if (figure.contains(e.getX(), e.getY())) {
                        selected = figure;
                        break;
                    }
                }
                if (selected != null) {
                    selected.setSelected(true);
                    prevX = e.getX();
                    prevY = e.getY();

                }
                repaint();
            }
        }
    }

    class CanvasKeyListener extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);

            if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                if (selected != null) {
                    figures.remove(selected);
                    selected = null;
                    repaint();
                }
            }
        }
    }

    class CanvasPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            for (Figure figure : figures) {
                figure.draw(g);
            }
        }
    }

    class CanvasMouseMotionListener extends MouseMotionAdapter {
        @Override
        public void mouseDragged(MouseEvent e) {
            super.mouseDragged(e);

            if (selected != null) {
                selected.move(e.getX() - prevX, e.getY() - prevY);
                prevX = e.getX();
                prevY = e.getY();
                repaint();
            }
        }
    }
}
