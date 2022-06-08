package net.parrie43.ambientworld.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum FlamingoVariant {
    DEFAULT(0),
    WHITE(1),
    RED(2),
    DARK_EYED(3);

    private static final FlamingoVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(FlamingoVariant::getId)).toArray(FlamingoVariant[]::new);
    private final int id;

    FlamingoVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static FlamingoVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
