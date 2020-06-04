/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eleqstory_db;

/**
 *
 * @author danil
 */
public class Member {
    private int id;
    private String name, last_name, sex;
    
    public Member(int mId, String mName, String mLastName, String mSex) {
        this.id = mId;
        this.name = mName;
        this.last_name = mLastName;
        this.sex = mSex;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getLastName() {
        return last_name;
    }
    
    public String getSex() {
        return sex;
    }
}
