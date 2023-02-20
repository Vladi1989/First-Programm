package com.spase_y.my_when

fun main(){
println("Calculator")
    whileTest()
   }

fun whileTest(){
    var move = true
    while (move){
        print("\nВведите первое число: ")
        val firstNumber = readLine()!!.toIntOrNull()
        print("Введите знак: ")
        val znak = readLine()
        print("Введите второе число: ")
        val secondNumber = readLine()!!.toIntOrNull()
        var result = 0

        if (firstNumber != null && secondNumber != null) {
            when (znak){
                "+" -> result = firstNumber + secondNumber
                "-" -> result = firstNumber - secondNumber
                "*" -> result = firstNumber * secondNumber
                "/" -> {
                    if (secondNumber != 0){
                        result = firstNumber / secondNumber
                    }
                }
            }
            if (znak == "+" || znak == "-" || znak == "*" || znak == "/" && secondNumber !=0){
                print("Результат $firstNumber$znak$secondNumber=$result ")
            }
            else if (znak == "/" && secondNumber == 0){
                print("Вы пытаетесь делить на ноль")
            }
            else println("Вы ввели неправильный знак")
        }
        else println("Вы ввели неправильные цифры")
    }

}

















fun m5(){

}

fun whleTest() {
    var per = true
    while(per){
        print("Введите команду: ")
        val newPer = readLine()
        if (newPer == "7"){
            print("Вы ввели команду 7")
            per = false
        }
        else if (newPer == "10"){
            print("Вы ввели команду 10")
            break
        }
        else {
            println("Вы ввели $newPer")
            println("Вы молодец")
        }
        print("\nЧто угодно")
    }
}











//fun main(){
//    println(task1(10))
//    println(task1(17))
//    println(task1(18))
//    println(task1(80))
//
//}
//
//fun task1(age:Int):Boolean {
//    return age > 17
//}




fun maain() {
    test(1)
}
fun test(x:Int) {
    val state = when(x){
        10 -> "Десять"
        1 -> "Один"
        3 -> {
            println("Это 3")
            "3"
        }
        else ->  {
            println("Что-то")
             "5"
        }
    }
    println(state)
}


/* Практика 1
Написать программу:
Принимаем от пользователя Имя

Если имя == 'Влад'  'Саша'  'Маша':
    Запросить ввод пароля.
    Если Имя=='Влад' && Пароль=='Влад123' или Имя=='Саша' && Пароль=='Саша123' или Имя=='Маша' && Пароль=='Маша123':
        Вывести в консоль 'Вход успешен'

    Если данные не совпали:
        Вывести в консоль 'Пароль не верный'

Если введенное имя не совпало с именами пользователей:
    Вывести в консоль 'Вы еще не зарегестрированы'
 */

/* Практика 2
У нас есть громко говорящий попугай. Параметр «час» — текущее время в часе в диапазоне 0..23.
У нас проблемы, если попугай говорит, во время до 7 или после 20.
Верните true, если у нас проблемы.
fun main parrotTrouble(talking: Boolean , hour: Int):Boolean {
 */

fun m() {
    println(caughtSpeeding(10,false))
    println(caughtSpeeding(70,false))
    println(caughtSpeeding(90,false))
    println(caughtSpeeding(10,true))
    println(caughtSpeeding(86,true))
    println(caughtSpeeding(90,true))
    }

/* Практика 4
Вы едете слишком быстро, и вас останавливает полицейский.
Напишите код для вычисления результата, закодированного как значение int:
0=нет билета, 1=маленький билет, 2=большой билет.
Если скорость равна 60 или меньше, результат равен 0.
Если скорость находится в диапазоне от 61 до 80 включительно, результат равен 1.
Если скорость 81 или больше, результат равен 2.
Если это не ваш день рождения — в этот день ваш скорость может быть на 5 выше во всех случаях.

 */
fun caughtSpeeding(speed: Int, isBirthday: Boolean ):Int {
    if (!isBirthday){
        if(speed <=60){
            return 0
        }
        else if(speed in 61..80){
            return 1
        }
        else if(speed >= 81){
            return 2
        }
    }
    else {
        if(speed -5 <=60){
            return 0
        }
        else if(speed - 5 in 61..80){
            return 1
        }
        else if(speed - 5 >= 81){
            return 2
        }


    }
    return -1
}


/* Практика 3
Когда белки собираются на вечеринку, они любят курить сигары.
Беличья вечеринка считается успешной, когда количество сигар составляет от 40 до 60 включительно.
Если только не выходные, в этом случае верхней границы количества сигар нет.
Возвращает true, если сторона с заданными значениями успешна, или false в противном случае.

Написать функцию что принимает 2 аргумента. Число, и Булеан
...
Вернуть булеан
 */




fun cigarParty(cigars: Int , isWeekend: Boolean ):Boolean {
    if(cigars in 40..60){
        return true
    }
    else if(cigars >= 40 && isWeekend){
        return true
    }
    else if(cigars < 40){
        return false
    }
    else if(cigars > 60 && !isWeekend){
        return false
    }
    return false
}

fun parrotTrouble(talking: Boolean, hour: Int):Boolean {
    if (hour <= 7 && talking || hour >= 20 && talking){
        print("У нас проблемы!")
        return true
    }
    else {
        print("Всё хорошо")
        return false
    }
}

fun first(){
    print("Вводите данные")
    val name = readLine()
    if (name == "Влад" || name == "Саша" || name == "Маша"){
        print("Введите пароль")
        val password = readLine()
        if (name == "Влад" && password == "Влад123" ||
            name == "Саша" && password == "Саша123" ||
            name == "Маша" && password == "Маша123"){
            print("Вход успешен")
        }
        else {
            print("Пароль не верный")
        }
    }
    else {
        print("Вы еще не зарегестрированы")

    }
}

