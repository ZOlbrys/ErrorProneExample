package com.example.errorproneexample;

import android.util.Log;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SampleClass {
    @NonNull
    private final SampleDAO dao;

    @Nullable
    private CustomValue value;

    public SampleClass(@NonNull final SampleDAO dao) {
        this.dao = dao;
    }

    public void doSomething() {
        value = dao.getValueWithId(1);

        Objects.requireNonNull(value, "value is null!");

        final String name = value.getName();

        Log.d("ZAO", name);
    }
}
