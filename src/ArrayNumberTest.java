import java.util.ArrayList;
import java.util.Arrays; // you need this to use Arrays.asList()

public class ArrayNumberTest
{
    public static void main(String[] args)
    {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));

        //COMPLETE ME!
        ArrayList<Integer> newNums = new ArrayList<Integer>();
        for (int i = 1; i < nums.size() - 1; i++)
        {
            int tempNum = nums.get(i) + nums.get(i + 1);
            newNums.add(tempNum);
        }
        newNums.add(nums.get(nums.size() - 2));
        newNums.add(nums.get(nums.size() - 1));

        System.out.println(nums);
        System.out.println(newNums);
    }
}

