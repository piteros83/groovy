// exceptions

public void foo() throws Exception {
	throw new Exception()
}

def foo() {
	// do stuff
	throw new Exceptions("Foo exception")
}

List log = []

try {
 foo()
} catch( Exception e ) {
	log << e.message
} finally {
	log << 'finally'
}

println log


try {
	//do stuff
} catch( FileNotFoundException | NullPointerException e ) {
	println e.class.name
	println e.message
}