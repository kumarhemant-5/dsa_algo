package com.sumitMalik.genericTree;

import java.util.ArrayList;

public class L1_GenericTreeIntroductionAndDataMember {

    private class Node{
        int data;
        ArrayList<Node> children = new ArrayList<>();
    }
    public static void main(String[] args) {

    }
}

/*

👉 Internal node:  A node that has at least one child.
👉 Leaf node:      A node that has no children.
👉 Root node:      The topmost node of a tree; it has no parent.
👉 Parent node:    A node that has one or more children.
👉 Ancestor:       Any node above a given node (parent, grandparent, etc.).
👉 Descendant:     Any node below a given node (child, grandchild, etc.).
👉 Sibling nodes: Nodes that have the same parent.
👉 Degree of node: Number of children a node has.

* */
