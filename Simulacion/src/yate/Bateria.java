package yate;

public class Bateria {
	
	private boolean encendido;
	private int energyLevel=100;
	private boolean charging = false;
	
	public void encender() {
		encendido = true;
	}
	
	public void apagar() {
		this.encendido = false;
	}
	
	public boolean isEnscendido() {
		return encendido;
	}
	
	public int getEnergyLevel() {
		return this.energyLevel;
	}
	
	public void setEnergyLevel(int pEnergyLevel) {
		this.energyLevel= pEnergyLevel;
	}
	
	public void cargarBateria() {
		this.charging=true;
		while(energyLevel<100) {
			energyLevel+=10;
		}
		this.charging=false;
	}
	
	public boolean getCharging() {
		return charging;
	}
}
