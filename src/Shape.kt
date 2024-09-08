abstract class Shape (_name : String) : Dimensionable {
    var name = _name
    var height = 0.0
    var length = 0.0
    var radius = 0.0
    open var a = 0.0
    open var b = 0.0
    open var c = 0.0

    override fun printDimensions() {
        println("Height: $height")
        println("Length: $length")
        println("Radius: $radius")
        println("a: $a")
        println("b: $b")
        println("c: $c")

    }


    open fun setDimensions(_a: Double, _b: Double, _c: Double) {
        var a = _a;
        var b = _b;
        var c = _c;
    }

    open fun getArea(): Double {
        return 0.0
    }
}