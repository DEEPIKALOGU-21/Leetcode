class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String>num=new ArrayList<>();
        

        for(int i=1;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                num.add("FizzBuzz");
            }
            else if(i%5==0)
            {
                num.add("Buzz");
            }
            else if(i%3==0)
            {
                num.add("Fizz");
            }
            else
            {
                num.add(String.valueOf(i));  
            }
        

        }
        return num;
    }
}