package EternalStream;

import java.util.stream.Stream;

public class EternalStream {
    public static Stream<Long> linearCongruentialGenerator(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> (a * x + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomStream = linearCongruentialGenerator(a, c, m, System.nanoTime());

        randomStream.limit(10)
                .forEach(System.out::println);
    }
}

