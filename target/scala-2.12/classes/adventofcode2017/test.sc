
val list: List[Int] = List(1, 1, 1, 1)
val listOfMap: List[Map[String, Int]]= List(Map("a" -> 1), Map("a" -> 2))

def addN(list: List[Int], n: Int) = list.map(_ + n)

listOfMap.foldLeft(list)((x, y) => addN(x, y("a")))