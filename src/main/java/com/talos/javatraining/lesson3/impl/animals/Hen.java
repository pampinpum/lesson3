package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Bird;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Hen extends AbstractAnimal implements Bird {

    @Override
    public List<String> getParentCharacteristics() {
        List<String> characteristics = new ArrayList<>(Bird.super.getCharacteristics());
        return characteristics;
    }

    @Override
    public void populateCharacteristics(List<String> characteristics) {
        characteristics.add("They don't fly");
    }
}
