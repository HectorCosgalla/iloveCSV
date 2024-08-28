package com.valcos98.ilovecsv.endpoints;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.opencsv.exceptions.CsvValidationException;
import com.valcos98.ilovecsv.csvutils.CsvProcessor;
import com.valcos98.ilovecsv.csvutils.Table;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/ilovecsv/api/v0.01")
public class CsvController<T> {

    @PostMapping(consumes = "multipart/form-data")
    public ResponseEntity<Table> fromCSVToObject(@RequestPart("file") MultipartFile csvFile) throws CsvValidationException, UnsupportedEncodingException, IOException {
        Table table = CsvProcessor.csvToObject(csvFile);
        return ResponseEntity.ok(table);
    }
}
