Here's a list of commonly used `ArrayList` methods in Java along with their syntax and examples:

### 1. **`add(E e)`**
   - **Syntax**: `boolean add(E e)`
   - **Example**:
     ```java
     ArrayList<String> list = new ArrayList<>();
     list.add("Apple");
     System.out.println(list); // Output: [Apple]
     ```

### 2. **`add(int index, E element)`**
   - **Syntax**: `void add(int index, E element)`
   - **Example**:
     ```java
     list.add(1, "Banana");
     System.out.println(list); // Output: [Apple, Banana]
     ```

### 3. **`get(int index)`**
   - **Syntax**: `E get(int index)`
   - **Example**:
     ```java
     String fruit = list.get(0);
     System.out.println(fruit); // Output: Apple
     ```

### 4. **`set(int index, E element)`**
   - **Syntax**: `E set(int index, E element)`
   - **Example**:
     ```java
     list.set(1, "Cherry");
     System.out.println(list); // Output: [Apple, Cherry]
     ```

### 5. **`remove(int index)`**
   - **Syntax**: `E remove(int index)`
   - **Example**:
     ```java
     list.remove(1);
     System.out.println(list); // Output: [Apple]
     ```

### 6. **`remove(Object o)`**
   - **Syntax**: `boolean remove(Object o)`
   - **Example**:
     ```java
     list.remove("Apple");
     System.out.println(list); // Output: []
     ```

### 7. **`size()`**
   - **Syntax**: `int size()`
   - **Example**:
     ```java
     int size = list.size();
     System.out.println(size); // Output: 0
     ```

### 8. **`isEmpty()`**
   - **Syntax**: `boolean isEmpty()`
   - **Example**:
     ```java
     boolean empty = list.isEmpty();
     System.out.println(empty); // Output: true
     ```

### 9. **`contains(Object o)`**
   - **Syntax**: `boolean contains(Object o)`
   - **Example**:
     ```java
     list.add("Apple");
     boolean contains = list.contains("Apple");
     System.out.println(contains); // Output: true
     ```

### 10. **`addAll(Collection<? extends E> c)`**
    - **Syntax**: `boolean addAll(Collection<? extends E> c)`
    - **Example**:
      ```java
      list.addAll(Arrays.asList("Banana", "Cherry"));
      System.out.println(list); // Output: [Apple, Banana, Cherry]
      ```

### 11. **`addAll(int index, Collection<? extends E> c)`**
    - **Syntax**: `boolean addAll(int index, Collection<? extends E> c)`
    - **Example**:
      ```java
      list.addAll(1, Arrays.asList("Date", "Elderberry"));
      System.out.println(list); // Output: [Apple, Date, Elderberry, Banana, Cherry]
      ```

### 12. **`indexOf(Object o)`**
    - **Syntax**: `int indexOf(Object o)`
    - **Example**:
      ```java
      int index = list.indexOf("Banana");
      System.out.println(index); // Output: 3
      ```

### 13. **`lastIndexOf(Object o)`**
    - **Syntax**: `int lastIndexOf(Object o)`
    - **Example**:
      ```java
      list.add("Banana");
      int lastIndex = list.lastIndexOf("Banana");
      System.out.println(lastIndex); // Output: 5
      ```

### 14. **`subList(int fromIndex, int toIndex)`**
    - **Syntax**: `List<E> subList(int fromIndex, int toIndex)`
    - **Example**:
      ```java
      List<String> subList = list.subList(1, 3);
      System.out.println(subList); // Output: [Date, Elderberry]
      ```

### 15. **`iterator()`**
    - **Syntax**: `Iterator<E> iterator()`
    - **Example**:
      ```java
      Iterator<String> iterator = list.iterator();
      while (iterator.hasNext()) {
          System.out.println(iterator.next());
      }
      ```

### 16. **`listIterator()`**
    - **Syntax**: `ListIterator<E> listIterator()`
    - **Example**:
      ```java
      list.listIterator().forEachRemaining(System.out::println);
      ```

### 17. **`toArray()`**
    - **Syntax**: `Object[] toArray()`
    - **Example**:
      ```java
      Object[] array = list.toArray();
      System.out.println(Arrays.toString(array)); // Output: [Apple, Date, Elderberry, Banana, Cherry, Banana]
      ```

### 18. **`toArray(T[] a)`**
    - **Syntax**: `<T> T[] toArray(T[] a)`
    - **Example**:
      ```java
      String[] stringArray = list.toArray(new String[0]);
      System.out.println(Arrays.toString(stringArray)); // Output: [Apple, Date, Elderberry, Banana, Cherry, Banana]
      ```

### 19. **`sort(Comparator<? super E> c)`**
    - **Syntax**: `void sort(Comparator<? super E> c)`
    - **Example**:
      ```java
      list.sort(Comparator.naturalOrder());
      System.out.println(list); // Output: [Apple, Banana, Banana, Cherry, Date, Elderberry]
      ```

### 20. **`forEach(Consumer<? super E> action)`**
    - **Syntax**: `void forEach(Consumer<? super E> action)`
    - **Example**:
      ```java
      list.forEach(System.out::println);
      ```

### 21. **`stream()`**
    - **Syntax**: `Stream<E> stream()`
    - **Example**:
      ```java
      list.stream().forEach(System.out::println);
      ```

### 22. **`parallelStream()`**
    - **Syntax**: `Stream<E> parallelStream()`
    - **Example**:
      ```java
      list.parallelStream().forEach(System.out::println);
      ```

### 23. **`clone()`**
    - **Syntax**: `Object clone()`
    - **Example**:
      ```java
      ArrayList<String> clonedList = (ArrayList<String>) list.clone();
      System.out.println(clonedList); // Output: [Apple, Banana, Banana, Cherry, Date, Elderberry]
      ```

These methods allow you to perform a variety of operations on an `ArrayList`, making it a powerful and versatile tool for managing collections of data in Java.