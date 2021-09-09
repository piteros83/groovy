//implicit parameter
def foo = {
    println it 
}

foo('dan')

def greet = { println it }
greet("Hello, Dan")

def noparams = { 
    println "no params..."
}

noparams(1)

def sayHello = { first, last ->
    println "hello, $first $last"
}
sayHello("Piotr","Schuetz")

def greet = { String name, String greeting = "Howdy" ->
    println "$greeting, $name"
}
greet("Piotr")

// var-arg
def concat = { String... args ->
    args.join('')
}
println concat('abc','def')

def someMethod(Closure c) {
    println "..."
    println c.maximumNumberOfParameters
    println c.parameterTypes
}

def someClosure = { int x, int y -> x+y }
someMethod(someClosure)