package com.levermann;

import javafx.beans.property.Property;
import javafx.beans.property.ReadOnlyObjectProperty;
import javafx.beans.value.WritableObjectValue;


public abstract class Mapping<T> extends ReadOnlyObjectProperty<T>
        implements Property<T>, WritableObjectValue<T> {

    /**
     * {@inheritDoc}
     */
    @Override
    public void setValue(T v) {
        set(v);
    }
}
