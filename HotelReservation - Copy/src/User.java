
import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;
import java.text.SimpleDateFormat;
import static org.eclipse.persistence.platform.database.oracle.plsql.OraclePLSQLTypes.Int;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Psycho
 */

class User {
    private int BookID,NoofDays,Price;
    private String Firstname, Lastname, NoofPerson, CheckinDate, Specialnote, Roomtype, Roomno;
    
    public User(int BookID, String Firstname,String Lastname, String NoofPerson,String CheckinDate,int NoofDays, String Specialnote, String Roomtype, String Roomno,int Price)
    {
        this.BookID=BookID;
        this.Firstname = Firstname;
        this.Lastname= Lastname;
        this.NoofPerson=NoofPerson;
        this.CheckinDate=CheckinDate;
        this.NoofDays=NoofDays;
        this.Specialnote = Specialnote;
        this.Roomtype = Roomtype;
        this.Roomno = Roomno;
        this.Price = Price;
        
    }

    

//    User(int aInt, String string, String string0, String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    public int getBookID(){
        return BookID;
    }
    public String getFirstname(){
        return Firstname;
    }
    public String getLastname(){
        return Lastname;
    }
    public String getNoofPerson(){
        return NoofPerson;
    }
    public String getCheckinDate(){
        return CheckinDate;
    }
    public int getNoofDays(){
        return NoofDays;
    }
    public String getSpecialnote(){
        return Specialnote;
    }
    public String getRoomtype(){
        return Roomtype;
    }
    public String getRoomno(){
        return Roomno;
    }
    public int getPrice(){
        return Price;
    }
}   

