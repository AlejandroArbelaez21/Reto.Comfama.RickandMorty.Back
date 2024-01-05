package com.comfama.reto.api.model;

import java.util.List;

public class Response {
    private Info info;
    private Character[] results;

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public List<Character> getResults() {
        return List.of(results);
    }

    public void setResults(List<Character> results) {
        this.results = results.toArray(new Character[0]);
    }

    public Response() {
    }
}
