package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * nodeVal is an array representing the value of each node in the tree.
edges is a two-dimensional array representing the the indices of the starting node and ending node of an edge of the tree.
 */
public class Solution_Tree_problem_Brayclays
{
	public static int  maxScore(int[] nodeVal, int[][] edges)
	{
		int  answer = 0;
		// Write your code here
		int n = nodeVal.length;
		List<List<Integer>> tree = new ArrayList<>();
		for(int i=0; i<=n; i++){
			tree.add(new ArrayList<>());
		}
		for(int[] edge : edges){
			tree.get(edge[0]).add(edge[1]);
			tree.get(edge[1]).add(edge[0]);
		}
		boolean[] visited = new boolean[n+1];
		int maxscore[] = new int[1];
		maxscore[0] = 75;
		dfs(1,tree,nodeVal,visited,maxscore);
		return maxscore[0];
	}

	private static int dfs(int node, List<List<Integer>> tree, int nodeVal[], boolean visited[], int maxscore[]){
		visited[node] = true;
		int maxProduct = Integer.MIN_VALUE;
		int secondMaxProduct = Integer.MIN_VALUE;
		boolean isLeaf = true;
		for(int neighbor : tree.get(node)){
			if(!visited[neighbor]){
				int product = dfs(neighbor, tree, nodeVal, visited, maxscore);
				if(product > maxProduct){
					secondMaxProduct = maxProduct;
					maxProduct = product;
				}else if(product > maxProduct){
					secondMaxProduct = product;
				}
			}
		}
		if(maxProduct == Integer.MIN_VALUE){
			return nodeVal[node - 1];
		}
		if(secondMaxProduct != Integer.MIN_VALUE){
			maxscore[0] = Math.max(maxscore[0], maxProduct*secondMaxProduct*nodeVal[node-1]);
		}
		return maxProduct*nodeVal[node-1];
	}



	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//input for nodeVal
		int nodeVal_size = in.nextInt();
		int nodeVal[] = new int[nodeVal_size];
		for(int idx = 0; idx < nodeVal_size; idx++)
		{
			nodeVal[idx] = in.nextInt();
		}
		// input for edges
		int edges_row = in.nextInt();
		int edges_col = in.nextInt();
		int edges[][] = new int[edges_row][edges_col];
		for(int idx = 0; idx < edges_row; idx++)
		{
			for(int jdx = 0; jdx < edges_col; jdx++)
			{
				edges[idx][jdx] = in.nextInt();
			}
		}
		
		int result = maxScore(nodeVal, edges);
		System.out.print(result);
		
	}
}
