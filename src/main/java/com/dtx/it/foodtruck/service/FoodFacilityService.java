package com.dtx.it.foodtruck.service;

import com.dtx.it.foodtruck.exception.FetchException;
import com.dtx.it.foodtruck.component.CsvFileParser;
import com.dtx.it.foodtruck.entity.FoodFacilityType;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

@Component
public class FoodFacilityService {

    @Autowired
    private CsvFileParser csvFileParser;

    //TODO Optional Null check
    public final LoadingCache<String, List<FoodFacilityType>> foodFacilityLoadingCache = CacheBuilder.newBuilder()
            .initialCapacity(1_000_000)
            .expireAfterWrite(24, TimeUnit.HOURS)
            .build(
                    new CacheLoader<String, List<FoodFacilityType>>() {
                        @Override
                        public List<FoodFacilityType> load(String filePath)  {
                            return csvFileParser.readCsvData(filePath);
                        }
                    });

    public List<FoodFacilityType> getAll(){
        URL filePath = CsvFileParser.class.getClassLoader().getResource("data/Mobile_Food_Facility_Permit.csv");
        List<FoodFacilityType> foodFacilityList = null;
        try {
            foodFacilityList = foodFacilityLoadingCache.get(filePath.getPath());
        } catch (ExecutionException e) {
            System.err.println("Fetch Food Facility Data Failed. "+e.getMessage());
            throw new FetchException("Fetch Food Facility Data Failed. "+e.getMessage());
        }
        return foodFacilityList;
    }

    public List<FoodFacilityType> getByApplicant(String applicantName){

        return null;
    }
    


}
