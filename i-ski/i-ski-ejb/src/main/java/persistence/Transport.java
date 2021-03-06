package persistence;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Transport implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private Date dateIn;
	private Date dateOut;
	private String fromP;
	private String toP;
	private String moyenTransport;
	private int nombrePlaces;
	
	@ManyToOne
	private User user;
	
	@OneToMany (mappedBy="transport")
	private List<Reservation>  reservations;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateIn() {
		return dateIn;
	}
	public void setDateIn(Date dateIn) {
		this.dateIn = dateIn;
	}
	public Date getDateOut() {
		return dateOut;
	}
	public void setDateOut(Date dateOut) {
		this.dateOut = dateOut;
	}
	public String getFromP() {
		return fromP;
	}
	public void setFromP(String fromP) {
		this.fromP = fromP;
	}
	public String getToP() {
		return toP;
	}
	public void setToP(String toP) {
		this.toP = toP;
	}
	public String getMoyenTransport() {
		return moyenTransport;
	}
	public void setMoyenTransport(String moyenTransport) {
		this.moyenTransport = moyenTransport;
	}
	public int getNombrePlaces() {
		return nombrePlaces;
	}
	public void setNombrePlaces(int nombrePlaces) {
		this.nombrePlaces = nombrePlaces;
	}
	

	public Transport() {
		super();
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<Reservation> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	
	

}
