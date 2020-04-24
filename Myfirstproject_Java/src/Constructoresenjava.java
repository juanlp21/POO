
public class Constructoresenjava {
	public class ConstructoresEnJavaConEjemplos {

	}

	class MiClase {
	    int x;
	    MiClase(){ //constructor. 
	    }
	}

	class ConstructorDemo {
	    public void main(String[] args) {
	       MiClase t1= new MiClase();
	       MiClase t2= new MiClase();
	        System.out.println(t1.x + " - "+t2.x);
	    }
	}

	class MiClase2 {
	    int x;
	    MiClase2(int i){ 
	        x=i;
	    }
	}
	class ConstructorDemo2 {
	    public void main(String[] args) {
	       MiClase2 t1= new MiClase2(15);
	       MiClase2 t2= new MiClase2(28);
	        System.out.println(t1.x + " - "+t2.x);
	    }
	}
}
