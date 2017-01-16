package me.philippheuer.twitch4j.model;

import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import lombok.*;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Subscription {

	@JsonProperty("_id")
	private Long id;

    private Optional<Date> createdAt;

    private Optional<Integer> streak;

    private Optional<String> message;

    private Optional<Boolean> isPrimeSub;

	private User user;

	private Channel channel;
}
