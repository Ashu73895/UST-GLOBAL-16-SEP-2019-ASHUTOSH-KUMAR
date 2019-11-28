package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByPincode implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Integer p1=o1.pincode;
		Integer p2=o2.pincode;
		return p1.compareTo(p2);
	}

}
