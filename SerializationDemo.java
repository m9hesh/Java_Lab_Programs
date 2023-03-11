//13. Write a program to illustrate Serialization in java
import java.io.*;

public class SerializationDemo {
	public static void main(String[] args) {
		String filename = "person.ser";
		Person person = new Person("John Doe", 30);

		// Serialization
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(filename);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			objectOutputStream.writeObject(person);

			objectOutputStream.close();
			fileOutputStream.close();

			System.out.println("Person object serialized successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Deserialization
		try {
			FileInputStream fileInputStream = new FileInputStream(filename);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			Person deserializedPerson = (Person) objectInputStream.readObject();

			objectInputStream.close();
			fileInputStream.close();

			System.out.println("Deserialized Person object:");
			System.out.println(deserializedPerson);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person{name='" + name + "', age=" + age + "}";
	}
}
