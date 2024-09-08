//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val triangle : Shape = Triangle("hello")
    triangle.setDimensions(3.0, 4.0, 5.0)
    var result = triangle.getArea()
    println(result)
}
