public class CountEvenDaysInAugust {
    public static void main(String[] args) {
        int evenDaysCount = 0;
        for(int day =1; day<=31;day++){
            if(day%2==0){
                evenDaysCount++;
            }
        }
        System.out.println("Number of even days in August: " + evenDaysCount);
    }
}
