package net.parrie43.ambientworld.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum HippoVariant {
    DEFAULT(0),
    PALE(1);

    private static final HippoVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(HippoVariant::getId)).toArray(HippoVariant[]::new);
    private final int id;

    HippoVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static HippoVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
