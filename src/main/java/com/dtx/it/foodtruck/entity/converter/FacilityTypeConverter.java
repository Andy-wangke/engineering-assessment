package com.dtx.it.foodtruck.entity.converter;

import com.dtx.it.foodtruck.entity.FoodFacilityType;
import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

/**
 * @author Andy Wang
 * @Created 2024/3/24 16:49
 */
public class FacilityTypeConverter extends AbstractBeanField<FoodFacilityType.FacilityType,String> {
    @Override
    protected FoodFacilityType.FacilityType convert(String value) throws CsvDataTypeMismatchException {
        try {
            return FoodFacilityType.FacilityType.getByValue(value);
        } catch (IllegalArgumentException e) {
            throw new CsvDataTypeMismatchException("Invalid value for enum: " + value);
        }
    }
}
