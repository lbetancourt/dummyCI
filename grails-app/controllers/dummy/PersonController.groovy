package dummy

class PersonController {

    def index() {
      render view:'index'
    }
    def hello(){
    	render "hello"
    }
    def test(){
    	def toto=null
    	println toto.length()
    }
    def test2(){
    	def toto=null
    	println toto.length()
    }
}
