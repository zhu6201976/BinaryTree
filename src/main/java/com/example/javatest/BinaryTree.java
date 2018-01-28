package com.example.javatest;

/**
 * 二叉树结构
 * Created by My on 2018/1/28.
 */

public class BinaryTree {
    private Node root;

    public void add(int data) {
        if (this.root == null) {
            this.root = new Node(data);
        } else {
            this.root.addNode(data);
        }
    }

    public void print() {
        if (this.root != null) {
            this.root.printNode();
        }
    }

    private class Node {
        private int data;
        private Node left;
        private Node right;

        private Node(int data) {
            this.data = data;
        }

        private void addNode(int data) {
            if (this.data > data) {
                if (this.left == null) {
                    this.left = new Node(data);
                } else {
                    this.left.addNode(data);
                }
            } else {
                if (this.right == null) {
                    this.right = new Node(data);
                } else {
                    this.right.addNode(data);
                }
            }

        }

        private void printNode() {
            if (this.left != null) {
                this.left.printNode();
            }
            System.out.print(this.data + "-->");
            if (this.right != null) {
                this.right.printNode();
            }
        }
    }
}
