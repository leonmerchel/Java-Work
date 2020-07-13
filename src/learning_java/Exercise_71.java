package learning_java;

import java.util.*;

public class Exercise_71 {
	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		list1.add(4);
		list1.add(3);
		list2.add(5);
		list2.add(10);
		list2.add(4);
		list2.add(7);

		System.out.println("Before smartCombine:");
		System.out.println(list1);
		System.out.println(list2);

		SmartCombine(list1, list2);

		System.out.println("After smartCombine:");
		System.out.println(list1);
		System.out.println(list2);
	}

	public static void SmartCombine(ArrayList<Integer> listToAddTo, ArrayList<Integer> listFromWhichWeAdd) {

		for (int elemToBeAdded : listFromWhichWeAdd) {

			int elemToBeAdded1 = elemToBeAdded;

//			System.out.println("checking element:" + elemToBeAdded1);
			boolean flag = false;
			for (int elementToCompare : listToAddTo) {
//				System.out.println("comparing to:" + elementToCompare + "->" + (elemToBeAdded1 == elementToCompare));
				if (elemToBeAdded1 == elementToCompare) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				listToAddTo.add(elemToBeAdded1);
			}

		}

	}

}
