/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import EmailManager.EmailManager;
import Entity.AccountMgt.AccountEntity;
import Entity.AccountMgt.AdminAccountEntity;
import Entity.AccountMgt.PurchaseEntity;
import Entity.AccountMgt.TransactionEntity;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import util.security.CryptographicHelper;


/**
 *
 * @author WangTianQi
 */
@Stateless
@LocalBean
public class AdditionalFeatureBean {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    @PersistenceContext
    private EntityManager em;
    @EJB
    private AccountMgtBean amb;

    private CryptographicHelper cryptographicHelper = CryptographicHelper.getInstanceOf();

    public String FBandGPsignin(String email, String name, String id) {
        boolean check=amb.checkAccount(email);
        System.out.print("check result: "+check);
        if (!check) {

            String first = name.split(" ")[0];
            String last = name.split(" ")[1];
            boolean result = amb.registerAccount(email, "password", first + ", " + last, "Male");
            if (result) {
                Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
                List<AccountEntity> accountList = query.getResultList();
                if (accountList == null || accountList.isEmpty()) {
                    System.out.print("Bug: account not found");
                } else {
                    AccountEntity accountEntity = accountList.get(0);
                    accountEntity.setIsMember(true);
                    
                    em.flush();
            
                    return "YES " + accountEntity.getId() + " " + accountEntity.getEmail();
                }
                
            }
            return "NO";
            
            
        }
            else{
                Query query = em.createQuery("SELECT a FROM AccountEntity AS a WHERE a.email=:email").setParameter("email", email);
            List<AccountEntity> accountList = query.getResultList();
            AccountEntity accountEntity = accountList.get(0);

            if (!accountEntity.getIsBlocked()) {
                if (!accountEntity.getIsMember()) {
                    return "LOCKED";//member locked, please activate first
                } else {
                     
                        return "YES " + accountEntity.getId() + " " + accountEntity.getEmail();//login successfully
                    } 

                }
             else {
                return "BLOCKED";//member was blocked/deleted by admin
            }
        }
    }
            
        
    
}
    

   