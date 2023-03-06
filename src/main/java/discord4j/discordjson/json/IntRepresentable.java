package discord4j.discordjson.json;

import discord4j.discordjson.possible.Possible;
import reactor.util.annotation.Nullable;

import java.util.function.IntSupplier;

public interface IntRepresentable extends IntSupplier {
    static Possible<Integer> possible(@Nullable IntRepresentable representable) {
        return representable != null ? Possible.of(representable.getAsInt()) : Possible.absent();
    }
}
