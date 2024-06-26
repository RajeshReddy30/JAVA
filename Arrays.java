public class Arrays {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
		char[] vowels = {'a','e','i','o','u'};
		long[] population = { 1000000000L, 2000000000L, 3000000000L, 4000000000L };
		String[] names = {"rajesh","raju","ragu"};
		System.out.println("Array length: " + numbers.length);
		System.out.println("Array length: " + vowels.length);
		System.out.println("Array length: " + population.length);
		System.out.println("Array length: " + names.length);
		for (int i = 0; i < numbers.length; i++) {
		System.out.println("Elements are :"  + numbers[i]);
        }
		for (int k = 0; k < vowels.length; k++) {
		System.out.println("Elements are :"  +vowels[k]);
		}
		for (int n = 0; n < population.length; n++) {
		System.out.println("Elements are :"  +population[n]);
		}
		for (int q = 0; q < names.length; q++) {
		System.out.println("Elements are :"  +names[q]);
		}
	}
}