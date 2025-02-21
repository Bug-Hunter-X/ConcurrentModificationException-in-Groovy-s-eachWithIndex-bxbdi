```groovy
def myMethod(List<String> list) {
    list.eachWithIndex { String item, int index ->
        println "Item at index $index: $item"
        if (index == 1) {
            list.remove(item) //This will cause ConcurrentModificationException
        }
    }
}

List<String> myList = ['a', 'b', 'c']
myMethod(myList)
```