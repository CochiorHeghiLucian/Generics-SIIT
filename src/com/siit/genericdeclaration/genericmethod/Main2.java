package com.siit.genericdeclaration.genericmethod;

import com.siit.genericdeclaration.generictype.Box;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Box<String>> boxList1 = new ArrayList<>();
        List<Box<Integer>> boxList2 = new ArrayList<>();
        BoxListUtil.addToBoxList(boxList1, "Ana are mere");
        BoxListUtil.addToBoxList(boxList1, "El merge");
        BoxListUtil.addToBoxList(boxList1, "seara");
        BoxListUtil.addToBoxList(boxList2, 10);

        BoxListUtil.print(boxList1);
        BoxListUtil.print(boxList2);
    }
}
