package oOPS;

class ObjectClass {

	String name = "Vishnu";
	int age = 21;
	int id = 101;

	@Override
	public String toString() {

		return "Student{name='" + name + "', age=" + age + "}";
	}
	
    @Override
    public int hashCode(){
        
        return id * 31;   // Simple custom hash
    }

	public static void main(String[] args) {
		ObjectClass s = new ObjectClass();

		// Calls overridden toString()
		System.out.println(s.toString());
		
		// Calls overridden hashCode()
		System.out.println(s.hashCode());
		
		// getClass()
        Object o = new String("GeeksForGeeks");
        Class c = o.getClass();
        System.out.println("Class of Object o is: "
                           + c.getName());
	}
}
