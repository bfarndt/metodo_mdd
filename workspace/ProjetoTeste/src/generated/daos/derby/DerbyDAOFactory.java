package generated.daos.derby;

import core.database.ConnectionProvider;
import generated.daos.DAOAbstractFactory;

import generated.daos.NoticiaDAO;

import generated.daos.AreaDePesquisaDAO;

import generated.daos.ProjetoDePesquisaDAO;

import generated.daos.SuporteDAO;

import generated.daos.LinkDAO;

import generated.daos.PublicacaoDAO;

import generated.daos.ColegaDAO;


public class DerbyDAOFactory extends DAOAbstractFactory {
    ConnectionProvider connectionProvider;
    
    public DerbyDAOFactory(ConnectionProvider connectionProvider) {
        this.connectionProvider = connectionProvider;
    }
    
    @Override

    public NoticiaDAO getNoticiaDAO() {
        NoticiaDAO dao = new DerbyNoticiaDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

    public AreaDePesquisaDAO getAreaDePesquisaDAO() {
        AreaDePesquisaDAO dao = new DerbyAreaDePesquisaDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

    public ProjetoDePesquisaDAO getProjetoDePesquisaDAO() {
        ProjetoDePesquisaDAO dao = new DerbyProjetoDePesquisaDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

    public SuporteDAO getSuporteDAO() {
        SuporteDAO dao = new DerbySuporteDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

    public LinkDAO getLinkDAO() {
        LinkDAO dao = new DerbyLinkDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

    public PublicacaoDAO getPublicacaoDAO() {
        PublicacaoDAO dao = new DerbyPublicacaoDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

    public ColegaDAO getColegaDAO() {
        ColegaDAO dao = new DerbyColegaDAO();
        dao.setConnectionProvider(connectionProvider);
        return dao;
    }

}