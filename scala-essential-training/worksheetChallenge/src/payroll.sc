/*
 * @agoss
 */

//calculate the weekly paycheck for an hourly employee
object payroll {
  var rate = 10.50
  def earnings(s:Char, h:Double):String = {
    if(s != 'h') {
      if (h <= 40)
        "Weekly paycheck is: $" + h * rate
      else {
        "Weekly paycheck is: $" + (40 * rate + (h - 40) * rate * 1.5)
      }
    }
    else "This is a salaried employee" }

  println(earnings('h', 25))
  println(earnings('h', 40))
  println(earnings('s', 40))
  println(earnings('h', 45))
}