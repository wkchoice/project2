package polymorphisim.format;

public class Format {
	public static void main(String[] args) {
		Word word = new Word();
		Format format = new Format();
		AstaFormat astaformat = new AstaFormat();
		EquFormat equformat = new EquFormat();

		word.print("message", format);
		word.print("message", astaformat);
		word.print("message", equformat);
	}
	
	public String getFormat(String message) {
		return " |----"+message+"---+ ";
	}
}

class AstaFormat extends Format {
	@Override
	public String getFormat(String message) {
		return super.getFormat(message).replace("-", "*");
	}
}

class EquFormat extends Format {
	@Override
	public String getFormat(String message) {
		return super.getFormat(message).replace("-", "=");
	}
}

class Word {
	public void print(String message, Format format) {
		System.out.println(format.getFormat(message));
	}
}

class Worduser {
	public static void main(String[] args) {
		Word word = new Word();
		Format format = new Format();
		AstaFormat astaformat = new AstaFormat();
		EquFormat equformat = new EquFormat();
		
		word.print("message", format);
		word.print("message", astaformat);
		word.print("message", equformat);
		
	}
}