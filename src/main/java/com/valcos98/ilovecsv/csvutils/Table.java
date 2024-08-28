package com.valcos98.ilovecsv.csvutils;

import java.util.ArrayList;
import java.util.List;

public class Table {
    private List<Rows> rows;
    
    public Table(){
        this.rows = new ArrayList<>();
    }

    public List<Rows> getRows() {
        return rows;
    }

    public void setRows(Rows rows) {
        this.rows.add(rows);
    }
}
