package com.valcos98.ilovecsv.csvutils;

import java.util.ArrayList;
import java.util.List;

public class Rows {
    private List<String> fields;

    public Rows(){
        this.fields = new ArrayList<>();
    }

    public List<String> getContent(){
        return this.fields;
    }

    public void setContent(String newContent){
        this.fields.add(newContent);
    }
}
