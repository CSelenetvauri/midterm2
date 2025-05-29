package oop.mid2.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * The Lists class contains a program that creates and manipulates three lists based on a specific mapping logic.
 * <p>
 * The program initializes two lists:
 * - `list1` contains integer values that are used to generate indices for retrieving values from the second list.
 * - `list2` contains string values, from which we extract the values based on calculated indices derived from `list1`.
 * </p>
 * <p>
 * The program calculates indices using the formula (list1[i] * 2) - 1 and retrieves corresponding values from `list2`.
 * These values are then stored in `list3`, which is the initial list created.
 * </p>
 * <p>
 * After populating `list3`, the program performs an additional step where:
 * - The element at index 0 is removed.
 * - The rest of the elements are shifted left by one position.
 * - The element at index 1 is removed, and the process repeats until only a few elements remain.
 * </p>
 *
 * <h2>Program Flow:</h2>
 * <ul>
 * <li>list1 values are used to calculate indices for list2 using the formula: index_in_list2 = (list1.get(i) * 2) - 1;</li>
 * <li>Values from list2 at the calculated indices are added to list3 at the corresponding index.</li>
 * <li>Once list3 is populated, elements are removed from the front of the list, one by one, while shifting the remaining elements to the left.</li>
 * </ul>
 *
 * <h3>Example:</h3>
 * <pre>
 * list1 = [5, 8, 9, 5, 2, 3, 2, 3, 9, 4, 8, 9, 4]
 * list2 = ["XTYoX", "dsh", "9TUWT", "5Z5s", "oJWwW", "4R2F", "yhX", "cSI6", "Lf2z", "wWE", "xldV", "do9", "s5ZV", "8j6c", "X9bkO", "p584", "FBUgl", "cCCjI"]
 *
 * For index 0 in list1, the value is 5. The formula gives (5 * 2) - 1 = 9, so we take the value at index 9 of list2, which is "wWE".
 * </pre>
 *
 * <h2>Output Example:</h2>
 * <pre>
 * List3:
 * p584
 * wWE
 * 4R2F
 * 4R2F
 * cSI6
 * cCCjI
 * </pre>
 *
 * <h3>Note:</h3>
 * <p>The program dynamically computes values for list3 based on the contents of list1 and list2 and then adjusts list3 by removing elements from the front.</p>
 *
 * @author Elene Tvauri
 * @version 1.1
 * @since 2025-05-15
 */
public class Lists {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(8);
        list1.add(9);
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(3);
        list1.add(9);
        list1.add(4);
        list1.add(8);
        list1.add(9);
        list1.add(4);

        List<String> list2 = new ArrayList<>();
        list2.add("XTYoX");
        list2.add("dsh");
        list2.add("9TUWT");
        list2.add("5Z5s");
        list2.add("oJWwW");
        list2.add("4R2F");
        list2.add("yhX");
        list2.add("cSI6");
        list2.add("Lf2z");
        list2.add("wWE");
        list2.add("xldV");
        list2.add("do9");
        list2.add("s5ZV");
        list2.add("8j6c");
        list2.add("X9bkO");
        list2.add("p584");
        list2.add("FBUgl");
        list2.add("cCCjI");

        List<String> list3 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            int indexInList2 = (list1.get(i) * 2) - 1;
            String valueFromList2 = list2.get(indexInList2);
            list3.add(valueFromList2);
        }

        while (list3.size() > 6) {
            list3.remove(0);
            list3.remove(1);
        }

        System.out.println("List3:");
        for (String value : list3) {
            System.out.println(value);
        }
    }
}
