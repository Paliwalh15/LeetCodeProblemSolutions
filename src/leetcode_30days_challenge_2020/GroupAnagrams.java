package leetcode_30days_challenge_2020;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static List<List<String>> groupAnagrams(String[] strs) {

		List<List<String>> listResult = new ArrayList<List<String>>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String str : strs) {
			char ch[] = str.toCharArray();
			Arrays.parallelSort(ch);
			String key = String.valueOf(ch);
			List<String> listString = new ArrayList<String>();
			if (map.containsKey(key)) {
				listString.add(str);
				listString.addAll(map.get(key));
				map.put(key, listString);
			} else {
				listString.add(str);
				map.put(key, listString);
			}
		}
		map.forEach((key, value) -> listResult.add(value));
		return listResult;

	}

	public static void main(String[] args) {
		String strs[] = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(groupAnagrams(strs));
	}

}
