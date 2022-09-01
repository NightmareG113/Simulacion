package yate;

public class Motor {
	private int velocidad;
	private boolean encender=false;
	private Contador contador;
	private ControladorEnergia controlador;
	
	public void encenderApagarMotor() {
		while (controlador.Bateria1.getEnergyLevel()>0) {
			if (contador.getI()<10||contador.getI()>=65) {
				encender=false;
				velocidad=0;
			}
			if (contador.getI()<30) {
				encender=true;
				controlador.usarBateria();
				velocidad=3;
			}
			if (contador.getI()>=40) {
				encender=true;
				controlador.usarBateria();
				velocidad=5;
			}
			if (contador.getI()<55) {
				encender=true;
				controlador.usarBateria();
				velocidad=1;
			}
		}
	}

	public int getVelocidad() {
		return velocidad;
	}
	
	public boolean getEncender() {
		return encender;
	}
}
