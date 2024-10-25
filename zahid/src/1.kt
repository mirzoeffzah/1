fun main(){
    // Первое задание
    //task1() // Калькулятор
    // Второе задание
    //task2() // С использованием списка
    //task2_list() // Без использования списка
    // Третье задание
    task3() //Все трёхзначные числа без повтора цифр
}
fun task1() {
    print("Введите первое число: ")
    var first_number:Float = readLine()!!.toFloat()
    print("Выберите: + (сложение), - (вычитание), * (умножение), / (деление): ")
    var pes_patron:String = readLine()!!
    print("Введите второе число: ")
    var second_number:Int = readLine()!!.toInt()
    println(calculate(first_number, second_number, pes_patron))
}
fun calculate (first_number:Float, second_number:Int, pes_patron:String) :String{
    var response:String = ""
    when(pes_patron) {
        "-" -> {
            response = (first_number - second_number).toString()
        }
        "+" -> {
            response = (first_number + second_number).toString()
        }
        "*" -> {
            response = (first_number * second_number).toString()
        }
        "/" -> {
            response = (first_number / second_number).toString()
        }
        else -> "Неправильная операция"
    }
    return response
}
fun task2() {
    var max_num = Integer.MIN_VALUE
    while(true) {
        println("Введите число. Введите слово <всё> если хотите выйти:")
        val chel = readLine()!!
        if (chel == "всё") {
            println(max_num)
            break
        }
        if (chel.toInt()>= max_num)
            max_num = chel.toInt()
    }
}
fun task2_list() {
    val list_num = mutableListOf<Int>()
    println("Введите число. Введите слово <всё> если хотите выйти:")
    while (true) {
        val chel = readLine()!!
        if (chel == "всё") {
            println(list_num.maxOrNull())
            break
        }
        list_num.add(chel.toInt())
    }
}
fun task3()
{
    for (i in 1..9) {
        for (j in 0..9) {
            for (k in 0..9) {
                if (i != j && j !=k && i != k) {
                    val num = i * 100 + j * 10 + k
                    println(num)
                }
            }
        }
    }
}