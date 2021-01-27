package POJO;
// Generated Oct 21, 2020 8:36:45 AM by Hibernate Tools 4.3.1

import daos.DAO;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;




/**
 * MsgTbl generated by hbm2java
 */
@ManagedBean
@SessionScoped
public class MsgTbl  implements java.io.Serializable {


     private Integer msgId;
     private int userId;
     private String msg;

    public MsgTbl() {
    }

    public MsgTbl(int userId, String msg) {
       this.userId = userId;
       this.msg = msg;
    }
   
    public Integer getMsgId() {
        return this.msgId;
    }
    
    public void setMsgId(Integer msgId) {
        this.msgId = msgId;
    }
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getMsg() {
        return this.msg;
    }
    
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void save()
    {
        DAO pdao=new DAO();
        pdao.addMsg(this);
    }




}

