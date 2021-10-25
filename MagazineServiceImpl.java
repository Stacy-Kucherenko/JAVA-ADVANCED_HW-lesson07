package service.impl;

import java.util.List;

import dao.DAOException;
import dao.MagazineDAO;
import domain.Magazine;
import impl.MagazineDAOImpl;
import service.MagazineService;

public class MagazineServiceImpl implements MagazineService {
	private static MagazineService magazineService;
	private MagazineDAO magazineDAO;

	private MagazineServiceImpl() {
		this.magazineDAO = new MagazineDAOImpl();
	}

	public static MagazineService getMagazineService() {
		if (magazineService == null) {
			magazineService = new MagazineServiceImpl();
		}

		return magazineService;
	}

	@Override
	public Magazine insert(Magazine t) throws DAOException {
		return magazineDAO.insert(t);
	}

	@Override
	public List<Magazine> readAll() throws DAOException {
		return magazineDAO.readAll();
	}

	@Override
	public Magazine readByID(int id) throws DAOException {
		return magazineDAO.readByID(id);
	}

	@Override
	public boolean updateByID(Magazine t) throws DAOException {
		return magazineDAO.updateByID(t);
	}

	@Override
	public boolean delete(int id) throws DAOException {
		return magazineDAO.delete(id);
	}
}

