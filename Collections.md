# 컬렉션 프레임 워크란?

- 다수의 데이터를 쉽고 효과적으로 처리 할 수 있는 표준화된 방법을 제공하는 클래스의 집합
- 데이터를 저장하고 자료 구조와 데이터를 처리하는 알고리즘을 구조화하여 클래스로 구현

![image](https://user-images.githubusercontent.com/69373314/191639200-f9cac9e0-9133-457c-8d24-1312d3fb89e7.png)

java.utils 패키지에 컬렉션과 관련된 인터페이스와 클래스들을 포함시켜 놓았다.

## List 컬렉션

구현체 - ArrayList, Vector, LinkedList

컬렉션은 객체 자체를 저장하는 것이 아니라 객체의 주소를 참조한다.

동일한 객체를 중복 저장할 수 있는데. 이 경우 동일한 주소가 참조된다.

List 인터페이스의 주요 crud
* list.add(T data)
* list.add(Integer index, T data)
* list.get(Integer index)
* list.remove(Integer index)
* list.remove(T data)

### ArrayList
ArrayList에 객체를 추가하면 객체가 인덱스로 관리된다. 일반 배열과 ArrayList는 
인덱스로 객체를 관리한다는 점에서 유사 하나 길이가 변할 수 있다는 것이 차이이다.

저장용량(capacity)를 초과한 객체들이 들어오면 자동적으로 저장 용량(capacity)이
늘어난다.

객체의 삽입 삭제에는 시간복잡도 O(n)을 보여주므로 좋지 않다.

Arrays.asList(T... a) 를 통해 Array to List 가 가능하다

### Vector
구성과 동작방식은 ArrayList 와 동일하나 Thread-safe 하다.

### LinkedList
추가/삭제에 이점이 있다. 검색은 ArrayList 에 비해 느리다

## Set 컬렉션
List 컬렉션은 저장 순서를 유지하지만, Set 컬렉션은 저장 순서가 유지되지 않는다.
또한 객체를 중복해서 저장할 수 없다.

구현체 - HashSet, LinkedHashSet, TreeSet

검색을 하기 위해서 반복자 Iterator 를 사용해야 한다. 혹은 Enhanced for 문을 사용한다.

### HashSet
HashSet은 객체들을 순서 없이 저장하고 동일한 객체는 중복 저장하지 않는다.
HashSet이 판단하는 동일한 객체란 꼭 같은 인스턴스를 뜻하지는 않는다.

1. Hashset은 객체를 저장하기 전에 먼저 객체의 hashCode() 메소드를 호출해서 해시코드를 얻어낸다.
2. 이미 저장되어 있는 객체들의 예시코드와 비교한다.
3. 만약 동일한 해시코드가 있다면 equals() 메서드로 두 객체를 비교해서 true 가 나오면
동일 한 객체로 판단하고 중복 저장을 하지 않는다. (기존 객체는 삭제 X)

## Map 컬렉션


