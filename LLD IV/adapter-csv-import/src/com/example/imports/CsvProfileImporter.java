package com.example.imports;

import java.nio.file.Path;

import java.util.*;

public class CsvProfileImporter implements ProfileImporter{
    NaiveCsvReader nCsvReader;
    ProfileService profileService;

    public CsvProfileImporter(NaiveCsvReader nCsvReader,ProfileService profileService){
        this.nCsvReader=nCsvReader;
        this.profileService=profileService;
    }

    @Override
    public int importFrom(Path csvFile) {
        int count=0;
        List<String[]> file=nCsvReader.read(csvFile);
        for(String[] data:file){
            if(data.length<2){
                throw new IllegalArgumentException("Invalid number of columns");
            }
    
            String id=data[0].trim();
            String email=data[1].trim();
            String displayName=data[2].trim();
            if(id.isEmpty()||email.isEmpty()){
                throw new IllegalArgumentException("Id or Email can't be empty");
            }
            try {
                profileService.createProfile(id, email, displayName);
                count++;
            } catch (Exception e) {
               System.out.println("Illegal Arrgument"+e.getMessage());
            }
        }
        return count;
    }
}
