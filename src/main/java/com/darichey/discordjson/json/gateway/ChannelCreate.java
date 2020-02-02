package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.ChannelData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelCreate.class)
public interface ChannelCreate extends Dispatch {

    @JsonUnwrapped
    ChannelData channel();
}
