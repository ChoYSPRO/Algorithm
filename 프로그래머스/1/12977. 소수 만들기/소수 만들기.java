class Solution {
    boolean isPrime(int num){
        if(num == 2 || num == 3) return true;
        if(num % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(num); i++){
            if(num%i == 0) return false;
        }
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        int len = nums.length;
        int sum = 0;
        for(int i = 0; i < len-2; i++){
            for(int j = i+1; j < len-1; j++){
                for(int k = j +1; k < len; k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) {
                        answer++;
                        System.out.println(nums[i]);
                        System.out.println(nums[j]);
                        System.out.println(nums[k]);
                        System.out.println(sum);
                    }
                }
            }
        }
        
        

        return answer;
    }
}