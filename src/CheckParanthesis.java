public class CheckParanthesis<V> {
    private String str;
    private StackUsingLList obj;
    public CheckParanthesis(String str){
        this.str = str;
        obj = new StackUsingLList();
    }
    public boolean isMatchingParanthesis(){
        if(str == null)
            return false;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                obj.push(str.charAt(i));
            }
            if(str.charAt(i) == ')'){
                if(obj.isEmpty())
                    return false;
                char c = (char) obj.pop();
               // System.out.print(c);
                if(c != '('){
                   // System.out.print("-");
                    return false;
                }
            }
            else if(str.charAt(i) == ']'){
                if(obj.isEmpty())
                    return false;
                char c = (char) obj.pop();
                // System.out.print(c);
                if(c != '['){
                    // System.out.print("-");
                    return false;
                }
            }
            else if(str.charAt(i) == '}'){
                if(obj.isEmpty())
                    return false;
                char c = (char) obj.pop();
                // System.out.print(c);
                if(c != '{'){
                    // System.out.print("-");
                    return false;
                }
            }
        }
        if(obj.isEmpty()){
            return true;
        }
        //System.out.print("-=");
        return false;
    }
    public static void main(String[] args){
        CheckParanthesis obj = new CheckParanthesis("{{{{{[[({})]]}");
        System.out.println(obj.isMatchingParanthesis());

    }
}
