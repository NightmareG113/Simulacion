package yate;

public class ControladorEnergia {
	public boolean chargingBateria=false;
	public boolean chargingPanel=false;
	public boolean usarBateria;
	public boolean usarPanel;
	
	Bateria Bateria1=new Bateria();
	Bateria Bateria2=new Bateria();
	Bateria Bateria3=new Bateria();
	PanelSolar Panel1=new PanelSolar();
	PanelSolar Panel2=new PanelSolar();
	
	public void chargingBateria() {
		chargingBateria=true;
		Bateria1.cargarBateria();
		Bateria2.cargarBateria();
		Bateria3.cargarBateria();
		if (Bateria1.getEnergyLevel()==100) {
			chargingPanel=false;
		}
	}
	
	public void chargingPanel() {
		chargingPanel=true;
		Panel1.cargarPanel();
		Panel2.cargarPanel();
		if (Panel1.getEnergyLevel()==100) {
			chargingPanel=false;
		}
	}
	
	public void usarBateria() {
		usarBateria=true;
		while (usarBateria==true) {
			if (Bateria1.getEnergyLevel()>0) {
				int carga=Bateria1.getEnergyLevel();
				Bateria1.setEnergyLevel(carga);
				int carga2=Bateria2.getEnergyLevel();
				Bateria1.setEnergyLevel(carga2);
				int carga3=Bateria3.getEnergyLevel();
				Bateria1.setEnergyLevel(carga3);
			}
			else {
				usarBateria=false;
			}
		}
	}
	
}
