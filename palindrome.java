
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str = "Kayak";
        str = str.toLowerCase();
        boolean flag = true;
        for(int i=0;i<str.length()/2;i++){
        	if(str.charAt(i)!=str.charAt(str.length()-1-i)){
        		flag = false;
        		break;
        	}
        }
        if(flag){
        	System.out.println("Palindrame");
        }
        else{
        	System.out.println("Not Palindrome");
        }
	}

}
