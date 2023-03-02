fun main(){
val human = Human("Alice Moraa",22,65)
    human.eat(5)
    println(human.weight)
    human.speak("I am proud of myself")
    human.increament(1)
    println(human.age)


    //the data class part
    val user = User("Alice","alicemoraa@gmail.com","07345687",567)
    println(user.email)
    println(user.phoneNumber)

}
class Human(var name:String,var age:Int,var weight:Int){

    fun eat(foodweight:Int){
        var statement = "I am eating $foodweight kgs of food"
        ++weight
        println(statement)
    }
    fun speak (speech:String){
        var speaking = speech
        println(speaking)
    }
    fun increament(increament: Int){
        age+=increament
        println(age)
    }
}
//data class
data class User(var firstname:String,var email:String,var phoneNumber:String,var password:Int){
    }
