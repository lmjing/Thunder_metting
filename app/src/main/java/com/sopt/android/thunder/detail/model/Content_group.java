package com.sopt.android.thunder.detail.model;

/**
 * Created by lmjin_000 on 2015-12-19.
 */
/**
 * Created by inbiz02 on 2016-01-11.
 */
public class Content_group{
    public int groupid;
    public String groupname, groupcontents, rootid;


    public Content_group(){}

    public String getGroupcontents() {
        return groupcontents;
    }

    public String getRootid() {
        return rootid;
    }

    public void setRootid(String rootid) {
        this.rootid = rootid;
    }

    public void setGroupcontents(String groupcontents) {
        this.groupcontents = groupcontents;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public int getGroupid() {
        return groupid;
    }

    public void setGroupid(int groupid) {
        this.groupid = groupid;
    }



}