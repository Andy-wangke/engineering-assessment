package com.dtx.it.foodtruck.entity.converter;

import com.dtx.it.foodtruck.entity.FoodFacilityType;
import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

/**
 * @author Andy Wang
 * @Created 2024/3/24 16:49
 */
public class PermitStatusTypeConverter extends AbstractBeanField<FoodFacilityType.PermitStatus,String> {
    @Override
    protected FoodFacilityType.PermitStatus convert(String value) throws CsvDataTypeMismatchException {
        try {
            return FoodFacilityType.PermitStatus.getByValue(value);
        } catch (IllegalArgumentException e) {
            throw new CsvDataTypeMismatchException("Invalid value for enum: " + value);
        }
    }
}
