package com.epam.university.java.core.task003;

import com.epam.university.java.core.utils.Validator;

public class MappingOperationImpl implements MappingOperation {
    @Override
    public String map(String source) {
        if (source == null) {
            throw new IllegalArgumentException(Validator.messageForSourceIfNull);
        }
        return new StringBuilder(source).reverse().toString();
    }
}