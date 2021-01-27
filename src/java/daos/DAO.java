package daos;

import POJO.MsgTbl;
import POJO.NewHibernateUtil;
import POJO.OrderTbl;
import POJO.OrdercancelTbl;
import POJO.UserInfo;
import POJO.VocList;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;



public class DAO {
     public void addAcc(UserInfo userinfo)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(userinfo);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     public List<UserInfo> validateLogin(String email, String password)
    {
        List<UserInfo> admin1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from UserInfo where email= :email and password= :password");
            query.setString("email", email);
            query.setString("password", password);
            admin1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return admin1;
    }
     public List<VocList> getbyID(int voc_id)
    {
        List<VocList> produk1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from VocList where voc_id= :voc_id");
            query.setInteger("voc_id", voc_id);
            produk1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return produk1;
    }
     
     public void addOrder(OrderTbl ordertable)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(ordertable);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     public List<OrderTbl> retrieveProduk()
    {
       
        List prod=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from OrderTbl");
            prod=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {

        }
        return prod;
    }
     
     public void deleteOrder(int order_id)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            OrderTbl prod=(OrderTbl)session.load(OrderTbl.class, new Integer(order_id));
            session.delete(prod);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     
     public void updateOrder(OrderTbl produk)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(produk);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }
     
      public List<OrderTbl> showOrder(int userId)
    {
       
        List prod=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from OrderTbl where userId= :userId");
            query.setInteger("userId", userId);
            prod=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {

        }
        return prod;
    }
       public List<OrderTbl> getbyIDorder(int orderId)
    {
        List<OrderTbl> produk1=new ArrayList();
       
         Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from OrderTbl where orderId= :orderId");
            query.setInteger("orderId", orderId);
            produk1=query.list();
            
            trans.commit();
        }
        catch(Exception e)
        {
            
        }
        return produk1;
    }
       public List<OrderTbl> showOrderbyid(int orderId)
    {
       
        List prod=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from OrderTbl where orderId= :orderId");
            query.setInteger("orderId", orderId);
            prod=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {

        }
        return prod;
    }
       
       
       public void addOrderc(OrdercancelTbl otb)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(otb);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
       
       public List<OrdercancelTbl> retrieveCancel()
    {
       
        List prod=new ArrayList();
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try
        {
            trans=session.beginTransaction();
            Query query=session.createQuery("from OrdercancelTbl");
            prod=query.list();
         
            trans.commit();
            
        }
        catch(Exception e)
        {

        }
        return prod;
    }
       
       
       public void updateOrdercancel(OrderTbl produk)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(produk);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }
       public void updateOrderapprove(OrdercancelTbl order)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.update(order);
            trans.commit();
        }
        catch(Exception e)
        {
            
        }   
    }
       public void addMsg(MsgTbl msg)
    {
        Transaction trans=null;
        Session session=NewHibernateUtil.getSessionFactory().openSession();
        try 
        {
            trans=session.beginTransaction();
            session.save(msg);
            trans.commit();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
     
}