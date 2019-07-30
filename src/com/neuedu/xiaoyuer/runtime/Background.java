package com.neuedu.xiaoyuer.runtime;

import com.neuedu.xiaoyuer.base.BaseSprite;
import com.neuedu.xiaoyuer.base.Drawable;
import com.neuedu.xiaoyuer.base.Moveable;
import com.neuedu.xiaoyuer.util.ImageMap;

import java.awt.*;

public class Background extends BaseSprite implements Moveable, Drawable {

    private Image bgImage;

    public Background() {
        this(0,0, ImageMap.get("bg1"));
    }

    public Background(int x, int y, Image bgImage) {
        super(x, y);
        this.bgImage = bgImage;
    }
    @Override
    public void move() {
        setY(getY()+1);
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(bgImage,getX(),getY(),bgImage.getWidth(null),bgImage.getHeight(null),null);
        move();
    }


}
