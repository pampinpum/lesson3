package com.talos.javatraining.lesson3.impl.animals;

import com.talos.javatraining.lesson3.Amphibian;
import com.talos.javatraining.lesson3.impl.AbstractAnimal;

import java.util.ArrayList;
import java.util.List;


public class Frog extends AbstractAnimal implements Amphibian {

    @Override
    public List<String> getParentCharacteristics() {
        List<String> characteristics = new ArrayList<>(Amphibian.super.getCharacteristics());
        return characteristics;
    }

    @Override
    public void populateCharacteristics(List<String> characteristics) {
        characteristics.add("They croak");
    }
}
