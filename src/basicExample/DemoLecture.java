
package basicExample;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DemoLecture {

	public static void main(String[] args) {
		LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<>() {
			@Override
			protected boolean removeEldestEntry(Map.Entry<Integer, Integer> remove) {
				return size() > 4;
			}
		};
		linkedHashMap.put(1, 101);
		linkedHashMap.put(2, 102);
		linkedHashMap.put(3, 103);
		linkedHashMap.put(4, 104);
		linkedHashMap.put(5, 104);

		System.out.println(linkedHashMap);
		Set<Entry<Integer, Integer>> entrySet = linkedHashMap.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
	}

}
