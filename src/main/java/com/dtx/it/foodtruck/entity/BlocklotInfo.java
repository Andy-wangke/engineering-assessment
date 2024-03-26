package com.dtx.it.foodtruck.entity;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Andy Wang
 * @Created 2024/3/24 10:47
 */

@Data
@NoArgsConstructor
public class BlocklotInfo {

    @CsvBindByName(column = "blocklot")
    private String blocklot;

    @CsvBindByName(column = "block")
    private String block;

    @CsvBindByName(column = "lot")
    private String lot;

}
