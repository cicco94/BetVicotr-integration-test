package com.betVictor.challenge.restService.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class GenericRecord {
    private String _id;
    private String content;

    @Override
    public String toString() {
        return "{_id: " + _id + ", content: '" + content + "'}";
    }

    public String toJson(){ return toString(); }
}
