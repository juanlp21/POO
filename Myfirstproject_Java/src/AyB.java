
public class AyB {
	class A
	{
	    B obj;
	     
	    // Constructor parametrizado con el objeto de B
	    // como un par�metro
	    A(B obj)
	    {
	        this.obj = obj;
	        
	     // llamando al m�todo display de class B
	        obj.display();
	    }
	     
	}
	 
	static class B
	{
	    int x = 5;
	     
	    //Constructor predeterminado que crea un objeto de A
	    //pasando 'this' como un argumento en el constructor
	    B()
	    {
	        new A(this);
	    }
	     
	    // m�todo para mostrar el valor de x
	    void display()
	    {
	        System.out.println("Valor de x en Class B: " + x);
	    }
	     
	    public static void main(String[] args) {
	        new B();
	    }
	}
}
