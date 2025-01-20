### Stream API in Java

#### What is Stream API?
Stream API is a powerful feature introduced in Java 8 that allows you to process data in a declarative manner. It operates on a stream of data rather than storing it, which means it processes elements on-the-fly as they are available. This is different from traditional collections like `List` or `Set` that store data in memory.

#### Why Use Stream API?
- **Efficiency**: Stream API supports parallel processing, making data manipulation faster on multi-core processors.
- **Conciseness**: It allows for more readable and concise code.
- **Functional Programming**: Stream API is aligned with functional programming principles, enabling the use of lambda expressions and functional interfaces.

### Key Concepts of Stream API

#### Creating Streams
Streams can be created from different data sources like arrays, collections, or using methods like `Stream.of()` and `Stream.empty()`.

1. **From Arrays**:
   ```java
   int[] numbers = {1, 2, 3, 4, 5};
   IntStream stream = Arrays.stream(numbers);
   stream.forEach(System.out::println);
   ```

2. **From Collections**:
   ```java
   List<String> names = Arrays.asList("John", "Jane", "Jack");
   names.stream().forEach(System.out::println);
   ```

3. **Using `Stream.of()`**:
   ```java
   Stream<String> streamOfStrings = Stream.of("A", "B", "C");
   streamOfStrings.forEach(System.out::println);
   ```

4. **Using `Stream.empty()`**:
   ```java
   Stream<String> emptyStream = Stream.empty();
   emptyStream.forEach(System.out::println);  // No output
   ```

#### Stream Flow Diagram
```
Data Source → Stream → Intermediate Operations → Terminal Operations → Result
```
1. **Data Source**: Array, Collection, etc.
2. **Stream**: Pipeline of data.
3. **Intermediate Operations**: Transform the stream (e.g., `filter()`, `map()`).
4. **Terminal Operations**: Produce a result or a side effect (e.g., `collect()`, `forEach()`).

### Intermediate Operations
Intermediate operations are lazy and return a new stream. They are used to transform or filter the data.

1. **`filter()`**:
   Filters elements based on a condition.
   ```java
   List<String> names = Arrays.asList("John", "Jane", "Jack");
   names.stream()
        .filter(name -> name.startsWith("J"))
        .forEach(System.out::println);  // Outputs: John, Jane, Jack
   ```

2. **`map()`**:
   Transforms each element using a function.
   ```java
   List<String> names = Arrays.asList("John", "Jane", "Jack");
   names.stream()
        .map(String::toUpperCase)
        .forEach(System.out::println);  // Outputs: JOHN, JANE, JACK
   ```

### Terminal Operations
Terminal operations produce a result or a side effect and end the stream.

1. **`collect()`**:
   Collects the elements into a collection.
   ```java
   List<String> names = Arrays.asList("John", "Jane", "Jack");
   List<String> filteredNames = names.stream()
                                     .filter(name -> name.startsWith("J"))
                                     .collect(Collectors.toList());
   ```

2. **`forEach()`**:
   Performs an action for each element.
   ```java
   List<String> names = Arrays.asList("John", "Jane", "Jack");
   names.stream().forEach(System.out::println);
   ```

### Parallel Processing
Stream API can process data in parallel to improve performance on large datasets.

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
numbers.parallelStream().forEach(System.out::println);
```

### Optional Class
`Optional` is a container object that may or may not contain a non-null value. It helps to avoid `NullPointerException`.

#### Example:
```java
List<String> names = Arrays.asList("John", "Jane", "Jack");
Optional<String> foundName = names.stream()
                                  .filter(name -> name.startsWith("J"))
                                  .findFirst();

foundName.ifPresent(System.out::println);  // Outputs: John (if present)
```

### Best Practices
1. **Avoid Stateful Operations**: Keep the operations stateless to ensure they can be safely executed in parallel.
2. **Use Terminal Operations Wisely**: Only use terminal operations when you need to finalize the stream pipeline.
3. **Leverage Parallel Streams for Large Data**: Use parallel streams for performance gains on large datasets.

### Real-World Application
- **Data Processing**: Stream API is ideal for processing large amounts of data, such as filtering and transforming collections.
- **Batch Processing**: It can be used to batch process data, like reading lines from a file and processing them.



