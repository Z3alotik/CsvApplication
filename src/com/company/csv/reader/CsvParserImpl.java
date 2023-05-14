package com.company.csv.reader;

import com.company.model.Computer;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class CsvParserImpl implements CsvParser<Computer>{

    public List<Computer> parse(String fileName) throws FileNotFoundException {
        CsvToBeanBuilder<Computer> builder = new CsvToBeanBuilder<>(new FileReader(fileName));
        return builder
                .withType(Computer.class)
                .build()
                .parse();
    }
}
