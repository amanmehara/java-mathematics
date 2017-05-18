package com.amanmehara.mathematics;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by Aman on 18-05-2017.
 */
public class Progressions {

    public static final Function<Integer,BiFunction<Integer,Integer,List<Integer>>> ARITHMETIC_PROGRESSION
            = terms -> (firstTerm, commonDifference) -> IntStream
            .range(0,terms)
            .boxed()
            .map(operand -> firstTerm + operand * commonDifference)
            .collect(Collectors.toList());

    public static final Function<Integer,BiFunction<Long,Long,List<Integer>>> GEOMETRIC_PROGRESSION
            = terms -> (firstTerm, commonRatio) -> IntStream
            .range(0,terms)
            .boxed()
            .map(operand -> firstTerm * Math.pow(commonRatio , operand))
            .map(Double::intValue)
            .collect(Collectors.toList());

}
