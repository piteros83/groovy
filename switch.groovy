def num = 5

switch( num ) {
	case 1 :
		println "1"
		break
	case 2 :
		println "2"
		break
	case 1..3 :
		println "in rage of 1..3"
		break
	case Integer : 
		println
		break "num os an Integer"
	default :
		println "default..."
}

// in
def validAges = 18..35
def someAge = 19
println someAge in validAges