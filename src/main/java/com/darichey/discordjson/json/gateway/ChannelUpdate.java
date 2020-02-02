package com.darichey.discordjson.json.gateway;

import com.darichey.discordjson.json.ChannelData;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableChannelUpdate.class)
public interface ChannelUpdate extends Dispatch {

    @JsonUnwrapped
    ChannelData channel();
}
