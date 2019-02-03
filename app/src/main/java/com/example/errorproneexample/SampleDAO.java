package com.example.errorproneexample;

import androidx.annotation.Nullable;

public class SampleDAO {
    @Nullable
    public CustomValue getValueWithId(final int id) {
        // this is just a sample - so return a new object...
        return new CustomValue(id, "Test");
    }
}
