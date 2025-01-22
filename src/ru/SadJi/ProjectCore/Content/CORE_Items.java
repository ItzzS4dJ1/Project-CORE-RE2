package ru.SadJi.ProjectCore.Content;

import arc.graphics.Color;
import mindustry.type.Item;

public class CORE_Items {
    public static Item tisteel;

    public static void load(){

        tisteel = new Item("ti-steel",  Color.valueOf("#2c7cc7")){
            {
            explosiveness = 0.3f;
            hardness = 4;
            radioactivity = 0.4f;
            cost = 1.6f;
            healthScaling = 0.2f;
            }
        };


    }

}
