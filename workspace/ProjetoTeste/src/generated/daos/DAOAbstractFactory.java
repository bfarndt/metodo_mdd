package generated.daos;


import generated.daos.NoticiaDAO;

import generated.daos.AreaDePesquisaDAO;

import generated.daos.ProjetoDePesquisaDAO;

import generated.daos.SuporteDAO;

import generated.daos.LinkDAO;

import generated.daos.PublicacaoDAO;

import generated.daos.ColegaDAO;


public abstract class DAOAbstractFactory {

    public abstract NoticiaDAO getNoticiaDAO();

    public abstract AreaDePesquisaDAO getAreaDePesquisaDAO();

    public abstract ProjetoDePesquisaDAO getProjetoDePesquisaDAO();

    public abstract SuporteDAO getSuporteDAO();

    public abstract LinkDAO getLinkDAO();

    public abstract PublicacaoDAO getPublicacaoDAO();

    public abstract ColegaDAO getColegaDAO();

}
