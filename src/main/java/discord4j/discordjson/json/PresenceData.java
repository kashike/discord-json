package discord4j.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import discord4j.discordjson.possible.Possible;
import org.immutables.value.Value;

import java.util.List;
import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutablePresenceData.class)
public interface PresenceData {

    PartialUserData user();

    List<String> roles();

    Optional<ActivityData> game();

    String status();

    List<ActivityData> activities();

    @JsonProperty("client_status")
    ClientStatusData clientStatus();

    @JsonProperty("premium_since")
    default Possible<Optional<String>> premiumSince() { return Possible.absent(); }

    default Possible<Optional<String>> nick() { return Possible.absent(); }
}