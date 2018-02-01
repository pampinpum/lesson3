package com.talos.javatraining.lesson3;

import org.apache.commons.lang3.StringUtils;

import java.util.List;



public interface Animal {

    default String getName() {
        return getClass().getSimpleName();
    }

    List<String> getCharacteristics();

    default String getFullDescription() {
        StringBuilder builder = new StringBuilder();
        String name = getName();
        String lastChr = name.substring(name.length() - 1);
        builder.append(name).append(lastChr.equals("s") ? "es" : "s").append(" have these characteristics :");
        for (String characteristic : getCharacteristics()) {
            builder.append(StringUtils.LF).append(StringUtils.CR).append("- ").append(characteristic);
        }
        return builder.toString();
    }

    static Animal create(String name) {
        try {
            if (!name.equals(null))
                try {
                    return (Animal) Class.forName("com.talos.javatraining.lesson3.impl.animals." + name).newInstance();
                } catch (ClassCastException e){
                return null;
                }
            else
                return null;
        } catch (InstantiationException e) {
            e.printStackTrace();
            return null;
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

}
