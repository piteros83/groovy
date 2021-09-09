def books = '''
	some json structure
'''

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parseText(books)

println json.books.nextBook.title


=====================

JsonSlurper slulper = new JsonSlurper()
def json = slurper.parse(new File('data/books.json'))

println json.books.currentBook
println json.books.currentBook.title
println json.books.currentBook.author.twitter