package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank>{

	@Override
	public int compare(Bank o1, Bank o2) {
		Long l1=o1.micr;
		Long l2=o2.micr;
		return l1.compareTo(l2);
	}

}
