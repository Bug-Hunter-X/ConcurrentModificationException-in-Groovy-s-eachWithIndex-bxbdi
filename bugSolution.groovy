```groovy
def myMethod(List<String> list) {
    def iterator = list.iterator()
    while (iterator.hasNext()) {
        def item = iterator.next()
        def index = list.indexOf(item)
        println "Item at index $index: $item"
        if (index == 1) {
            iterator.remove() //Safe removal using iterator
        }
    }
}

List<String> myList = ['a', 'b', 'c']
myMethod(myList)
```