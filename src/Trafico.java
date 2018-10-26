
public class Trafico {
private int vehiculos_tunel, vehiculos_calle30;
private float v_tunel, v_superficie;
public Trafico(int vehiculos_tunel, int vehiculos_calle30, float v_tunel, float v_superficie) {
	super();
	this.vehiculos_tunel = vehiculos_tunel;
	this.vehiculos_calle30 = vehiculos_calle30;
	this.v_tunel = v_tunel;
	this.v_superficie = v_superficie;
}
public int getVehiculos_tunel() {
	return vehiculos_tunel;
}
public int getVehiculos_calle30() {
	return vehiculos_calle30;
}
public float getV_tunel() {
	return v_tunel;
}
public float getV_superficie() {
	return v_superficie;
}

}
