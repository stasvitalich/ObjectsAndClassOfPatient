// Объясняем, как связаны объекты, классы и их свойства в ООП
// на примере карточки пациента.

class Patient {  // Создаём класс вне функции и даём классу имя.
    var name: String = "Unknown"        // В данном классе у нас есть ряд свойств.
    var gender: String = "Unknown"      // Эти свойства будут присущи всем объектам класса.
    var age: Int = 0
    var height: Double = 0.0
    var weight: Double = 0.0
    var diagnosis: String = "Unknown"
    var placeOfBirth: String = "Unknown"
}

fun main() {  // Создаём общую функцию.

    val stanislav = Patient()  // Для того чтобы обратиться к классу, через переменную создаём объект.
    stanislav.name = "Stanislav"  // Присваеваем каждому свойству объекта своё значение согласно типу данных,
    stanislav.gender = "Male"     // который был объявлен нами ранее при создании класса.
    stanislav.age = 28
    stanislav.height = 180.0
    stanislav.weight = 84.5
    stanislav.diagnosis = "Helminths"
    stanislav.placeOfBirth = "Marushka"

    val daria = Patient()  // Заводим "карточку" на второго пациента, через создание нового объекта.
    daria.name = "Daria"
    daria.gender = "Female"
    daria.age = 24
    daria.height = 172.0
    daria.weight = 62.5
    daria.diagnosis = "Cold hands"
    daria.placeOfBirth = "Shipunovo"

    println(  // Выводим на экран интересующие нас данные по любому из пациентов.
        "${stanislav.name}: ${stanislav.gender}, ${stanislav.age}, ${stanislav.height}, " +
                "${stanislav.weight}, ${stanislav.diagnosis}, ${stanislav.placeOfBirth}"
    )

    println(
        "${daria.name}: ${daria.gender}, ${daria.age}, ${daria.height}, ${daria.weight}, " +
                "${daria.diagnosis}, ${daria.placeOfBirth}"
    )
}