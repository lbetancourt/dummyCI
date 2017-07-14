package dummy

class PersonController {

    def index() {
      render view:'index'
    }
    def hello(){
    	render "hello"
    }
}
