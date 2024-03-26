package com.dtx.it.foodtruck.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

/**
 * @author Andy Wang
 * @Created 2024/3/24 10:47
 */

@Data
@NoArgsConstructor
public class GeoLocationInfo {

    @CsvBindByName(column = "Latitude")
    private String latitude;

    @CsvBindByName(column = "Longitude")
    private String longitude;

    @CsvBindByName(column = "X")
    private String x;

    @CsvBindByName(column = "Y")
    private String y;
}
