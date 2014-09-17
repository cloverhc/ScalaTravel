import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object HelloScalaApp extends App {
	class Complex (real: Double, imaginary: Double) {
	  def re = real
	  def im = imaginary
	  override def toString() = (real + ", " + imaginary)   
	}
  
	def oncePerSecond(callback: () => Unit) {
	  while(true) {
	    callback()
	    Thread sleep 1000
	  }
	}
	
	def timeFiles() {
	  println("time files like an arrow...")
	}
	
//	Console.println("Hello Scala App!!!");
	val now = new Date
	val df = getDateInstance(LONG, Locale.FRANCE)
	
	Console.println(df format now)
	
	Console.println(1 + 2 * 3 / 4)
	println((1).+((2).*(3)./(4)))
	
//	oncePerSecond(() => {
//	  println("time files like an arrow...")
//	})
//	
    val complex = new Complex(1.5, 2.5)
	
	println(complex.re + ", " + complex.im);
	
	// test 1
	
	// test 2
	
	// test 3
}