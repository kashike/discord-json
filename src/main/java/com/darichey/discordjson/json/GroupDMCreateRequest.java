package com.darichey.discordjson.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

import java.util.List;
import java.util.Map;

@Value.Immutable
@JsonDeserialize(as = ImmutableGroupDMCreateRequest.class)
public interface GroupDMCreateRequest {

    @JsonProperty("access_tokens")
    List<String> accessTokens();
    Map<String, String> nicks();
}
