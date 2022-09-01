package yate;

public class PanelSolar {
	private boolean encendido;
	private int energyLevel=100;
	private  boolean charging=false;
	private int luzSolar=0;
	private Contador contador;
	
	
	public void encender() {
		this.encendido=true;
	}
	
	public void apagar() {
		this.encendido=false;
	}
	
	public boolean isEnscendido() {
		return encendido;
	}
	
	public int getEnergyLevel() {
		return energyLevel;
	}
	
	public void cargarPanel() {
		this.charging=true;
		if (contador.getI()>=15) {
			luzSolar=1;
		}
		if (contador.getI()>=45) {
			luzSolar=2;
		}
		while(energyLevel<100) {
			if (luzSolar==0) {
				energyLevel+=2;
			}
			if (luzSolar==1) {
				energyLevel+=5;
			}
			if (luzSolar==2) {
				energyLevel+=10;
			}
		}
	}

	public boolean getCharging() {
		return charging;
	}
}
