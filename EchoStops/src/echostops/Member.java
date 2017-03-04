/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package echostops;

/**
 *
 * @author cgcv
 */
public class Member extends Person {

    private String MemberID;

    public Member(String name, String last_name, int ID, int phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
    }

    public Member(String MemberID, String name, String last_name, int ID, int phone, int age, boolean gender) {
        super(name, last_name, ID, phone, age, gender);
        this.MemberID = MemberID;
    }

    public String getMemberID() {
        return MemberID;
    }

    public void setMemberID(String MemberID) {
        this.MemberID = MemberID;
    }

    @Override
    public String toString() {
        return super.toString() + "Member{" + "MemberID=" + MemberID + '}';
    }

}
