package com.darichey.discordjson.json;

import com.darichey.discordjson.possible.Possible;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.immutables.value.Value;

@Value.Immutable
@JsonDeserialize(as = ImmutableUserModifyRequest.class)
public interface UserModifyRequest {

    Possible<String> username();
    Possible<String> avatar();
}