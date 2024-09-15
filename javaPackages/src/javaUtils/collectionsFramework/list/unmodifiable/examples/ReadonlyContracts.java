
package javaUtils.collectionsFramework.list.unmodifiable.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadonlyContracts {

    public List<String> getData() {
        List<String> originalData = new ArrayList<>();
        originalData.add("data1");
        originalData.add("data2");

        // Return an unmodifiable view of the data
        return Collections.unmodifiableList(originalData);
    }

    public static void main(String[] args) {
        System.out.println(new ReadonlyContracts().getData());
    }
}
