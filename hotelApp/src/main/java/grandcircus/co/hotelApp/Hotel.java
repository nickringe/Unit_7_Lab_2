package grandcircus.co.hotelApp;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//talks to database...this is the COLLECTION name inside the database
@Document("hotels")
public class Hotel {
	
	@Id
	private String id;
	
	@Field("hotelName") private String name;
	private String city;
	private int pricePerNight;

	public Hotel(String id, String name, String city, int pricePerNight) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.pricePerNight = pricePerNight;
	}

	public Hotel() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPricePerNight() {
		return pricePerNight;
	}

	public void setPricePerNight(int pricePerNight) {
		this.pricePerNight = pricePerNight;
	}
	
	
	
	

}
