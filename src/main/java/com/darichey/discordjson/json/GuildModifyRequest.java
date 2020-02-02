package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.Optional;

@Value.Immutable
@JsonDeserialize(as = ImmutableGuildModifyRequest.class)
public interface GuildModifyRequest {

    Possible<String> name();

    Possible<String> region();

    @JsonProperty("verification_level")
    Possible<Integer> verificationLevel();

    @JsonProperty("default_message_notifications")
    Possible<Integer> defaultMessageNotifications();

    @JsonProperty("explicit_content_filter")
    Possible<Integer> explicitContentFilter();

    @JsonProperty("afk_channel_id")
    Possible<Optional<String>> afkChannelId();

    @JsonProperty("afk_timeout")
    Possible<Integer> afkTimeout();

    Possible<Optional<String>> icon();

    @JsonProperty("owner_id")
    Possible<String> ownerId();

    Possible<Optional<String>> splash();

    Possible<Optional<String>> banner();

    @JsonProperty("system_channel_id")
    Possible<String> systemChannelId();
}
