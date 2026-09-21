
// Numeric Data-Type :
fun main(){
    // Data-Types the kotlin compiler which kind of data we are going to store in the variable.
    // Like numbers,strings or booleans etc.
    var customer:Int=12
    // Now we can perform the numeric functions like addition and subtraction etc.
    // E.g :
    customer+=1 // Now customer is 13
    customer-=1 // customer is 12
    customer*=2 // customer is 24
    customer/=2 // customer is 12

    // We can write them as :
    // customer = customer opr val
    // E.g :
    customer = customer + 1 // customer is 13
    customer = customer - 1 // customer is 12
    customer = customer % 2 // customer is 0
    println(customer)

    // Now let's talk about the dtypes in kotlin used to store numeric values :

    val byte: Byte = 17 // It takes 8 bits of space in the memory. It can store values : -128 → 127
 	val temperature: Short = 25  // It takes 16 bits of space in the memory. It can store values : -32,768 → 32,767
    val age: Int = 17 // It is the most common and useful numeric dtype. It takes 32 bits of space in memory.
    // It can store values : -2,147,483,648 → 2,147,483,647
    val population: Long = 8000000000L // It takes 64 bits of space in memory. It can store values : -9,223,372,036,854,775,808
        ↓
 9,223,372,036,854,775,807
}


