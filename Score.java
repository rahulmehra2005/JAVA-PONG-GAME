package PONG_GAME;

import java.awt.*;

public class Score extends Rectangle{
    static int GAME_HEIGHT;
    static int GAME_WIDTH;
    int player1;
    int player2;

    Score(int GAME_HEIGHT,int GAME_WIDTH){
        Score.GAME_WIDTH=GAME_WIDTH;
        Score.GAME_HEIGHT=GAME_HEIGHT;
    }

    public void draw(Graphics g) {
    g.setColor(Color.yellow);
    g.setFont(new Font("Times New Roman", Font.PLAIN, 60));

    Graphics2D g2d = (Graphics2D) g;
    Stroke oldStroke = g2d.getStroke();
    g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{10}, 0));
    g2d.drawLine(GAME_WIDTH / 2, 0, GAME_WIDTH / 2, GAME_HEIGHT);
    g2d.setStroke(oldStroke);

    g.drawString(String.format("%02d", player1), (GAME_WIDTH / 2) - 85, 50);
    g.drawString(String.format("%02d", player2), (GAME_WIDTH / 2) + 20, 50);
}

}
