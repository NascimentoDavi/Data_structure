
# Data Structure

![GitHub commit activity](https://img.shields.io/github/commit-activity/t/NascimentoDavi/data_structure?color=violet)

This is actually only a repository where I'm storing all the knowledge I've been adquiring regarding Data Structure, one of the most import subjects when looking into the development world.

## Collections
### Linked Lists

### Set
    - It's not possible to have duplicated objects.
    - Sets can be empty
    - Cannot be infinite
    - Dinamically sized
    - Do not have any order
    - Insure Uniqueness

#### HashSet
    - Faster with modification operations
    - Do not stablish any order among the objects inserted

```java
// Printing HashSet elements using forEach
for(int hash : hashSet){
    System.out.println(hash);
}

// Printinh HashSet elements using Iterator
Iterator<Integer> iterator = hashSet.iterator();
while(iterator.hasNext()){
    System.out.println(iterator.next());
}

// Printing using toString()
System.out.println(hashSet);

// Printing turning the set into an array
Object[] hashSetToArray = hashSet.toArray();
for(int i = 0; i < hashSetToArray.length; i++){
    System.out.println(hashSetToArray[i]);
}


// Custom toString method in HashSet Class
public class CustomHashSet<E> extends HashSet<E> {

    @Override
    public String toString(){
        // Custom implementation

        StringBuilder sb = new StringBuilder();

        sb.append("CustomHashSet: [");

        for(E element : this) {
            sb.append(element.toString()).append(", ");
        }

        if(this.size() > 0){
            sb.setLength(sb.length() - 2); // remove the trailing comma and space
        }

        sb.append("]");

        return sb.toString();
    }
}
```

#### TreeSet
    - Preserve the objects natural order
    - Loses performance in Insertion and Remotion operations

## Big-O Notation
Time Complexity
- Constant Time: 
    The algorithm’s running time is independent of the input size and is the most efficient;
- Linear Time: 
        The algorithm’s running time scales linearly with the input size.

## Stable and Unstable Sort Algorithms
### Stable
A sorting algorithm is considered stable if it preserves the relative order of elements with equal keys (values); In other words, if two elements are considered equal according to the sorting criteria, a stable sort will maintain their original order as they appeared in the input list.

### Unstable
A sorting algorithm is unstable if it does not necessarily preserve the relative order of elements with equal keys (values). After sorting, elements that are considered equal may end up in a different order than they appeared in the original input.

## Sort Algorithms
- Bubble Sort: Is a simple sorting algorithm that repeatedly steps through the list to be sorted, compares each pair of adjacent items, and swaps them if they are in the wrong order. This process is repeated until the list is sorted. While is swaping the data inside the array, the first part to be sorted is the end, because the greater element, through comparissons, travel to the array's end.
### Pros
1 - Simplicity;
2 - No additional memory : in-place sorting algorithm, logically-partitioning array;
3 - Stable Sort (the relative order of equal items is kept);

### Cons
1 - Not feasible for large datasets (Quadratic time complexity);
2 - Many write operations, swaping all the time;
3 - Inefficient use of CPU;
4 - O(n²) quadratic time complexity;

Selection Sort : Divides the array into two parts: sorted and unsorted.

## Authors

- [@NascimentoDavi](https://www.github.com/NascimentoDavi)

## 🛠 Skills
Java, HTML, CSS, PHP

