package com.valcos98.ilovecsv.csvutils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.springframework.web.multipart.MultipartFile;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class CsvProcessor {

    public static Table csvToObject(MultipartFile csvFile) throws UnsupportedEncodingException, IOException, CsvValidationException{
        Table table = new Table();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(csvFile.getInputStream(),"UTF-8"));
        CSVReader csvReader = new CSVReader(bufferedReader);
        String[] nextLine;
        while ((nextLine = csvReader.readNext()) != null) {
            Rows row = new Rows();
            for (String singleField : nextLine) {
                row.setContent(singleField);
            }
            table.setRows(row);
        }
        csvReader.close(); 
        return table;
    }
}
