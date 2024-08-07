package com.zhj.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;

/**
 * 功能描述
 *
 * @author: scott
 * @date: 2024年08月05日 10:33
 */
public class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node ==null) return node;
        HashMap<Node,Node> visited=new HashMap<>();
        Queue<Node> queue=new ArrayDeque<>();
        queue.offer(node);
        visited.put(node,new Node(node.val,new ArrayList<>()));
        while(!queue.isEmpty())
        {
            Node n=queue.poll();
            for (Node neighbor : n.neighbors) {
                if(!visited.containsKey(neighbor))
                {
                    visited.put(neighbor,new Node(neighbor.val,new ArrayList<>()));
                    queue.offer(neighbor);
                }
                visited.get(n).neighbors.add(visited.get(neighbor));
            }
        }
        return visited.get(node);
    }
}
