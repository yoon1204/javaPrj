package 도서관;
import java.util.Arrays;
import java.util.Scanner;

public class Library3{
	Scanner sc=new Scanner(System.in);
    private String[] memberIds = new String[100];
    public boolean joinId(String id) {
    	
        
        Arrays.sort(memberIds);

        
        return Arrays.binarySearch(memberIds, id) >= 0;
    }

    public void addMember(String id) {
        if (joinId(id)) {
            System.out.println("중복된 아이디입니다. \n");
        } else {
           
            memberIds[find()] = id;
            Arrays.sort(memberIds);
            System.out.println("회원 등록이 완료되었습니다. \n");
        }
    }

    private int find() {
        
        for (int i=0; i<memberIds.length; i++) {
            if (memberIds[i] == null) {
                return i;
            }
        }
        return -1;    
    }
}


