import java.util.ArrayList;
import java.util.Stack;


public class 从尾到头打印链表 {

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<ListNode> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        while(!stack.empty()){
            ans.add(stack.pop().val);
        }
        return ans;
    }
}
