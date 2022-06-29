package it.polito.tdp.Yelp.model;

import java.util.List;

import it.polito.tdp.Yelp.db.YelpDAO;

public class Model {
	
	private List<Business> businesses;
	
	public Model() {
		this.businesses = null;
	}

	public List<Business> getBusinesses() { // solo se mi servono vado a reperirli dal DAO
		if(this.businesses == null) {
			YelpDAO dao = new YelpDAO();
			this.businesses = dao.readAllBusinesses();
		}
		return businesses;
	}


}
