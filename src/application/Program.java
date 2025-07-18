package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao seelerDao = DaoFactory.createSellerDao();
		
		Seller seller = seelerDao.findById(3);
		
		System.out.println(seller);
	}

}
