package ojeador;

import java.util.Date;

public class Ojeo {
	private String comentarios,clubActual;
	private Date fecha;
	private double costoPase;
	
	public Ojeo () {
		
	}
	
	

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}



	public void setClubActual(String clubActual) {
		this.clubActual = clubActual;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public void setCostoPase(double costoPase) {
		this.costoPase = costoPase;
	}



	public String getComentarios() {
		return comentarios;
	}

	public String getClubActual() {
		return clubActual;
	}

	public Date getFecha() {
		return fecha;
	}

	public double getCostoPase() {
		return costoPase;
	}

	
	
}
