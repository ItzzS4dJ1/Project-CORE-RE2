package ru.SadJi.ProjectCore.Content;

import arc.graphics.g2d.TextureRegion;
import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.entities.bullet.BasicBulletType;
import mindustry.entities.bullet.BulletType;
import mindustry.gen.*;
import mindustry.type.UnitType;
import mindustry.type.Weapon;
import mindustry.type.ammo.ItemAmmoType;
import mindustry.ai.types.*;

public class CORE_Units {
    public static UnitType shade;
    public static void load(){
        shade = new UnitType("shade"){{
            aiController = SuicideAI::new;
            constructor = UnitEntity::create;

            speed = 2f;
            hitSize = 8f;
            health = 350;
            mechSideSway = 0.25f;
            range = 40f;
            ammoType = new ItemAmmoType(Items.lead);

            outlines = false;

            engineSize = 0.1f;
            engineOffset = 0.2f;


            weapons.add(new Weapon(){{

                flying = true;
                shootOnDeath = true;
                reload = 24f;
                shootCone = 180f;
                ejectEffect = Fx.none;
                shootSound = Sounds.explosion;
                x = shootY = 0f;
                mirror = false;
                bullet = new BulletType(){{
                    collidesTiles = false;
                    collides = false;
                    hitSound = Sounds.explosion;

                    rangeOverride = 30f;
                    hitEffect = Fx.pulverize;
                    speed = 0f;
                    splashDamageRadius = 55f;
                    instantDisappear = true;
                    splashDamage = 90f;
                    killShooter = true;
                    hittable = false;
                    collidesAir = true;
                }};
            }});
            weapons.add(new Weapon("small-chain-gun"){{
                flipSprite = true;
                reload = 6f;
                recoil = 5f;
                x = 4f;
                y = 2f;
                top = true;
                ejectEffect = Fx.casing1;
                bullet = new BasicBulletType(3f, 1f){{
                    width = 3f;
                    height = 5f;
                    lifetime = 90f;
                }};
            }});
    }};}

}
