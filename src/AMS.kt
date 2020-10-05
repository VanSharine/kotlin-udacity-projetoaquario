import java.util.*

fun main(){
    feedTheFish()
}
fun feedTheFish(){
    val day = randomDay()
    val food = fishFood(day)
    println("Hoje é $day e o peixe comeu $food")
}
fun randomDay():String{
    val week = listOf("Domingo", "Segunda","Terça","Quarta","Quinta","Sexta","Sábado")
    return week[Random().nextInt(7)]
    //return week(Random().nextInt(7))
}
fun fishFood(day:String):String{
    var food = "fasting"

    return when(day){
        "Domingo" ->  "flakes"
        "Segunda" ->  "pellets"
        "Terça"   ->  "redworms"
        "Quarta"  ->  "granules"
        "Quinta"  ->  "mosquitoes"
        "Sexta"   ->  "lettuce"
        "Sábado"  ->  "plankton"
        else -> "fasting"
    }
    /*when(day){
        "Domingo" -> food = "flakes"
        "Segunda" -> food = "pellets"
        "Terça"   -> food = "redworms"
        "Quarta"  -> food = "granules"
        "Quinta"  -> food = "mosquitoes"
        "Sexta"   -> food = "lettuce"
        "Sábado"  -> food = "plankton"
    }
    return food*/
}