package com.java_oop.service;

import com.java_oop.logic.JavaSort;
import com.java_oop.logic.Sort;

import java.util.List;

public class SortService {
    public List<String> doSort(List<String> list){
        Sort<String> sort = new JavaSort<>();
        return sort.sort(list);
    }
}
