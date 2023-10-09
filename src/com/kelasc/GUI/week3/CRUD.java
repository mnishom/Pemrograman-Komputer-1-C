/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kelasc.GUI.week3;

import java.util.List;

/**
 *
 * @author LABKOM
 */
public interface CRUD {
    abstract void createData(List L);
    abstract void removeData(int id);
    abstract void updateData(List L, int id);
    abstract void deleteData(int id);
    
}
