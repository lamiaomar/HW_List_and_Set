fun main(args: Array<String>) {
//Part|
var cityList = mutableListOf("Riyadh","Markkh","Jeddah")
    cityList.addAll(0, listOf("Damam","Medina"))
    for (index in 0 until cityList.size){
        println("$index - ${cityList[index]}")
    }
    println("________________________")
//Part||

    var intList = mutableListOf(1,2,3,4,5)
    intList[2]=12
    intList.removeAll { x ->x.equals(12) }
    println(intList)


}