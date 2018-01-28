package com.example.javatest;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 二叉树排序
 * 8,3,10,1,6,14,4,7,13
 */
public class Test {

    public static void main(String[] args) {

        BinaryTree bt = new BinaryTree();
        bt.add(8);
        bt.add(3);
        bt.add(10);
        bt.add(1);
        bt.add(6);
        bt.add(14);
        bt.add(4);
        bt.add(7);
        bt.add(13);

        bt.print();

    }

}














