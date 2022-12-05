# streams-api

## Declaration of a stream
you will need to use a collection before to set a stream from.
ex : List number = Arrays.asList(1,2,3,4,5)
          number.stream()

## Intermediate operation

There are 3 basics kinds of intermediate operation
1. map
    number.stream().map(x -> x +1)
2. filter
    number.stream().filter(x -> x > 2)
3. sorted
    number.stream().sorted()

## Terminal operation

1. collect
   number.stream().map(x -> x +1)
         .collect(Collectors.toList())
you can use a List or a Set whatever from the collection api.
2. forEach
   number.stream().map(x -> x +1)
         .forEach(s -> System.out.println(s));
3. reduce
   number.stream()
         .filter(s -> s % 10 == 0 )
         .reduce(0,Integer :: sum);


## TIPS

/!\ A TERMINAL OPERATION NEVER RETURN A STREAM !!!


