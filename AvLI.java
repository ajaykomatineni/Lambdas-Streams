import java.util.*;
import java.math.*;
import java.io.*;

public class AvLI {
	public static void main(String[] args) {
		System.out .println("calculate average of numbers");
		System.out.println("Enter length of the array?");
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int[] input = new int[len];
		for (int i = 0; i < len; i++) {
			input[i] = s.nextInt();
		}
		float average = average(input);
		System.out.println(average);
		s.close(); 
	}

	public static float average(int[] input) {
		float sum = 0f;
		for (int number : input) {
		sum = sum + number;
		}
		return sum / input.length;
	}
}