package l05_properties

//Properties in Kotlin classes can be declared either as mutable,
// using the var keyword, or as read-only, using the val keyword.

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"




   // To use a property, simply refer to it by its name:
   fun copyAddress(address: Address): Address {
       val result = Address()
       result.name = address.name // accessors are called
       result.street = address.street
       result.city = address.city
       result.state = address.state
       result.zip = address.zip
       return result
   }

    override fun toString(): String {
        return "name='$name', street='$street', city='$city', state=$state, zip='$zip')"
    }

}

fun main() {
    val adrs = Address()
    val adrsA = Address()
    println(adrs.copyAddress(adrsA))


}









