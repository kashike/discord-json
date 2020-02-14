package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableGroupAddRecipientRequest.class)
public interface GroupAddRecipientRequest {

    @JsonProperty("access_token")
    String accessToken();
    String nick();
}