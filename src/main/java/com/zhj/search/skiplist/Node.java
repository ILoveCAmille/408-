package com.zhj.search.skiplist;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年07月19日 16:42
 */
public class Node {
    private int key,level;
    Node next,down,up;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public static Node getNewNode(int key, int n){
        Node[] nodes=new Node[n];
        try
        {
            for(int i=0;i<n;i++)
            {
                nodes[i].key=key;
                nodes[i].level=i;
                nodes[i].next=null;
                if(i==0) nodes[i].down=null;
                else nodes[i].down=nodes[i-1];
                if(i==n-1) nodes[i].up=null;
                else nodes[i].up=nodes[i+1];
            }
        }catch (Exception e)
        {
            System.out.println(e);
        }
        return nodes[n-1];
    }
    public Node(int key, Node next, Node down, Node up) {
        this.key = key;
        this.next = next;
        this.down = down;
        this.up = up;
    }

    public Node() {
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getDown() {
        return down;
    }

    public void setDown(Node down) {
        this.down = down;
    }

    public Node getUp() {
        return up;
    }

    public void setUp(Node up) {
        this.up = up;
    }
}
