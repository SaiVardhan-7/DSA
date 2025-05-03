class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int n = arr.length;
        int count1 = 0;
        int count2 = 0;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        for(int num : arr){
            if(count1==0 && ele2!=num){
                count1 = 1;
                ele1 = num;
            }
            else if(count2==0 && ele1!=num){
                count2 = 1;
                ele2 = num;
            }
            else if(ele1==num){
                count1++;
            }
            else if(ele2==num){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }

        List<Integer> list = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for(int num : arr){
            if(num==ele1){
                count1++;
            }
            else if(num==ele2){
                count2++;
            }
        }

        if(count1 > n/3){
            list.add(ele1);
        }
        if(count2 > n/3){
            list.add(ele2);
        }

        return list;
    }
}
