package com.example.errorproneexample;

import androidx.annotation.NonNull;

public class CustomValue {
    private final int id;

    @NonNull
    private final String name;

    public CustomValue(final int id, @NonNull final String name) {
        this.id = id;
        this.name = name;
    }

    @NonNull
    public String getName() {
        return name;
    }
}
