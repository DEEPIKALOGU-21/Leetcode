class Solution {
    public double[] convertTemperature(double celsius) {
        double arr[]=new double[2];
        for(int i=0;i<2;i++){
        if(i==0)
        {
            arr[i]= celsius + 273.15;
            
        }
        else
        {
            arr[i]=celsius * 1.80 + 32.00;
        }
        }
        return arr;
    }
}