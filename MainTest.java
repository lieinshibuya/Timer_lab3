package com.company;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static com.company.Main.*;
import static org.junit.Assert.*;

/**
 * Unit tests of the Main class
 */
public class MainTest {

    @Test
    public void addTimer_negative() {
        ArrayList<Integer> list_arr = new ArrayList<>();
        LinkedList<Integer> list_link = new LinkedList<>();
        int k = 10000;
        Timer result_add;
        result_add = AddTimer(list_arr, list_link, k);
        assertTrue(result_add.getT_array() > 0 && result_add.getT_link() > 0);
    }

    @Test
    public void getTimer_negative() {
        ArrayList<Integer> list_arr = new ArrayList<>();
        LinkedList<Integer> list_link = new LinkedList<>();
        int k = 10000, n = 7; Timer result_get;

        for (int i = 0; i < k; i++) {
            list_arr.add(n);
            list_link.add(n);
        }

        result_get = GetTimer(list_arr, list_link, k);
        assertTrue(result_get.getT_array() > 0 && result_get.getT_link() > 0);
    }

    @Test
    public void deletionTimer_negative() {
        ArrayList<Integer> list_arr = new ArrayList<>();
        LinkedList<Integer> list_link = new LinkedList<>();
        int k = 10000, n = 7; Timer result_del;

        for (int i = 0; i < k; i++) {
            list_arr.add(n);
            list_link.add(n);
        }
        result_del = DeletionTimer(list_arr, list_link, k);
        assertTrue(result_del.getT_array() > 0 && result_del.getT_link() > 0);
    }
}