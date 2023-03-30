fun main() {
var data =dataList(listOf("Gloria","Sonia","Apur","Agella","Pualine","Juliet","Mary","Lado","Kevin","Christine"))
    println(data)
    var high =people(listOf(50,40,2,44,40))
    println(high)
    var one = Vehicless("UBH",350)
    var two = Vehicless("KBU",150)
    var three= Vehicless("TYV",250)
    var four = Vehicless("UXZ",400)

    var vehicles = listOf(one,two,three,four)
    println(vehicleList(vehicles))
    sort()
}
//given a list of 10 strings, write a function
// that returns a list of the strings at even
// indices ie index 2,4,6,etc.
fun dataList(names:List<String>):List<String>{
    var newName = mutableListOf<String>()
    names.forEachIndexed { index, d ->
        if(index%2==0)
            newName.add(d)
    }
    return  newName
}
//given a list of people's heights in metres.
// Write a function that returns the average
// height and the total height
fun people(height:List<Int>):String{
    var heights = height.average()
    var y = height.sum()
    var x ="The avereage is $heights meters and the sum is $y metres"
    return x

}
//given a list of people objects, each with the
// attributes, name , age, height and weight.
// Sort the list in order of descending age.
data class PeopleList(var name:String, var age:Int,var height:Double,var weight:Int)
fun sort(){
var person1= PeopleList("Gloria",20,6.5,68)
    var person2= PeopleList("Glor",24,8.5,58)
    var totalpeople = listOf<PeopleList>(person1,person2)
    var total =totalpeople.sortedByDescending {totalpeople->totalpeople.age }
    println(total)

}

//write a function that takes in a list of car objects each
// with a registretion and mileage attribute and returns the
// average mileage of all the vehicles in the list

data class Vehicless(var registration:String, var mileage:Int)
fun vehicleList(vehicle:List<Vehicless>):Int {
    var avg = 0
    vehicle.forEach { new ->
        new.mileage
        avg += new.mileage
    }
    var totalAvg = vehicle.count()
    return totalAvg
}