fun main(){
    things("zebra","pen","mark","water")

    city(arrayOf("harare","mumbai","dodoma", "akarta"))

    math()

    var g=name(arrayOf("lavyne","becky","labexs"))
    println(g.contentToString())

}
fun things(l:String,x:String,y:String,z:String){
    var names= arrayOf(l,x,y,z,)
    println(names.contentToString())
}
fun city(cities:Array<String>){
    for (x in cities) {
        println(x.capitalize())
    }
}
fun math(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var y =numbers[1]+numbers[4]
    println(y)
    println(numbers[11])
    println(numbers.sortedArray().contentToString())
}
fun name(names:Array<String>) : Array<String>{
    return names

}