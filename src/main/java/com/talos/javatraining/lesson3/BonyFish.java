package com.talos.javatraining.lesson3;

import com.talos.javatraining.lesson3.impl.animals.Worm;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public interface BonyFish extends Fish {

    default List<String> getCharacteristics()
    {
        List<String> characteristics = new ArrayList<>(Fish.super.getCharacteristics());
        characteristics.add("They have skeletons primarily composed of bone tissue");
        return characteristics;
    }

}
