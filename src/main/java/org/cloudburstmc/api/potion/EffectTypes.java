package org.cloudburstmc.api.potion;

import com.nukkitx.math.vector.Vector3i;
import lombok.experimental.UtilityClass;
import org.cloudburstmc.api.util.Identifiers;

@UtilityClass
public class EffectTypes {

    public final static EffectType SWIFTNESS = new EffectType(Identifiers.SPEED, Vector3i.from(124, 175, 198));
    public final static EffectType SLOWNESS = new EffectType(Identifiers.SLOWNESS, Vector3i.from(90, 108, 129), true);
    public final static EffectType HASTE = new EffectType(Identifiers.HASTE, Vector3i.from(217, 192, 67));
    public final static EffectType MINING_FATIGUE = new EffectType(Identifiers.MINING_FATIGUE, Vector3i.from(74, 66, 23), true);
    public final static EffectType STRENGTH = new EffectType(Identifiers.STRENGTH, Vector3i.from(147, 36, 35));
    public final static EffectType HEALING = new EffectType(Identifiers.HEALING, Vector3i.from(248, 36, 35));
    public final static EffectType HARMING = new EffectType(Identifiers.HARMING, Vector3i.from(67, 10, 9), true);
    public final static EffectType JUMP_BOOST = new EffectType(Identifiers.JUMP_BOOST, Vector3i.from(34, 255, 76));
    public final static EffectType NAUSEA = new EffectType(Identifiers.NAUSEA, Vector3i.from(85, 29, 74), true);
    public final static EffectType REGENERATION = new EffectType(Identifiers.REGENERATION, Vector3i.from(205, 92, 171));
    public final static EffectType DAMAGE_RESISTANCE = new EffectType(Identifiers.DAMAGE_RESISTANCE, Vector3i.from(153, 69, 58));
    public final static EffectType FIRE_RESISTANCE = new EffectType(Identifiers.FIRE_RESISTANCE, Vector3i.from(228, 157, 58));
    public final static EffectType WATER_BREATHING = new EffectType(Identifiers.WATER_BREATHING, Vector3i.from(46, 82, 153));
    public final static EffectType INVISIBILITY = new EffectType(Identifiers.INVISIBILITY, Vector3i.from(127, 131, 146));
    public final static EffectType BLINDNESS = new EffectType(Identifiers.BLINDNESS, Vector3i.from(191, 192, 192));
    public final static EffectType NIGHT_VISION = new EffectType(Identifiers.NIGHT_VISION, Vector3i.from(0, 0, 139));
    public final static EffectType HUNGER = new EffectType(Identifiers.HUNGER, Vector3i.from(46, 139, 87));
    public final static EffectType WEAKNESS = new EffectType(Identifiers.WEAKNESS, Vector3i.from(72, 77, 72), true);
    public final static EffectType POISON = new EffectType(Identifiers.POISON, Vector3i.from(78, 147, 49), true);
    public final static EffectType WITHER = new EffectType(Identifiers.WITHER, Vector3i.from(53, 42, 39), true);
    public final static EffectType HEALTH_BOOST = new EffectType(Identifiers.HEALTH_BOOST, Vector3i.from(248, 125, 35));
    public final static EffectType ABSORPTION = new EffectType(Identifiers.ABSORPTION, Vector3i.from(36, 107, 251));
    public final static EffectType SATURATION = new EffectType(Identifiers.SATURATION, Vector3i.from(255, 0, 255));
    public final static EffectType LEVITATION = new EffectType(Identifiers.LEVITATION, Vector3i.from(206, 255, 255));
    public final static EffectType FATAL_POISON = new EffectType(Identifiers.FATAL_POISON, Vector3i.from(78, 147, 49), true);
    public final static EffectType CONDUIT_POWER = new EffectType(Identifiers.CONDUIT_POWER, Vector3i.from(29, 194, 209));
    public final static EffectType SLOW_FALLING = new EffectType(Identifiers.SLOW_FALLING, Vector3i.from(206, 255, 255));
    public final static EffectType BAD_OMEN = new EffectType(Identifiers.BAD_OMEN, Vector3i.from(11, 97, 56));
    public final static EffectType HERO_OF_THE_VILLAGE = new EffectType(Identifiers.HERO_OF_THE_VILLAGE, Vector3i.from(0, 0, 0));

}
