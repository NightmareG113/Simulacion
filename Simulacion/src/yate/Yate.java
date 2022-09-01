package yate;

public class Yate {
	private Contador contador;
	private ControladorEnergia controlador;
	private Motor motor;
	
	public void encenderPaneles() {
		if (controlador.Panel1.getEnergyLevel()<100) {
			controlador.chargingPanel();
			}
		}
	
	public void cargarBaterias() {
		if (controlador.Bateria1.getEnergyLevel()<100 && motor.getVelocidad()==0) {
			controlador.chargingBateria();
		}
	}
		
	public void encenderMotor() {
		if (contador.getI()<=70) {
			motor.encenderApagarMotor();
			controlador.usarBateria();
		}
	}
}
