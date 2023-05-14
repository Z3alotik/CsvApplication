package com.company.csv.reader;

import java.io.FileNotFoundException;
import java.util.List;

public interface CsvParser<T> {

    List<T> parse(String fileName) throws FileNotFoundException;
}
