
def a = 1 
def b = 2

println a.plus(b)

def s1 = "Hello"
def s2 = ", World \n"

print s1.plus(s2)

// ================================================================

class Account {

    BigDecimal balance
    Account plus( Account other ) {
        new Account( balance: this.balance + other.balance )
    }
    
    String toString(){
        "Account balance: $balance"   
    } 
}

Account savings = new Account(balance:100.00)
Account checking = new Account(balance:500.00)

println savings
println checking
println savings + checking

// ==================================================================

class Account {

    BigDecimal balance = 0.0
    String type // checking savings
    
    
    BigDecimal deposit(BigDecimal amount){
        balance += amount
    }
    
    BigDecimal withdraw(BigDecimal amount){
        balance -= amount
    }
    
    BigDecimal plus(Account account){
        this.balance + account.balance
    }
}    
    
Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println checking
println savings

BigDecimal total = checking + savings
println total



String name = "Piotr"
String msg = "Hello " + name + "..." //java mode
println msg

String msg2 = "Hello $[name]"
println msg2

//evaluating expressions in strings
String msg3 = "We can evaluate expressions here: ${1 + 1}"
println msg3    

// long string
def aLargeMsg = """
A 
Msg
goes
here and
keeps going ${1 +1}
"""
// or ''' with expressions

def folder = $/C:\groovy\foo\bar/$
println folder

// find | match
import java.util.regex.*;
def text = "origin/release/PI-7" //true
def pattern = ~/PI-78888/
def finder = text =~ pattern
def matcher = text ==~ pattern

println finder
println finder.size()
println matcher

//if( matcher ) {
//do something}

def text = "jestem fanem Stoczni Gdansk" //true
def pattern = ~/Stoczni Gdansk/

text = text.replaceFirst(pattern,"Podhale Nowy Targ")




for( int x = 1; x <= 10; ++x) {
    print "${x} \n"
}

println ""


for ( int y = 10; y >= 1; --y) {
    print y
}


def letters = ['a','b','c']
for( int i = 0; i < letters.size(); ++i) {
    print letters[i]
}


Range r = 1..10
println r
println r.from
println r.to


assert (0..10).contains(0)
assert (0..10).contains(10)
assert (0..<10).contains(0)


Date today = new Date()
Date oneWeekAway = today + 7 //
println today
println oneWeekAway

Range days = today..oneWeekAway
println days 


Range letters = 'a'..'z'
println letters
    

def nums = [1,2,3,4,5,6,7,8,9]
println nums
// add | remove | get | clear
nums.push(99) // add to list 99
println "\n"
nums.putAt(0,77) //put at first number 77
nums[0]=78
nums << 988 // add to list 988
//print nums + [3,4,6]
nums.pop() //remove last
println nums
nums.removeAt(0)
def newList = nums - 3
println nums
println newList
println nums[4]
println nums.getAt(0..3) // get from range
nums.clear()

for(x in nums) {
    println x
}

//flatten

nums << [3,5,6]
nums << [1,2]
println nums
println nums.flatten()
println nums.unique()


def numbers = [1,2,3,4,5,6,6,7,8,4,3,6,6,3,2,2,6] as SortedSet
println numbers 


//########################################### HashMaps
def map = [:]
println map
println map.getClass().getName()

def person = [first:"Piotr",last:"Schuetz",'email address':"piotr.schuetz@inbox.com"]
println person
println person.first

person.twitter = "@ziomeknatwiterze"
println person

def emailKey = "EmailAddress"
def twitter = [first:"Piotr",last:"Schuetz",(emailKey):"piotr.schuetz@inbox.com"]

println person.size()
println person.sort()

//looping through person
for(  entry in person ) {
    println entry
}

for( key in person.keySet()) {
    println "$key:${person[key]}"
}

//########################excercise ranges

enum Days {
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}

def dayRange = Days.Monday..Days.Saturday

//for in loop
for( day in dayRange ){
    println day
}

dayRange.each { day ->
    println day
}

println dayRange.size()
println dayRange.contains(Days.Wednesday)
println dayRange.from
println dayRange.to

//########################excercise lists

def days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"]
println days
println days.size()
days.pop()
println days
days << "Saturday"
println days
println days[3]

//########### clousures
List nums = [1,4,7,4,30,2]
nums.each { num ->
    println number
}


//clousures are objects & last param
def timesTen(num,closure) {
    closure(num * 10)
}

timesTen(10, { println it })
timesTen(2) {
    println it
}

10.times {
    println it
}

import java.util.Random

Random rand = new Random() 

3.times {
    println rand.NextInt()
}