import java.util.ArrayList;
import java.util.HashSet;

public class ArrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> nums = new HashSet<>();
		
		//Integer myInt1 = new Integer(5);
		nums.add(5);
		nums.add(5);
		nums.add(5);
		nums.add(5);
		nums.add(5);
		
		for(int num : nums) {
			System.out.println(num);
		}

	}

}
