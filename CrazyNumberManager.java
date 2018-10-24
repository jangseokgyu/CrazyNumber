public class CrazyNumberManager
{

    public static void main(String[] args) 
    {
        // 여기에 test code를 작성해서 작성한 함수를 테스트해볼 수 있습니다. 
        // 예: 
        int[] arr1 = {1, 0, 1}; 
        CrazyNumber crazy1 = new CrazyNumber(arr1, 2); 
        System.out.println(crazy1.crazy2val());    // 5 출력 
        int[] arr2 = {1, -1}; 
        CrazyNumber crazy2 = new CrazyNumber(arr2, 2);         
        System.out.println(crazy2.crazy2val());    // -1 출력 
        System.out.println(crazy1.crazy2add(crazy2).crazy2val());    // 4 출력 
    }
}
