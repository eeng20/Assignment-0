//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner

fun main(args : Array<String>) {

    val reader = Scanner(System.`in`)
    print("Enter length and height for square, press enter after each value: ")
    var length:Double = reader.nextDouble()
    var height:Double = reader.nextDouble()
    print("Enter name for the square, press enter when finished: ")
    var name = readln()
    println("The dimensions of the square are: $length, $height")
    println("The name of the square is: $name")

    val square : Shape = Square(name)
    square.setDimensions(length, height)
    var result = square.getArea()
    println("Area for ${square.name}: $result")
    square.printDimensions()
    println()

    print("Enter radius for circle, press enter after each value: ")
    var radius:Float = reader.nextFloat()
    print("Enter name for the circle, press enter when finished: ")
    name = readln()
    val circle : Shape = Circle(name)
    println("The circle's radius is: $radius")
    println("The circle's name is: $name")
    circle.setDimensions(radius)
    result = circle.getArea()
    println("Area for circle, ${circle.name}: $result")
    circle.printDimensions()
    println()

    print("Enter three sides for a triangle, press enter after each value: ")
    var side1:Double = reader.nextDouble()
    var side2:Double = reader.nextDouble()
    var side3:Double = reader.nextDouble()
    print("Enter name for the triangle, press enter when finished: ")
    name = readln()
    println("The triangle's dimensions are: $side1, $side2, $side3")
    println("The triangle's name is: $name")
    val triangle : Shape = Triangle(name)
    triangle.setDimensions(side1, side2, side3)
    result = triangle.getArea()
    println("Area for triangle, ${triangle.name}: $result")
    triangle.printDimensions()
    println()

    print("Enter one side for an equilateral triangle, press enter after each value: ")
    var side :Double = reader.nextDouble()
    print("Enter name for the triangle, press enter when finished: ")
    name = readln()
    println("The equilateral triangle's dimensions is: $side")
    println("The equilateral triangle's name is: $name")
    val perfect : Shape = EquilateralTriangle(name)
    perfect.setDimensions(side)
    result = perfect.getArea()
    println("Area for Equilateral Triangle, ${perfect.name}: $result")
    perfect.printDimensions()
    println()

}
