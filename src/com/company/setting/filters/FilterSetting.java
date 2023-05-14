package com.company.setting.filters;

import com.company.model.Computer;

import java.util.ArrayList;
import java.util.List;

public class FilterSetting {

    public void getVendorRows(List<Computer> computers, String vendorName) {
        List<Integer> rowIndexList = new ArrayList<>();
        for (int i = 0; i < computers.size(); i++) {
            Computer computer = computers.get(i);
            if (computer.getVendor().equalsIgnoreCase(vendorName)) {
                rowIndexList.add(i);
            }
        }
        System.out.println("Information about " + vendorName + " " + "is on these rows:" + " " + rowIndexList);
    }
}
