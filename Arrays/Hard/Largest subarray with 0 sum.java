int maxLen(int A[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int maxLen = 0;
        int prefixSum = 0; 

        for(int i = 0;i<n;i++) {
            prefixSum += A[i]; 

            if(prefixSum == 0) {
                maxLen = i + 1; 
            }
            else {
                if(map.containsKey(prefixSum)) {
                    maxLen = Math.max(maxLen, i - map.get(prefixSum)); 
                }
                else {
                    map.put(prefixSum, i); 
                }
            }
        }
        return maxLen; 
    }

