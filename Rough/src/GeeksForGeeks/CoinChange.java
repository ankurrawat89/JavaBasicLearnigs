package GeeksForGeeks;

import java.util.Arrays;

class CoinChange
{
    static long minCoinRequired(int S[],int m, int n)
    {
        long[] table = new long[n+1];
        Arrays.fill(table, 0);   //O(n)
        for (int i=0; i<m; i++){
            for (int j=S[i]; j<=n; j++){
            	if(table[j]!=0)
            	table[j] = min(table[j],table[j-S[i]]+1);	
            	else
                table[j] = table[j-S[i]]+1;
            }
        }
        for(int i=0;i<=n;i++){
        	System.out.println(table[i]);
        }
        return table[n];
    }
    
    static long countWays(int S[],int m, int n)
    {
        long[] table = new long[n+1];
        Arrays.fill(table, 0);   //O(n)
        table[0]=1;
        for (int i=0; i<m; i++){
            for (int j=S[i]; j<=n; j++){
            	table[j] = table[j]+table[j-S[i]];	
            }
        }
        for(int i=0;i<=n;i++){
        	System.out.println(table[i]);
        }
        return table[n];
    }
    
    static long knapSack(int S[],int[] val,int m, int n)
    {
        long[][] table = new long[m+1][n+1];
        //Arrays.fill(table, 0);   //O(n)
        for (int i=1; i<=m; i++){
            for (int j=1; j<=n; j++){
            	if(j<S[i-1]){
            		table[i][j]=table[i-1][j];
            	}
            	else
            	table[i][j]=max(table[i-1][j],table[i-1][j-S[i-1]]+val[i-1]);
            }
        }
        for(int i=0;i<=m;i++){
        	for(int j=0;j<=n;j++){
        		System.out.print(table[i][j]);
        	}
        	System.out.println();
        }
        return table[m][n];
    }
    
    static long longestSubsequence(String i1[],String[] i2,int l1, int l2)
    {
        long[] table = new long[l1];
        Arrays.fill(table, 0);   //O(n)
        for (int i=0; i<l2; i++){
            for (int j=0; j<l1; j++){
            	if(i!=0){
	            	if(i1[j]==i2[i]){
	            		if(j!=0){
	            			table[j] = table[j-1]+1;
	            		}
	            		else{
	            			table[j] = table[0]+1;
	            		}
	            	}	
	            	else{
	            		if(j!=0){
	            			table[j] = max(table[j-1],table[j]);
	            		}
	            		else{
	            			table[j] = max(table[0],table[j]);
	            		}
	            	}
	            		
	            	}
            	else{
            	if(i1[j]==i2[i] || (j!=0 && table[j-1]==1)){
            		table[j]=1;
            	}
            	}
            }
        }
        for(int i=0;i<l1;i++){
        	System.out.println(table[i]);
        }
        return table[l1-1];
    }
    
    static boolean subsetProblem(int S[],int m, int n)
    {
        boolean[] table = new boolean[n+1];
        table[0]=true;
        for (int i=0; i<m; i++){
            for (int j=S[i]; j<=n; j++){
            	if(i==0 && j==S[i]){
            		table[j]=true;
            		break;
            	}
            	if(j-S[i]>=S[i]){
            		table[j] = table[j] || false;	
            	}
            	else{
            		table[j] = table[j] || (table[j-S[i]]&&true);	
            	}
            }
        }
        for(int i=0;i<=n;i++){
        	System.out.println(table[i]);
        }
        return table[n];
    }
    
    static long cuttingRod(int pLength[],int[] pCost,int rodLength)
    {
        long[] table = new long[rodLength+1];
        Arrays.fill(table, 0);   //O(n)
        for (int i=0; i<pLength.length; i++){
            for (int j=pLength[i]; j<=rodLength; j++){
	            	table[j] = max(table[j],pCost[i]+table[j-pLength[i]]);	
            }
        }
        for(int i=0;i<=rodLength;i++){
        	System.out.println(table[i]);
        }
        return table[rodLength];
    }
    static long eggFloor(int n,int k){
    	long [][] eggFloor = new long[n+1][k+1];
    	for(int j=1;j<=k;j++){
    		eggFloor[1][j]=j;
    	}
    	for(int i=1;i<=n;i++){
    		eggFloor[i][1]=1;
    		eggFloor[i][0]=0;
    	}
    	for(int i=2;i<=n;i++){
    		for(int j=i;j<=k;j++){
    			eggFloor[i][j]=1000;
    			for(int x=1;x<=j;x++){
    				long res=1+max(eggFloor[i-1][x-1],eggFloor[i][j-x]);
    				if(res<eggFloor[i][j]){
    					eggFloor[i][j]=res;
    				}
    			}
    		}
    	}
    	return eggFloor[n][k];
    }
    static int rollDie(int n,int m,int x){
    	int[][] ways=new int[n+1][x+1];
    	//Arrays.fill(ways, 0);
    	for(int j=1;j<=m;j++){
    		ways[1][j]=1;
    	}
    	for(int i=2;i<=n;i++){
    		for(int j=1;j<=x;j++){
    			for(int k=1;k<=m && k<=j;k++){
    				ways[i][j]=ways[i][j]+ways[i-1][j-k];
    			}
    		}
    	}
    	return ways[n][x];
    	
    }
    static int minimumJump(int[] availableJumps){
    	int[] actualJumps = new int[availableJumps.length];
    	int[] jumpIndexes = new int[availableJumps.length];
    	
    	for(int i=1;i<availableJumps.length;i++){
    		int temp = 100000;
    		for(int j=0;j<i;j++){
    			if(i-j<=availableJumps[j] && actualJumps[j]+1<temp){
    				temp=actualJumps[j]+1;
    				actualJumps[i] = actualJumps[j]+1;
    				jumpIndexes[i]=j;
    				}
    			}
    		}
    	for(int i=0;i<jumpIndexes.length;i++){
    		System.out.println(jumpIndexes[i]);
    	}
    	return actualJumps[availableJumps.length-1];
    	}
    	
    static long min(long a,long b){
    	return a<=b?a:b;
    }
    static long max(long a,long b){
    	return a>=b?a:b;
    }
 
    public static void main(String args[])
    {
        int arr[] = {1, 5, 6,8};
        int m = arr.length;
        int n = 11;
        System.out.println("Min coin required"+minCoinRequired(arr,m, n));
        int arr1[] = {1,2,3};
        int m1 = arr1.length;
        int n1 = 5;
        System.out.println("Total ways"+countWays(arr1,m1, n1));
        int wt[] = {1,3,4,5};
        int val[]= {1,4,5,7};
        int m2 = wt.length;
        int n2 = 7;
        System.out.println("KnapSack"+knapSack(wt,val,m2, n2));
        String input1[] = {"a","b","c","d","a","f"};
        String input2[]= {"a","c","b","c","f"};
        int input1Length = input1.length;
        int input2Length = input2.length;
        System.out.println("LOngestSusequence"+longestSubsequence(input1,input2,input1Length,input2Length));
        int arr3[] = {2,3,7,8,10};
        int m3 = arr3.length;
        int n3 = 11;
        System.out.println("Subset Present : "+subsetProblem(arr3,m3, n3));
        int pieceLength[] = {1,2,3,4};
        int pieceCost[]= {2,5,7,8};
        int rodLength = 5;
        System.out.println("Cutting Rod : "+cuttingRod(pieceLength,pieceCost,rodLength));
        System.out.println("Egg Floor : "+eggFloor(2,6));
        System.out.println("Die Roll : "+rollDie(3,6,8));
        System.out.println("Minimum Jump : "+minimumJump(new int[]{2,3,1,1,2,4,2,0,1,1}));
    }
}
