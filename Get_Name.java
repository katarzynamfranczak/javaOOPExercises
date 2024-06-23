public class Get_Name
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class cls = Class.forName("java.lang.String");
 
		System.out.println("Class Name Associated with cls : " + cls.getName());
		System.out.println("Simple Class Name Associated with cls : " + cls.getSimpleName());
	}
}