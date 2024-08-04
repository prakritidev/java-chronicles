package graphquestions;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Provinves
 */
public class Provinves {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();

        adj.add(new ArrayList<Integer>());
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);

        adj.add(new ArrayList<Integer>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);

        adj.add(new ArrayList<Integer>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);
                
        Provinves ob = new Provinves();
        System.out.println(ob.numProvinces(adj,3));
    }

    private char[] numProvinces(ArrayList<ArrayList<Integer>> adj, int vertices) {
        HashSet<Integer> cache = new HashSet<>();
        Integer count = 0;
        for (ArrayList<Integer> row : adj) {
            dfs(row, cache);
        }
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'numProvinces'");
    }

    private void dfs(ArrayList<Integer> adj, HashSet<Integer> cache) {

    }
}