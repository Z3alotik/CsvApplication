package com.company.setting.sorters;

import com.company.model.Computer;

import java.util.Comparator;
import java.util.List;

public class SortSetting {

    public List<Computer> sortByVendor(List<Computer> computers) {
        computers.sort(Comparator.comparing(Computer::getVendor));
        return computers;
    }

    public List<Computer> sortByUnits(List<Computer> computers) {
        computers.sort(Comparator.comparingDouble(Computer::getUnits));
        return computers;
    }
}
