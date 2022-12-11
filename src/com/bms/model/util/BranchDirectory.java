/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bms.model.util;

import java.util.ArrayList;

/**
 *
 * @author ashwini
 */
public class BranchDirectory {
    private ArrayList<Branch> branchdir;
    
    public BranchDirectory(){
        this.branchdir =  new ArrayList<Branch>();
    }

    public ArrayList<Branch> getBranchdir() {
        return branchdir;
    }

    public void setBranchdir(ArrayList<Branch> branchdir) {
        this.branchdir = branchdir;
    }
    
}
