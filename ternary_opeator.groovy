//ternary operator (expression) ? true : false

def name = 'Piotr'
def isitpiotr = (name.toUpperCase() == "PIOTR") ? 'YES' : 'NO'
println isitpiotr


def msg
def output = (msg != null) ? msg : 'default message...'

def elvisOutput = msg ?: 'default message...'  (if msg is fault assign default)