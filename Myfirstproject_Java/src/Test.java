
public class Test {
	    int a;
	    int b;
	     
	    // Constructor predeterminado
	    Test()
	    {
	        a = 10;
	        b = 20;
	    }
	     
	    // M�todo que recibe 'this' como par�metro
	    void display(Test obj)
	    {
	        System.out.println("a = " + a + "  b = " + b);
	    }
	  
	    // M�todo que devuelve la instancia de la clase actual
	    void get()
	    {
	        display(this);
	    }
	 
	    public static void main(String[] args)
	    {
	        Test object = new Test();
	        object.get();
	    }
	}

