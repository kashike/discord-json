/**
 * Data objects for JSON representation across Discord.
 */
@Value.Style(
        jdkOnly = true,
        allParameters = true,
        defaults = @Value.Immutable(
                copy = false
        ),
        defaultAsDefault = true
)
@NonNullApi
package discord4j.discordjson.json;

import org.immutables.value.Value;
import reactor.util.annotation.NonNullApi;