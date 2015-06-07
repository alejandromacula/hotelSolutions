package dao;

import java.util.List;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import datos.HibernateUtil;
import datos.Usuario;
import datos.TipoDeUsuario;
public class UsuarioDao {
	
	//private ObservableList<Usuario> personData = FXCollections.observableArrayList();
	private static Session session;
	private Transaction tx;

	private void iniciaOperacion() throws HibernateException {
	session = HibernateUtil.getSessionFactory().openSession();
	tx = session.beginTransaction();
	}

	private void manejaExcepcion(HibernateException he) throws HibernateException {

		tx.rollback();
		throw new HibernateException("ERROR en la capa de acceso a datos", he);
	}

	public List<Usuario> traerListaUsuarios() throws HibernateException {
	List<Usuario> lista=null;
	try {
		iniciaOperacion();
		lista=session.createQuery("from Usuario u inner join fetch u.localidad").list();

		} finally {
			session.close();

	}

		return lista;

	}

	public Usuario traerUsuario(String nombreDeUsuario , String password) throws HibernateException {
		Usuario usuario = null;
		try {
		iniciaOperacion();
		usuario = (Usuario ) session
		.createQuery("select u from Usuario u where u.nombreDeUsuario =	:nombreDeUsuario and password=:password")
		.setParameter("nombreDeUsuario",nombreDeUsuario ).setParameter("password",password )

		.uniqueResult();
		} finally {
		session.close();
		}
		return usuario;
		}
	
	
	public Usuario traerUsuario(int idUsuario) throws HibernateException {
		Usuario usuario = null;
		try {
		iniciaOperacion();
		usuario = (Usuario ) session
		.createQuery("select u from Usuario u where u.idUsuario =	:id").setParameter("id",idUsuario ).uniqueResult();
		} finally {
		session.close();
		}
		return usuario;
		}
	
	
	public long altaUsuario(Usuario usuario) {
		long idUsuario=0;
		try {
		iniciaOperacion();
		idUsuario = Long.parseLong(session.save(usuario).toString());
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		return idUsuario;
		}
	
	
	
	public void modificarUsuario(Usuario usuario) {
		try {
		iniciaOperacion();
		session.update(usuario);
		tx.commit();
		} catch (HibernateException he) {
		manejaExcepcion(he);
		throw he;
		} finally {
		session.close();
		}
		}

	
	
}
