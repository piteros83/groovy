def xml = '''
	<sports>
		<sport>
			<name>football</name>
		</sport>
	<sports>
'''

def sports = new XmlSlurper().parseText(xml)

println sports.getClass().getName()
println sports.sport.name

// ============================

def sports = new XmlSlurper().parse('data/sports.xml')

println sports
printl sports.sport[2].name