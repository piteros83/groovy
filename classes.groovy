class Person {
	String firstName, lastName
	def dob
	//private | protected(only in package) | public
	protected String f1, f2, f3
	private Date createdOn = new Date()
	
	static welcomeMsg = 'HELLO'
	public static final String WELCOME_MSG = 'HELLO'
	
	// local variables
	def foo() {
		String msg = "Hello"
		String firstName = "Dan"
		println "$msg, $firstName"
	}
}

println Person.welcomeMsg
println Person.WELCOME_MSG

def person = new Person()
println person.foo()

//-------------------------------------------------------
@groovy.transform.ToString
class Person {
	String first, last
	// constructor

}

Person p = new Person(first:'Dan',last:'Vega')
println p

//----------
@groovy.transform.ToString
class Person {
	String first, last
	// constructor
	Person(String fullName) {
		List parts = fullName.split(' ')
		first = parts[0]
		last = parts[1]
	
	//methods
	public void foo(String a, String b) {
		//do stuff
	}
	
	String getFullName() {
		$first $last"
	}
	
	def bar() {
	}
	
	static String doGoodWork() {
		println "doing good work..."
	}
	
	List someMethod(List numbers = [1,2,3]) {
		
	}
	
	def concat(String... args) {
		println args.length
	}
}

Person p new Person("Dan Vega")
println p

p.concat('a','b')

