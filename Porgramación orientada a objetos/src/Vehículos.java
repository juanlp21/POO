class Veh�culos {
	int pasajeros;//Cantidad m�xima de personas por veh�culo
	int capacidad;//Capacidad del dep�sito de combustible
	int lp100km;// Litros que consume el veh�culo cada 100 km
	int puertas;
}
class DemoVehiculo{
	public static void main(String[]args) {
		Veh�culos VWpolo= new Veh�culos();
		Veh�culos VWtouareg= new Veh�culos();
		int rango1,rango2;
		//
		VWpolo.pasajeros=5;
		VWpolo.capacidad=40;
		VWpolo.lp100km=6;
		VWpolo.puertas=5;
		//
		VWtouareg.pasajeros=5;
		VWtouareg.capacidad=100;
		VWtouareg.lp100km=9;
		VWtouareg.puertas=5;
		//Calculo rangos
		rango1=(VWpolo.capacidad/VWpolo.lp100km)*100;
		rango2=(VWtouareg.capacidad/VWtouareg.lp100km)*100;
		//Out
		System.out.println("El VW polo tiene una capacidad de "+ VWpolo.pasajeros + " pasajeros y un rango de "+ rango1 + "kms. y tiene " + VWpolo.puertas + " puertas");
		System.out.println("El VW touareg tiene una capacidad de "+ VWtouareg.pasajeros + " pasajeros y un rango de "+ rango2 + "kms.y tiene " + VWtouareg.puertas + " puertas");
	}
}