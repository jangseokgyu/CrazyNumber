class CrazyNumber {
    private int[] numbers; 
    private int k; 

    public CrazyNumber(int[] nums, int base) {
        numbers = nums;
        k = base; 
    }

    public int crazy2val () {
      double sum = 0;
        for(int i = 0 ; i<numbers.length ; i++) {
          sum += Math.pow(k,i)*numbers[i];
        }
      return (int)sum;
    }

    public CrazyNumber crazy2add(CrazyNumber other) {
      //z1.crazy2add(z2).crazy2val() = z1.crazy2val() + z2.crazy2val()
      int leng=0;

      if(numbers.length > other.numbers.length) {
         leng = numbers.length;
         
         int[] temp2 = new int[numbers.length];
         
         for(int i=0;i<other.numbers.length;i++) {
        	 temp2[i] = other.numbers[i];
         }
         
         for(int i=numbers.length;i<other.numbers.length;i++) {
        	 temp2[i] = 0;
         }
         
         int[] temp = new int[leng];
         
         for(int i=0;i<leng;i++) {
        	 temp[i] = numbers[i] + temp2[i];
           }
         return new CrazyNumber(temp,k);
      }
      
      else {
         leng = other.numbers.length;
         
         int[] temp1 = new int[other.numbers.length];
         
         for(int i=0;i<numbers.length;i++) {
        	 temp1[i] = numbers[i];
        	 }
         
         for(int i=numbers.length;i<other.numbers.length;i++) {
        	 temp1[i] = 0;
        	 }
         
         int[] temp = new int[leng];
         
         for(int i=0;i<leng;i++) {
             temp[i] = temp1[i] + other.numbers[i];
           }
         return new CrazyNumber(temp,k);
      }
    }
    public int[] getNumbers() { return numbers; }
    public int getBase() { return k; }
    
}
