package com.neuedu.xiaoyuer.util;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class ImageMap {

    public static final Map<String,Image> map =new HashMap<>();
    static {
        map.put("bg1",ImageUtil.getImage("com\\neuedu\\xiaoyuer\\imgs\\bg\\bg1.png"));
    }
    public static Image get(String key){
        return map.get(key);
    }

}
