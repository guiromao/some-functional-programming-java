package co.trucom.functional;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Functional {

	public static void main(String [] args) {
		Function<String, Long> stringDouble = (str) -> {
			Long result = Long.valueOf(str);
			return result * 2;
		};

		Long value = stringDouble.apply("1234");
		System.out.println("Doubling long value of string \"1234\": " + value);

		Predicate<Integer> isEven = (num) -> num % 2 == 0;
		System.out.println("19 is even: " + isEven.test(19));

		Supplier<String> chooseColor = () -> {
			List<String> colors = List.of("Red", "Green", "Yellow", "Blue", "Black", "White", "Pink", "Yellow");
			int number = (int) Math.round(Math.random() * (colors.size() - 1));
			return colors.get(number);
		};
		System.out.println("Choosing random color: " + chooseColor.get());

		Consumer<Integer> square = (num) -> 
			System.out.println("Square of " + num + ": " + (int) Math.pow(num, 2));
		square.accept(16);

		UnaryOperator<Integer> doubleValue = (num) -> num * 2;
		System.out.println("Double of 987: " + doubleValue.apply(987));

		BinaryOperator<Integer> sum = (x, y) -> x + y;
		System.out.println("Sum of 15 and 762: "  + sum.apply(15,  762));

	}

}
