package com.game.main;

import sun.plugin2.util.ColorUtil;

import java.awt.*;

public class Block extends GameObject {

    public Block(int x, int y, ID id) {
        super(x, y, id);
    }

    public void tick() {

    }


    public void render(Graphics g) {

        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y, 32, 32);
        g.drawRect(x, y, 32, 32);
    }


    public Rectangle getBounds() {
        return new Rectangle(x, y, 32 ,32);
    }
}
