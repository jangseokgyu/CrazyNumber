public class CrazyNumberManager
{

    public static void main(String[] args) 
    {
        // ���⿡ test code�� �ۼ��ؼ� �ۼ��� �Լ��� �׽�Ʈ�غ� �� �ֽ��ϴ�. 
        // ��: 
        int[] arr1 = {1, 0, 1}; 
        CrazyNumber crazy1 = new CrazyNumber(arr1, 2); 
        System.out.println(crazy1.crazy2val());    // 5 ��� 
        int[] arr2 = {1, -1}; 
        CrazyNumber crazy2 = new CrazyNumber(arr2, 2);         
        System.out.println(crazy2.crazy2val());    // -1 ��� 
        System.out.println(crazy1.crazy2add(crazy2).crazy2val());    // 4 ��� 
    }
}
