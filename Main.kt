import kotlin.math.*
fun main() {
//1
    val exercises: Int=13
    var exercisesSolved: Int=0
    exercisesSolved+=1
    println(exercisesSolved)
    println(exercises)
// 2
    val Age: Int = 18
    exercisesSolved += 1
    println(exercisesSolved)
    println(Age)
//3
    var averageAge: Double= 30.0
    averageAge = (averageAge+Age)/2
    exercisesSolved += 1
    println(exercisesSolved)
    println(averageAge)
//4
    val testNumber:Int=9
    val evenOdd: Double
    evenOdd=testNumber%2.0
    exercisesSolved+=1
    println(exercisesSolved)
    println(evenOdd)
//5
    var answer:Int=0
    answer+=1
    answer+=10
    answer*=10
    answer shr 3
    exercisesSolved+=1
    println(exercisesSolved)
    println(answer)
//6
    var age: Int
    age = 16
    print(age)
    age = 30
    print(age)
    exercisesSolved += 1
    println(exercisesSolved)
//7
    val a: Int = 46
    val b: Int = 10
    val answer1: Int = (a * 100) + b
    val answer2: Int = (a * 100) + (b * 100)
    val answer3: Int = (a * 100) + (b / 10)
    exercisesSolved += 1
    println(exercisesSolved)
    println(answer1)
    println(answer2)
    println(answer3)
//8
    val otvet:Double
    otvet=(5*3)-(4/(2*2))
    exercisesSolved+=1
    println(exercisesSolved)
    println(otvet)
//9
    val A:Double=21
    val B:Double=6
    val average: Double
    average=(A*B)/2
    exercisesSolved+=1
    println(exercisesSolved)
    println(average)
//10
    val fahrenheit:Double
    val celcius: Double
    celcius=(fahrenheit-32)/1.8
    exercisesSolved+=1
    println(exercisesSolved)
    println(celcius)
//11
    val position: Int = 21
    val row: Int
    val column: Int
    row = position / 8
    column= position % 8
    exercisesSolved += 1
    println(exercisesSolved)
    println(row)
    println(column)
//12
    val degrees: Double = 360.0
    val radians: Double
    radians= (degrees / 180) * PI
    exercisesSolved += 1
    println(exercisesSolved)
    println(radians)
//13
    val x1:Double
    val y1:Double
    val x2:Double
    val y2:Double
    val distance:Double
    distance=sqrt(sqr(x2-x1)+sqr(y2-y1))
    exercisesSolved+=1
    println(exercisesSolved)
    println(distance)
}