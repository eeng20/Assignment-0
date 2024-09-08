import kotlin.math.sqrt

open class Triangle(_name: String) : Shape(_name) {


    override fun getArea(): Double {
        // println("$a, $b, $c");
        var area = 0.0
        var perimeter = a+b+c
        perimeter /= 2
        area = sqrt((perimeter*(perimeter-a)*(perimeter-b)*(perimeter-c)))
        return area
    }

    override fun printDimensions() {
        println("Triangle's dimensions: $a, $b, $c")
    }

}