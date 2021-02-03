package hw03_conditional;

/*
 * Homework task 1. 
 * Read numbers of HTTP Error (400, 401, 402) and 
 * 	write the name of this error (Declare Enum HTTPError)
 */

enum HTTPError {
	E400 ("Bad Request"), 
	E401 ("Unauthorized"), 
	E403 ("Forbidden Error"), 
	E404 ("Page Not Found"), 
	E500 ("Internal Error"), 
	E503 ("Service unavailable");
	
	private String name;

	HTTPError(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
	
}

public class HTTPTest {
	
	HTTPError error;

	public HTTPTest(HTTPError error) {
		super();
		this.error = error;
	}

	public HTTPError getError() {
		return error;
	}

	public void setError(HTTPError error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "HTTPTest [error=" + error + "]";
	}
	
	public static void main(String[] args) {
		
		HTTPTest test = new HTTPTest(HTTPError.E400);
		String a = test.getError().getName();
		System.out.println(a);
		
	}
	
}


	

