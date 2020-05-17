package com.betVictor.challenge.restService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class SystemVersion {
    private final String dbServiceVersion, restServiceVersion, uiHandlerServiceVersion, webSocketServiceVersion;
}
