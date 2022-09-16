package Collection3;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class UseAc {
	public static void main(String[] args) {
		Ac ac1 = new Ac("Voltas", 25000, "Ac-25K");
		Ac ac2 = new Ac("Daikin", 30000, "Ac-26L");
		Ac ac3 = new Ac("Carrier", 36000, "Ac-27M");
		Ac ac4 = new Ac("Ogen", 45000, "Ac-28k");
		Ac ac5 = new Ac("Bluestar", 50000, "Ac-29V");

		HashMap<Integer, Ac> ac = new HashMap<>();
		ac.put(1, ac1);
		ac.put(2, ac2);
		ac.put(3, ac3);
		ac.put(4, ac4);
		ac.put(5, ac5);

		System.out.println("--------------Using HashMap find only array---------------------");

		System.out.println(ac);

		System.out.println("--------------Using HashMap find only Values---------------------");
		List<Ac> c = ac.values().stream().collect(Collectors.toList());
		c.forEach(x -> System.out.println(x));
		System.out.println("--------------Using HashMap Check Keyset---------------------");
		List<Integer> m = ac.keySet().stream().collect(Collectors.toList());
		m.forEach(x -> System.out.println(x));

		System.out.println("--------------Using HashMap Check Values---------------------");
		List<Ac> b = ac.values().stream().filter(x -> x.getPrice() > 25000).collect(Collectors.toList());
		b.forEach(y -> System.out.println(y));

	}

}
