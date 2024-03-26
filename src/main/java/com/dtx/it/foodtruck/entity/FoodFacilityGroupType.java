package com.dtx.it.foodtruck.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andy Wang
 * @Created 2024/3/24 19:56
 */
public class FoodFacilityGroupType {

    private List<FoodFacilityType> foodFacilityList;


    public List<FoodFacilityType> getFoodFacilityList() {
        if(this.foodFacilityList==null || this.foodFacilityList.isEmpty())
            this.foodFacilityList = new ArrayList<>();
        return this.foodFacilityList;
    }
}
