package ojeador;

import java.util.Date;

public class Ojeo {
	private String comentarios,clubActual;
	private Date fecha;
	private double costoPase;
	
	public Ojeo () {
		
	}
	
	public Ojeo(String comentarios, String clubActual, Date fecha, double costoPase) {
		this.comentarios = comentarios;
		this.clubActual = clubActual;
		this.fecha = fecha;
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

	@Override
	public String toString() {
		return "Ojeo [comentarios=" + comentarios + ", clubActual="
				+ clubActual + ", fecha=" + fecha + ", costoPase=" + costoPase
				+ "]";
	}
	
	
}
