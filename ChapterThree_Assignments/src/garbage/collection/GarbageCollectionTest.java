package garbage.collection;

import java.util.ArrayList;
import java.util.Date;

public class GarbageCollectionTest {

	GarbageCollectionTest test;

	int[][] array = new int[100][100];

	ArrayList arrayList = new ArrayList<>();

	public GarbageCollectionTest(String identifier) {
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				array[i][j] = 1000;
				arrayList.add(new Date());
			}
		}
	}

	public void setTest(GarbageCollectionTest test) {
		this.test = test;
	}

	public static void main(String[] args) {

		System.out.println("Total JVM Memory at start: "
				+ Runtime.getRuntime().totalMemory());
		System.out.println("Available JVM Memory at start: "
				+ Runtime.getRuntime().freeMemory());
		System.out.println();
		GarbageCollectionTest t1 = new GarbageCollectionTest("t1");
		GarbageCollectionTest t2 = new GarbageCollectionTest("t2");
		GarbageCollectionTest t3 = new GarbageCollectionTest("t3");

		t1.setTest(t2);
		t2.setTest(t3);
		t3.setTest(t1);

		System.out.println("Total JVM Memory after assignments: "
				+ Runtime.getRuntime().totalMemory());
		System.out.println("Available JVM Memory after assignments: "
				+ Runtime.getRuntime().freeMemory());
		System.out.println();
		t1 = null;
		t2 = null;
		t3 = null;

		Runtime.getRuntime().gc();

		System.out.println("Total JVM Memory after gc(): "
				+ Runtime.getRuntime().totalMemory());
		System.out.println("Available JVM Memory after gc(): "
				+ Runtime.getRuntime().freeMemory());

		/**
		 * After this point, all of the three object are lost so are eligible
		 * for garbage collection
		 */
	}
}
