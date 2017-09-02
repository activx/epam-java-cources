package com.epam.university.java.core.task002;

import java.util.Arrays;

/**
 * @author Александр
 */
public class Task002Impl implements Task002{

    /**
     * Check if strings are equals.
     *
     * @param firstString  first string instance
     * @param secondString second string instance
     * @return if string are equals
     * @throws IllegalArgumentException if strings not provided
     */
    @Override
    public boolean isEquals(String firstString, String secondString) {
        argumentsNotNull(firstString, secondString);
        return firstString.equals(secondString);
    }

    /**
     * Get most left @{number} of symbols.
     *
     * @param sourceString source string
     * @param number       amount of symbols to return
     * @return new string
     * @throws IllegalArgumentException if string not provided or number less then zero
     */
    @Override
    public String left(String sourceString, int number) {
        if (sourceString == null || number < 0){
            throw new IllegalArgumentException();
        }
        if (number > sourceString.length()){
            return sourceString;
        }
        return sourceString.substring(0,number);
    }

    /**
     * Get most right @{number} of symbols.
     *
     * @param sourceString source string
     * @param number       amount of symbols to return
     * @return new string
     * @throws IllegalArgumentException if string not provided or number less then zero
     */
    @Override
    public String right(String sourceString, int number) {
        if (sourceString == null || number < 0){
            throw new IllegalArgumentException();
        }
        if (number > sourceString.length()){
            return sourceString;
        }
        return sourceString.substring(
                sourceString.length() - number,
                sourceString.length()
        );
    }

    /**
     * Get the characters before separator.
     *
     * @param sourceString source string
     * @param separator    separator
     * @return characters before separator
     * @throws IllegalArgumentException if strings not provided
     */
    @Override
    public String left(String sourceString, String separator) {
        argumentsNotNull(sourceString, separator);
        int endIndex = sourceString.indexOf(separator, 0);
        return sourceString.substring(0,endIndex);

    }

    /**
     * Get the characters after separator.
     *
     * @param sourceString source string
     * @param separator    separator
     * @return characters after separator
     * @throws IllegalArgumentException if strings not provided
     */
    @Override
    public String right(String sourceString, String separator) {
        argumentsNotNull(sourceString, separator);
        int startIndex = sourceString.indexOf(separator, 0);
        return sourceString.substring(startIndex+separator.length(),sourceString.length());
    }

    /**
     * Split source string by split character.
     *
     * @param sourceString source string
     * @param split        character to split for
     * @return array of parts
     * @throws IllegalArgumentException if strings not provided
     */
    @Override
    public String[] split(String sourceString, String split) {
        argumentsNotNull(sourceString, split);
        return sourceString.split(split);
    }

    /**
     * Connect array of strings with glue
     *
     * @param sourceCollection collection of strings
     * @param glue             glue character
     * @return result string
     * @throws IllegalArgumentException if strings not provided
     */
    @Override
    public String join(String[] sourceCollection, String glue) {
        argumentsNotNull(sourceCollection, glue);
        return String.join(glue,sourceCollection);
    }

    private void argumentsNotNull(Object... objs){
        for(Object obj : objs){
            if (obj == null){
                throw new IllegalArgumentException();
            }
        }
    }
}