package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Random;

public class SnakeGame extends JPanel implements ActionListener {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final int UNIT_SIZE = 25;
    private final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private final int DELAY = 100;
    private ArrayList<Point> snake;
    private Point food;
    private char direction = 'R';
    private boolean running = false;
    private Timer timer;
    private Random random;

    public SnakeGame() {
        random = new Random();
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        snake = new ArrayList<>();
        snake.add(new Point(0, 0));
        newFood();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            // 绘制食物
            g.setColor(Color.RED);
            g.fillOval(food.x, food.y, UNIT_SIZE, UNIT_SIZE);

            // 绘制蛇
            for (int i = 0; i < snake.size(); i++) {
                if (i == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(new Color(45, 180, 0));
                }
                g.fillRect(snake.get(i).x, snake.get(i).y, UNIT_SIZE, UNIT_SIZE);
            }
        } else {
            gameOver(g);
        }
    }

    public void newFood() {
        food = new Point(random.nextInt(WIDTH / UNIT_SIZE) * UNIT_SIZE,
                         random.nextInt(HEIGHT / UNIT_SIZE) * UNIT_SIZE);
    }

    public void move() {
        Point head = snake.get(0);
        Point newHead = new Point(head);

        switch (direction) {
            case 'U': newHead.y -= UNIT_SIZE; break;
            case 'D': newHead.y += UNIT_SIZE; break;
            case 'L': newHead.x -= UNIT_SIZE; break;
            case 'R': newHead.x += UNIT_SIZE; break;
        }

        snake.add(0, newHead);

        if (newHead.equals(food)) {
            newFood();
        } else {
            snake.remove(snake.size() - 1);
        }
    }

    public void checkFood() {
        if (snake.get(0).equals(food)) {
            newFood();
        }
    }

    public void checkCollisions() {
        Point head = snake.get(0);

        // 检查头部是否与身体碰撞
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                running = false;
            }
        }

        // 检查头部是否碰到边界
        if (head.x < 0 || head.x >= WIDTH || head.y < 0 || head.y >= HEIGHT) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        String gameOverText = "游戏结束";
        Font font = new Font("微软雅黑", Font.BOLD, 50);
        FontMetrics metrics = getFontMetrics(font);
        g.setColor(Color.RED);
        g.setFont(font);
        g.drawString(gameOverText, (WIDTH - metrics.stringWidth(gameOverText)) / 2, HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkFood();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') direction = 'L';
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') direction = 'R';
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') direction = 'U';
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') direction = 'D';
                    break;
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        SnakeGame game = new SnakeGame();

        frame.add(game);
        frame.setTitle("贪吃蛇游戏");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}