package StructuralPatterns.Bridge.Buildings;

import StructuralPatterns.Bridge.Brand;
import StructuralPatterns.Bridge.Building;

public class –°ountryHouse extends Building {
    public –°ountryHouse(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("–°ountry House");
    }
}
