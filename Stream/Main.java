package Stream;// Java 프로그래밍 - 스트림

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// 스트림 ? 배열 컬렉션등의 데이터를 하나씩 참조하여 처리 가능한 기능
// for 문의 사용을 줄여 코드 간결성 확보
// Stream 생성 -> 중개 연산 -> 최종 연산의 순으로 진행
public class Main {

    public static void main(String[] args) {

//      1. 스트림 생성

//      1-1. 배열 스트림
        System.out.println("== 배열 스트림 == ");
        String[] arr = new String[]{"a", "b", "c"};

        //기존의 출력 방법
        System.out.println("== fori ==");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("== forEach ==");
        for (String item: arr) {
            System.out.println(item);
        }

        //스트림 출력
        System.out.println("== to Stream ==");
        Stream stream1 = Arrays.stream(arr);
        stream1.forEach(System.out::println); //각 원소 출력

//      1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);

        System.out.println("== to Stream ==");
        Stream stream2 = list1.stream();
//        stream2.forEach(System.out::println);
        stream2.forEach(num -> System.out.println("num= "+num));

//      1-3. 스트림 builder
        System.out.println("== 스트림 builder ==");
        Stream streamBuilder = Stream.builder().add(1).add(2).add(3).build();
        streamBuilder.forEach(System.out::println);

//      1-4. 스트림 generate
        System.out.println("== 스트림 generate ==");
        //3번 만큼 반복해서 abc 생성
        Stream streamGenerator = Stream.generate(() -> "abc").limit(3);
        streamGenerator.forEach(System.out::println);

//      1-5. 스트림 iterate
        System.out.println("== 스트림 iterate ==");
        //10, 10 * 2 , 20 * 2 의 값 을 3번 대입
        Stream streamIterator = Stream.iterate(10,n -> n * 2).limit(3);
        streamIterator.forEach(System.out::println);


//      1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림 ==");
        IntStream intStream = IntStream.range(1,5);
        intStream.forEach(System.out::println);


//      2. 스트림 중개 연산
//      2-1. Filtering
        System.out.println("== Filtering ==");
        //각각의 원소에 대해 필터링
        IntStream intStream2 = IntStream.range(1,10).filter(n -> n % 2 == 0);
        intStream2.forEach(System.out::println);


//      2-2. Mapping
        System.out.println("== Mapping ==");
        // 각각의 원소에 대해 연산시행
        IntStream intStream3 = IntStream.range(1,10).map(n -> n+1);
        intStream3.forEach(n -> System.out.println(n+" "));
        System.out.println();


//      2-3. Sorting
        System.out.println("== Sorting ==");
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(2).add(3).add(4).build();
        IntStream intStreamSort = intStream4.sorted();
        intStreamSort.forEach(System.out::println);


//      3. 최종 연산
//      3-1. Sum, Average
        System.out.println("== sum, average ==");
        int sum = IntStream.range(1,5).sum();
        System.out.println("sum = " + sum);
        double avg = IntStream.range(1,5).average().getAsDouble();
        System.out.println("avg = " + avg);

//      3-2. Min, Max
        System.out.println("== min, max ==");
        int min = IntStream.range(1,5).min().getAsInt();
        System.out.println("min = " + min);
        int max = IntStream.range(1,5).max().getAsInt();
        System.out.println("max = " + max);


//      3-3. reduce
        System.out.println("== reduce ==");
        Stream<Integer> stream3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)).stream();
        System.out.println(stream3.reduce((x,y) -> x+y).get()); //연쇄적인 합을 통해 계산


//      3-4. forEach
        System.out.println("== forEach == ");
        IntStream.range(1,10).filter(n -> n == 5).forEach(System.out::println);


    }
}


