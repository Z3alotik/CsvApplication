package com.company;

import com.company.csv.reader.CsvParser;
import com.company.csv.reader.CsvParserImpl;
import com.company.html.generator.HtmlGenerator;
import com.company.model.Computer;
import com.company.setting.counters.ShareCounter;
import com.company.setting.filters.FilterSetting;
import com.company.setting.sorters.SortSetting;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        String fileName = "C:\\Users\\martin.bartosek\\Desktop\\data.csv";

        CsvParser<Computer> csvParser = new CsvParserImpl();
        HtmlGenerator htmlGenerator = new HtmlGenerator();
        SortSetting sorter = new SortSetting();
        FilterSetting filter = new FilterSetting();
        ShareCounter shareCounter = new ShareCounter();


        //Parse CSV to Java object and generate table in HTML
        htmlGenerator.generateComputerReport(csvParser.parse(fileName));

        //Get rows where information about a given vendor are situated (shown in console)
//        sorter.getVendorRows(csvParser.parse(fileName), "Acer");

        //Sort by method of your choice (vendor/units) and generate HTML
//        htmlGenerator.generateComputerReport(sorter.sortByVendor(csvParser.parse(fileName)));
//        htmlGenerator.generateComputerReport(sorter.sortByUnits(csvParser.parse(fileName)));
    }
}
