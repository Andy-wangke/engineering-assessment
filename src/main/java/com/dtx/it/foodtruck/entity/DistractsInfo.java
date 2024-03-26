package com.dtx.it.foodtruck.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Andy Wang
 * @Created 2024/3/24 11:54
 */

@Data
@NoArgsConstructor
public class DistractsInfo {
    @CsvBindByName(column = "Fire Prevention Districts")
    private String firePreventionDistricts;
    @CsvBindByName(column = "Police Districts")
    private String policeDistricts;
    @CsvBindByName(column = "Supervisor Districts")
    private String supervisorDistracts;
}