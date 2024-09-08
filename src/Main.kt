//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val triangle : Shape = Triangle("Trifecta")
    triangle.setDimensions(3.0, 4.0, 5.0)
    var result = triangle.getArea()
    println(result)

    val circle : Shape = Circle("Circus")
    circle.setDimensions(5.0f)
    result = circle.getArea()
    println(result)

    val square : Shape = Square("Squad")
    square.setDimensions(6.0, 2.0)
    result = square.getArea()
    println(result)


}
