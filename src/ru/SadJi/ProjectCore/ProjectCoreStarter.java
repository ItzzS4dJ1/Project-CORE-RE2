package ru.SadJi.ProjectCore;

import arc.*;
import arc.util.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import ru.SadJi.ProjectCore.Content.CORE_Items;

public class ProjectCoreStarter extends Mod{

    public ProjectCoreStarter(){
        Log.info("Project : CORE loaded.");

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            Time.runTask(10f, () -> {
                BaseDialog dialog = new BaseDialog("frog");
                dialog.cont.add("behold").row();
                //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
                dialog.cont.image(Core.atlas.find("pr-core-frog")).pad(20f).row();
                dialog.cont.button("I see", dialog::hide).size(100f, 50f);
                dialog.show();
            });
        });
    }

    @Override
    public void loadContent(){
        Log.info("CORE : Items loading...");
        CORE_Items.load();
        Log.info("Blocks loading...");

        Log.info("Projectiles loading...?");

        Log.info("Units loading...");
    }

}
