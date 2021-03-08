package hw08_exception;

/**
 * Practice Task #2. 
 * Create a class Plant, which includes fields int size, Color color and Type type, and constructor where these fields are initialized. 
 * Color and type are Enum. 
 * Override the method toString(). 
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants. 
 * In the method main create an array of five plants. 
 * Check to work your exceptions.
 */

public class Plant {
	int size;
	Color color;
	Type type;
	
	Plant(){}
		
	Plant(int size, Color color, Type type) {
		this.size = size;
		this.color = color;
		this.type = type;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Type getType() {
		return type;
	}


	@Override
	public String toString() {
		return "Plant [size=" + size + ", color=" + color + ", type=" + type + "]";
	
	}

	public static void main(String[] args) throws ColorException, TypeException {

		Plant[] plants = {new Plant(32, Color.BLUE, Type.FLOWERING),
						  new Plant(16, Color.ORANGE, Type.NONFLOWERING),
						  new Plant(37, Color.GREEN, Type.FLOWERING),
						  new Plant(17, Color.VIOLET, Type.FLOWERING),
						  new Plant(73, Color.GREEN, Type.NONFLOWERING)};
		
		for(Plant p : plants) {
			System.out.println(p);
			throw new ColorException("Plant Color Exception");
//			throw new TypeException("Plant Type Exception");
		}
		
	}
}

enum Color {
	RED, ORANGE, YELLOW, GREEN, BLUE, VIOLET; 
}

enum Type {
	FLOWERING, NONFLOWERING;
}

class ColorException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ColorException(String message) {
		super(message);
		
	}			
}		


class TypeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public TypeException(String message) {
		super(message);
	}	
}
