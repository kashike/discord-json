package com.darichey.discordjson.json.gateway;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableHeartbeat.class)
@JsonSerialize(converter = HeartbeatConverter.class)
public interface Heartbeat extends PayloadData {

    int seq();
}
